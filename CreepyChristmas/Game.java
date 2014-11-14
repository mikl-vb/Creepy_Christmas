/**
 *  This class is the main class of the "World of Zuul" application. 
 *  "World of Zuul" is a very simple, text based adventure game.  Users 
 *  can walk around some scenery. That's all. It should really be extended 
 *  to make it more interesting!
 * 
 *  To play this game, create an instance of this class and call the "play"
 *  method.
 * 
 *  This main class creates and initialises all the others: it creates all
 *  rooms, creates the parser and starts the game.  It also evaluates and
 *  executes the commands that the parser returns.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 2011.08.08
 * 
 * Testing- 11.12.14
 */

public class Game 
{
    private Parser parser;
    private ParserWithFileInput parserWithFileInput;
    public static Room currentRoom;
    public static Room elevator;
    
    private PlayerHealth health;
    private int thisHealth;
        
    /**
     * Create the game and initialise its internal map.
     */
    public Game() 
    {
        
        createRooms();
        parser = new Parser();
        parserWithFileInput = new ParserWithFileInput();
        

        
        health = new PlayerHealth();
        
        
    }


    /**
     * Create all the rooms and link their exits together.
     */
    private void createRooms()
    {
        Room floor1, floor2, floor3, floor4, floor5, floor6, 
         floor7, floor8, floor9, floor10, dungeon;
      
        // create the rooms
        floor1 = new StartingRoom("The door closes after you walk in and " +
            "there are no exits. \n Grab the coal, sleigh bells, or milk and cookies" +
            "\n Commands: grab...coal, sleigh bells, milk and cookies");
        floor2 = new Room("Floor: 2");
        floor3 = new Room("Floor: 3");
        floor4 = new Room("Floor: 4");
        floor5 = new Room("Floor: 5");
        floor6 = new Room("Floor: 6");
        floor7 = new Room("Floor: 7");
        floor8 = new Room("Floor: 8");
        floor9 = new Room("Floor: 9");
        floor10 = new Room("Floor: 10...The Top...");
        elevator = new Room("The elevator... \n You take the elevator to the 5th floor.");
        dungeon = new Room("The dungeon");
        
        // initialise room exits

        floor2.setExit("upstairs", floor3);

        floor3.setExit("downstairs", floor2);
        floor3.setExit("upstairs",floor4);
        
        floor4.setExit("downstairs", floor3);
        floor4.setExit("upstairs",floor5);

        floor5.setExit("downstairs", floor4);
        floor5.setExit("upstairs", floor6);
        
        floor6.setExit("downstairs", floor5);
        floor6.setExit("upstairs", floor7);
        
        floor7.setExit("downstairs", floor6);
        floor7.setExit("upstairs", floor8);
        
        floor8.setExit("downstairs", floor7);
        floor8.setExit("upstairs", floor9);
        
        floor9.setExit("downstairs", floor8);
        floor9.setExit("upstairs", floor10);
       
        floor10.setExit("downstairs", floor9);
        
        elevator.setExit("forward", floor5);
        
        currentRoom = floor1;  // start game on first floor
        
    }
    
    /**
     *  Main play routine.  Loops until end of play.
     */
    public void play() 
    {            
        printWelcome();

        // Enter the main command loop.  Here we repeatedly read commands and
        // execute them until the game is over.
                
        boolean finished = false;
        while (! finished) {
            Command command = parser.getCommand();
            finished = processCommand(command);
        }
        System.out.println("Thank you for playing.  Good bye.");
    }
    public void playWithFileInput() 
    {            
        printWelcome();
        // Enter the main command loop.  Here we repeatedly read commands and
        // execute them until the game is over.
                
        boolean finished = false;
        while (! finished) {
            Command command = parserWithFileInput.getCommand();
            finished = processCommand(command);
        }
        System.out.println("Thank you for playing.  Good bye.");
    }
    /**
     * Print out the opening message for the player.
     */
    private void printWelcome()
    {
        System.out.println();
        System.out.println("Welcome!");
        System.out.println("You are an elf who accidently overslept...");
        System.out.println("You rush to get ready and RUN to work at Santa's workshop");
        System.out.println("...but something isn't right..");
        System.out.println("Type 'help' if you need help.");
        System.out.println();
        System.out.println(currentRoom.getLongDescription());
    }

    public void setRoom(Room pRoom){
        currentRoom = pRoom;
    }
    
    /**
     * Given a command, process (that is: execute) the command.
     * @param command The command to be processed.
     * @return true If the command ends the game, false otherwise.
     */
    private boolean processCommand(Command command) 
    {
        boolean wantToQuit = false;

        if(command.isUnknown()) {
            System.out.println("I don't know what you mean...");
            return false;
        }

        String commandWord = command.getCommandWord();
        if (commandWord.equals("help")) {
            printHelp();
        }
        else if (commandWord.equals("go")) {
            goRoom(command);
        }
        else if (commandWord.equals("quit")) {
            wantToQuit = quit(command);
        }
        else if(commandWord.equals("grab")){
            currentRoom.grab(command);
            System.out.println(currentRoom.getLongDescription());
        }
        // else command not recognised.
        return wantToQuit;
    }

    // implementations of user commands:

    /**
     * Print out some help information.
     * Here we print some stupid, cryptic message and a list of the 
     * command words.
     */
    private void printHelp() 
    {
        System.out.println("...");
        System.out.println("Print Help...");
        System.out.println();
        System.out.println("Your command words are:");
        parser.showCommands();
    }

    /** 
     * Try to in to one direction. If there is an exit, enter the new
     * room, otherwise print an error message.
     */
    private void goRoom(Command command) 
    {
        if(!command.hasSecondWord()) {
            // if there is no second word, we don't know where to go...
            System.out.println("Go where?");
            return;
        }

        String direction = command.getSecondWord();

        // Try to leave current room.
        Room nextRoom = currentRoom.getExit(direction);

        if (nextRoom == null) {
            System.out.println("There is no door!");
        }
        else {
            currentRoom = nextRoom;
            System.out.println(currentRoom.getLongDescription());
        }
    }

    /** 
     * "Quit" was entered. Check the rest of the command to see
     * whether we really quit the game.
     * @return true, if this command quits the game, false otherwise.
     */
    private boolean quit(Command command) 
    {
        if(command.hasSecondWord()) {
            System.out.println("Quit what?");
            return false;
        }
        else {
            return true;  // signal that we want to quit
        }
    }
    /**
     * 
     * private void healthDamage(){
     *   health = thisHealth - 1;
     *   System.out.println("Health Damage");
     *  }
     * 
     */
}

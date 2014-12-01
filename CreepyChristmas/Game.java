/**
 * Name of the Game: Creepy Christmas
 * Name of project team: The Dream Team
 * Team Members: Michael Van Buren, Danny Nguyen, Jeremiah Clark, Brenden Worth
 * 
 * Description: You are a slacker elf who over sleeps work one day. As you walk to the workshop, you realize something is wrong - it is a wretched looking candy cane tower. 
 *              Presented with a series of puzzles, riddles, and fights in order to reach the top level of the candy cane tower, you must not only figure out what is wrong but also how to fix it. 
 *              At the final level you discover that Santa himself has turned evil and realize that it is up to you to save Christmas. Can you be the elf that saved Christmas?
 *              
 * Features Added: We have added 5 more rooms along with a special room called Dungeon which has an elevator that can take you to a different floor in the game.
 *                 In the starting room we added 3 objects that dictate how you start the game. Each object has a different action that occurs once you choose to grab that object.
 *                 
 *                 

 */

public class Game 
{
    private Parser parser;
    private ParserWithFileInput parserWithFileInput;
    public static Room currentRoom;
    public static Room elevator;
    public static Room floor2;
    private static Room floor4;
    public static Room floor7;    
    public static Room floor8;
    public static Room floor9;
    public static Room floor10;



    private Health health;
    private int thisHealth;

    private Health playerHealth;
    private Boolean playerDied; 
    //private int thisHealth;

    private Health bossHealth1;
    private Health bossHealth2;
    private Health bossHealth3;
    private Health bossHealth4;

    private Boss1 thisBoss1;
    private Boss2 thisBoss2;
    private Boss3 thisBoss3;
    private Boss4 thisBoss4;

    /**
     * Create the game and initialise its internal map.
     */
    public Game() 
    {

        createRooms();
        parser = new Parser();
        parserWithFileInput = new ParserWithFileInput();

        playerHealth = new Health();
        bossHealth1 = new Health();
        bossHealth2 = new Health();
        bossHealth3 = new Health();
        bossHealth4 = new Health();
        thisBoss1 = new Boss1();
        thisBoss2 = new Boss2();
        thisBoss3 = new Boss3();
        thisBoss4 = new Boss4();

    }

    /**
     * create objects
     * 
     * private void createObjects(){
        Object sword, swordDamage, parcel;

        sword = new Object("A magical sword indeed...");
        //swordDamage = new Object("Damage = 3");
        //sword.setObject("sword", swordDamage);

        parcel = new Object("***parcel with important information***");
        //parcel.setObject("");
    }
     * 
     * 
     */
    

    /**
     * Create all the rooms and link their exits together.
     */
    private void createRooms()
    {
        Room floor1, floor3, floor4, floor5, floor6, 
        boss1Room, floor8, floor9, floor10, dungeon;

        // create the rooms
        floor1 = new StartingRoom("The door closes after you walk in and \n" +
            "there are no exits. \n Grab the coal, sleigh bells, or milk" +
            "\n Commands: grab... coal, bells, or  milk");

        floor2 = new Room("\n" + "Floor 2:\n Riddle Room \n" +
            "   A burst of light fades away as you come to realize that you are \n" +
            "in a new room. You look around and see large hall that you haven’t \n" +
            "noticed before, a black ceiling that seems to be slowly moving, \n" +
            "and snowflakes falling from the void above. Before you is an owl \n" +
            "whose feathers are as white as the snow around you, and the size \n" +
            "of two men");

            
        floor3 = new Room("\n" + "Floor 3:\n Raging Elf Room \n" +
            "   You walk into a room and you notice that it was the same room you \n" +
            "built many toys in. You hear sounds in a distance..... A low rumble. \n" +
            "The rumble grows louder and louder until you recognize many of the \n" +
            "elves that you work with everyday are running towards you. They look \n" +
            "strange. Their eyes are blood-shot red as if they have not slept in \n" +
            "weeks, skin is pale as snow, and streams of white foam are coming \n" +
            "from their mouths \n" +
            "\n" +
            "Commands: go upstairs or stay still ");

        floor4 = new Room("\n" + "Floor 4:\n The Sword in the Snow Room \n" +
            "   You stand up and look around. In total darkness with the exception \n" +
            "of a hole in the ceiling where a ray of light pours onto the ground. \n" +
            "In the dirt, you see something shining. You reach to pick it up, you \n" +
            "notice it is very warm and light..... It is a SWORD");

        floor5 = new Room("\n" + "Floor 5:\n Burning Christmas Tree Room \n" +
            "   Your eyes squinch as they are hit by a haze of smoke. The foul air \n" +
            "fills your lungs and you begin to cough. As you are swinging your \n" +
            "hands around and feel nothing, you hear a symphony of crackling. You \n" +
            "wipe the water from your eyes and there, behold a room full of \n" +
            "Christmas trees....... ON FIRE! \n" +
            "\n" +
            "Commands: cut trees, throw milk, run away, stay still");

        floor6 = new Room("\n" + "Floor 6:\n Raging Elf (Part 2) Room \n" +
            "   You look forward and see a grand hallway with high crystal \n" +
            "chandeliers, lined as if they were a path of stars. You take a step \n" +
            "forward until when at the end of the hall, you hear a rumbling coming \n" +
            "towards you. You pull out your sword..... Choose a move: \n" +
            "\n" +
            "Commands: slash, kick, run backwards, don't move");

        /**
         * boss1Room is the marker of the boss levels
         */ 
            
        boss1Room = new Room("\n" + "Floor 7:\n Three Headed Reindeer - Ruderus Room \n" +
            "   You step forward and hear a loud crack beneath your feet. You \n" +
            "look down to see that your foot just pressed through an elf skull. \n" +
            "This room is full of scattered elf skeletons with deep red glow \n" +
            "pulsing from the walls. You hear a deep movement from the mound in \n" +
            "front of you. You take another step and accidently crush more bones. \n" +
            "With the clinking of the bones, the mound starts moving. The mound \n" +
            "turns around and looks you face to face. \n" +
            "There, the Three-Headed Reindeer speaks..... \n" +
            "'Hello, I am Ruderus, the gatekeeper. You are my next MEAL! HAHAHA!'");

        floor8 = new Room("\n" + "Floor 8:\n Riddle Room 2 \n" +
            "Riddler: 'Hello Small One, it seems as if a certain little elf has \n" +
            "          gotten himself into a lot of trouble recently'");

        floor9 = new Room("\n" + "Floor 9:\n Ms. Sticky Clause Room \n" +
            "You smell something that reminds you of a warm Christmas morning. \n" +
            "The smell is rich, sweet, and enticing that it pulls you deeper \n" +
            "into the room. As you try to move forward, you realize that your \n" +
            "foot is caught in something sticky. You pull and pull but can't \n" +
            "seem to get it free. Finally you pull out your sword and slash the \n" +
            "vile substance and free yourself. Closely examining the substance, \n" +
            "it looked like cookie dough but smelled like rotten jingleberry. You \n" +
            "hear a hissing noise behind you. As you turn around, you see a \n" +
            "black spider-like creature whose head is the same as Mrs. Clause \n" +
            "\n" +
            "Commands: slash, kick, stay still");

        floor10 = new Room("\n" + "Final Room:\n The Top Floor..... Scary Santa \n" +
            "Taking steps slowly into the room..... Snow and presents flying in \n" +
            "different directions. \n" +
            "There, you see Santa. Possessed, with dark force powers");

        elevator = new Room("The elevator... \n You take the elevator to the 2nd floor.");
        // initialise room exits
        floor2.setExit("upstairs", floor3);
        
        floor3.setExit("downstairs", floor2);
        floor3.setExit("upstairs",floor4);

        floor4.setExit("downstairs", floor3);
        floor4.setExit("upstairs",floor5);

        floor5.setExit("downstairs", floor4);
        floor5.setExit("upstairs", floor6);

        floor6.setExit("downstairs", floor5);
        floor6.setExit("upstairs", boss1Room);

        boss1Room.setExit("downstairs", floor6);
        boss1Room.setExit("upstairs", floor8);

        floor8.setExit("downstairs", boss1Room);
        floor8.setExit("upstairs", floor9);

        floor9.setExit("downstairs", floor8);

        elevator.setExit("forward", floor2);

        currentRoom = floor1;  // start game on first floor

    }

    /**
     *  Main play routine.  Loops until end of play.
     */
    public void play() 
    {            
        printWelcome();
        playerHealth = new Health();
        playerDied = false; 
        // Enter the main command loop.  Here we repeatedly read commands and
        // execute them until the game is over.

        boolean finished = false;
        while (!finished) { 
            Command command = parser.getCommand();
            finished = processCommand(command);

            if(playerHealth.getHealth() < 1){
                playerDeath();

                if(playerHealth.getHealth() <1)
                {
                    playerDeath();
                    quit(command);

                }

            }

        }


            System.out.println("Thank you for playing.  Good bye.");
        }

    public void playWithFileInput1() 
    {            
        printWelcome();
        // Enter the main command loop.  Here we repeatedly read commands and
        // execute them until the game is over.

        boolean finished = false;
        while (! finished) {
            Command command = parserWithFileInput.getCommandForCommands1();
            finished = processCommand(command);
        }
        System.out.println("Thank you for playing.  Good bye.");

    }

    public void playWithFileInput2() 
    {            
        printWelcome();

        // Enter the main command loop.  Here we repeatedly read commands and
        // execute them until the game is over.

        boolean finished = false;
        while (! finished) {
            Command command = parserWithFileInput.getCommandForCommands2();
            finished = processCommand(command);
        }
        System.out.println("Thank you for playing.  Good bye.");

    }

    public void playWithFileInput3() 
    {            
        printWelcome();

        // Enter the main command loop.  Here we repeatedly read commands and
        // execute them until the game is over.

        boolean finished = false;
        while (! finished) {
            Command command = parserWithFileInput.getCommandForCommands3();
            if(playerHealth.getHealth() == 0)
            {
                playerDeath();
            }
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
        else if(commandWord.equals("stay")){

            if(command.getSecondWord().equals("still"))
            {
                playerDeath();
                quit(command);
            }
        }
        
        else if(commandWord.equals("kick")){

            if(command.getSecondWord().equals("ruderus"))
            {
                System.out.println();
                thisBoss1.whenKicked();
                System.out.println();
                bossHealth1.reduceHealth();
                bossHealth1.reduceHealth();
                System.out.println("You reduced Ruderus' health by 2");
                bossHealth1.printHealth();
                System.out.println();
                playerHealth.reduceHealth();
                System.out.println("Ruderus reduced your health by 1!");
                playerHealth.printPlayerHealth();
            }
            if(command.getSecondWord().equals("stickyclause"))
            {
                System.out.println();
                thisBoss2.whenKicked();
                System.out.println();
                bossHealth2.reduceHealth();
                bossHealth2.reduceHealth();
                bossHealth2.reduceHealth();
                System.out.println("You reduced Sticky Clause's health by 3");
                bossHealth2.printHealth();
                System.out.println();
                playerHealth.reduceHealth();
                System.out.println("Sticky Clause reduced your health by 1!");
                playerHealth.printPlayerHealth();

            }
            if(command.getSecondWord().equals("riddler"))
            {
                System.out.println();
                thisBoss3.whenKicked();
                System.out.println();
                bossHealth3.reduceHealth();
                bossHealth3.reduceHealth();
                bossHealth3.reduceHealth();
                bossHealth3.reduceHealth();
                System.out.println("You reduced the Riddler's health by 4");
                bossHealth3.printHealth();
                System.out.println();
                playerHealth.reduceHealth();
                System.out.println("The Riddler reduced your health by 1!");
                playerHealth.printPlayerHealth();

            }

            if(command.getSecondWord().equals("santa"))
            {
                System.out.println();
                thisBoss4.whenKicked();
                System.out.println();
                bossHealth4.reduceHealth();
                bossHealth4.reduceHealth();
                System.out.println("You reduced Santa's health by 2");
                bossHealth4.printHealth();
                System.out.println();
                playerHealth.reduceHealth();
                playerHealth.reduceHealth();
                System.out.println("Santa reduced your health by 2!");
                playerHealth.printPlayerHealth();

            }
        }

        else if(commandWord.equals("slash")){
            if(command.getSecondWord().equals("ruderus"))
            {
                System.out.println();
                thisBoss1.whenSlashed();
                System.out.println();
                bossHealth1.reduceHealth();
                bossHealth1.reduceHealth();
                bossHealth1.reduceHealth();
                bossHealth1.reduceHealth();
                System.out.println("You reduced Ruderus' health by 4");
                bossHealth1.printHealth();
                System.out.println();
                playerHealth.reduceHealth();
                System.out.println("Ruderus reduced your health by 1!");
                playerHealth.printPlayerHealth();
            }
            if(command.getSecondWord().equals("stickyclause"))
            {
                System.out.println();
                thisBoss2.whenSlashed();
                System.out.println();
                bossHealth2.reduceHealth();
                bossHealth2.reduceHealth();
                bossHealth2.reduceHealth();
                bossHealth2.reduceHealth();
                System.out.println("You reduced Sticky Clause's health by 4");
                bossHealth2.printHealth();
                System.out.println();
                playerHealth.reduceHealth();
                System.out.println("Sticky Clause reduced your health by 1!");
                playerHealth.printPlayerHealth();

            }
            if(command.getSecondWord().equals("riddler"))
            {
                System.out.println();
                thisBoss3.whenSlashed();
                System.out.println();
                bossHealth3.reduceHealth();
                bossHealth3.reduceHealth();
                bossHealth3.reduceHealth();
                bossHealth3.reduceHealth();
                System.out.println("You reduced the Riddler's health by 4");
                bossHealth3.printHealth();
                System.out.println();
                playerHealth.reduceHealth();
                System.out.println("The Riddler reduced your health by 1!");
                playerHealth.printPlayerHealth();

            }
            if(command.getSecondWord().equals("santa"))
            {
                System.out.println();
                thisBoss4.whenSlashed();
                System.out.println();
                bossHealth4.reduceHealth();
                bossHealth4.reduceHealth();
                bossHealth4.reduceHealth();
                bossHealth4.reduceHealth();
                bossHealth4.reduceHealth();
                System.out.println("You reduced Santa's health by 5");
                bossHealth4.printHealth();
                System.out.println();
                playerHealth.reduceHealth();
                playerHealth.reduceHealth();
                System.out.println("Santa reduced your health by 2!");
                playerHealth.printPlayerHealth();

            }

        }

        else if(commandWord.equals("grab")){
            if(command.getSecondWord().equals("bells")){
                System.out.println("You grabbed the sleigh bells.");

                //need to make them die and start over
                System.out.println("");
                System.out.println("The sound of the bells sound so intense,");
                System.out.println("your precious eardrums bursted and");
                System.out.println("your head exploded... YOU DIED!");
                System.out.println("");

                wantToQuit = true;
                return wantToQuit;
            }
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

    private void press(Command command)
    {

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
    public boolean quit(Command command) 
    {
        if(command.hasSecondWord()) {
            System.out.println("Quit what?");
            return false;
        }
        else {
            return true;  // signal that we want to quit
        }
    }

    public boolean playerDeath()
    {
        System.out.println("Oh dear... You are dead!");
        playerDied = true;

        return playerDied; 
    }
}

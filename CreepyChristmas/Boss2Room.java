

/**
 * Write a description of class Boss1Room here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boss2Room extends Room
{

    public Boss2 Riddler;

    
    /**
     * Constructor for objects of class SpecialRoomOffice
     */
    public Boss2Room(String description)
    {
        super(description);
        Riddler = new Boss2(); 
    }

    public void grab(Command command)
    {
        if(command.getSecondWord().equals("riddler")){
            System.out.println("");
            Room boss2Room = new Room("You are in boss 1s room.");

            Game.currentRoom = boss2Room;

            boss2Room.setExit("upstairs",Game.floor9);
            changeDescription("***Change description...?***");
        }
        
    }
    
    

}


/**
 * Write a description of class Boss1Room here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boss4Room extends Room
{

    public Boss4 santa;

    
    /**
     * Constructor for objects of class SpecialRoomOffice
     */
    public Boss4Room(String description)
    {
        super(description);
        santa = new Boss4(); 
    }

    public void grab(Command command)
    {
        if(command.getSecondWord().equals("ruderus")){
            System.out.println("");
            Room boss4Room = new Room("You are in SANTA room.");

            Game.currentRoom = boss4Room;

            changeDescription("***Change description...?***");
        }
        
    }
    
    

}
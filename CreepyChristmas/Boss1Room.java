
/**
 * Write a description of class Boss1Room here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boss1Room extends Room
{
    public Boss1 Ruderus;
    
    /**
     * Constructor for objects of class SpecialRoomOffice
     */
    public Boss1Room(String description)
    {
        super(description);
        Ruderus = new Boss1(); 
    }

    public void grab(Command command)
    {
        if(command.getSecondWord().equals("boss")){
            System.out.println("");
            Room boss1Room = new Room("You are in boss 1s room.");

            Game.currentRoom = boss1Room;

            boss1Room.setExit("upstairs",boss1Room);
            changeDescription("***Change description...?***");
        }
        
    }
    
    

}

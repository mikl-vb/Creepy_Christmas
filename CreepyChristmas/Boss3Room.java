
/**
 * Write a description of class Boss1Room here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boss3Room extends Room
{

    public Boss3 riddler;

    
    /**
     * Constructor for objects of class SpecialRoomOffice
     */
    public Boss3Room(String description)
    {
        super(description);
        riddler = new Boss3(); 
    }

    public void grab(Command command)
    {
        if(command.getSecondWord().equals("riddler")){
            System.out.println("");
            Room boss3Room = new Room("You are in boss 3s room.");

            Game.currentRoom = boss3Room;

            boss3Room.setExit("downstairs",Game.floor8);
            changeDescription("***Change description...?***");
        }
        
    }
    
    

}
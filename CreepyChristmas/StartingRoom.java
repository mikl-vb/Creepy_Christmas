import java.util.HashMap;
/**
 * Goodhue's SpecialRoomOffice
 * 
 * Adding a special capability to just one room.
 * 
 * 2013-11-15
 */
public class StartingRoom extends Room

{
    //private Room currentRoom;
    
    /**
     * Constructor for objects of class SpecialRoomOffice
     */
    public StartingRoom(String description)
    {
        super(description);
    }
    
    
    
    public void grab(Command command)
    {
        if(command.getSecondWord().equals("coal")){
            System.out.println("You grab the piece of coal and fall into a dungeon.");
            
            Room dungeon = new Room("in a dark and dusty dungeon");
            Room elevator = new Room("Elevator");
            
            //Game.currentRoom.set(dungeon);
            
            //super.setExit("north", elevator);
            
            //can't change the current room...the Room objects created temporarily
            //aren't accessing exits, etc. info from the Game class.
            //we need to make the room set to a Room set up in game class when
            //each happens.
            
            changeDescription("You found an hidden elevator which " +
                "takes you to the 5th floor");
        }
        if(command.getSecondWord().equals("bells")){
            System.out.println("You grabbed the sleigh bells.");
            
            //need to make them die and start over
            
        }
        if(command.getSecondWord().equals("milk")){
            System.out.println("You grabbed the milk and cookies.");
            
            //teleport to second floor
            //currentRoom = floor2;
            
        }
        else{
            super.grab(command);
        }
    }

    
}


/**
 * Goodhue's SpecialRoomOffice
 * 
 * Adding a special capability to just one room.
 * 
 * 2013-11-15
 */
public class StartingRoom extends Room

{
    /**
     * Constructor for objects of class SpecialRoomOffice
     */
    public StartingRoom(String description)
    {
        super(description);
        System.out.println("Please grab the coal");
    }
    
    public void press(Command command)
    {
        if(command.getSecondWord().equals("coal")){
            System.out.println("You grab the piece of coal and fall into a dungeon.");
            Room dungeon = new Room("in a dark and dusty dungeon");
            Room elevator = new Room("Elevator");
            dungeon.setExit("north", elevator);
            changeDescription("You found an hidden elevator which" +
                "takes you to the 5th floor");
        }
        else{
            super.grab(command);
        }
    }

    
}

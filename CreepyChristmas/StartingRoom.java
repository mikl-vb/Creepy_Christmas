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
            System.out.println("You press the button and part of the wall " +
                "slides open revealing a staircase.");
            Room dungeon = new Room("You are now in a dark and dusty dungeon");
            setExit("down", dungeon);
           // dungeon.setExit("forward", Game.setRoom(elevator));
            dungeon.setExit("up", this);
            changeDescription("You are in the starting room." +
                "  \nAn opening in the wall reveals a staircase leading down.");
        }
        else{
            if(command.getSecondWord().equals("bells")){
                System.out.println("You grabbed the sleigh bells.");

                //need to make them die and start over

            }
            else{
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
    }
}

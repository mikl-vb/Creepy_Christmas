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
            System.out.println("");
            Room dungeon = new Room("You fall into in a dark and dusty dungeon. " +
                    "\n There is a hidden elevator with an open door. " + 
                    "\n Walk inside if you dare.");

            Game.currentRoom = dungeon;

            dungeon.setExit("forward",Game.elevator);
            changeDescription("***Change description...?***");
        }
        else{
            if(command.getSecondWord().equals("milk")){
                System.out.println("You grabbed the milk and cookies." +
                    "\n You have teleported to the second floor.");

                Game.currentRoom = Game.floor2;

            }else{
                if(command.getSecondWord().equals("bells")){
                    System.out.println("You grabbed the sleigh bells.");

                    //need to make them die and start over
                    System.out.println("You DIED...");
                    //>>>>>>> Stashed changes

                }
                else{
                    super.grab(command);
                }

            }
        }
    }

}

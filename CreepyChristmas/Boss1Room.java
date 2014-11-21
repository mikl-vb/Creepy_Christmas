
/**
 * Write a description of class Boss1Room here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boss1Room extends Room
{
    //private Room currentRoom;

    
    /**
     * Constructor for objects of class SpecialRoomOffice
     */
    public Boss1Room(String description)
    {
        super(description);
    }

    public void grab(Command command)
    {
        if(command.getSecondWord().equals("boss")){
            System.out.println("");
            Room boss1Room = new Room("You are in the boss' room.");

            Game.currentRoom = boss1Room;

            //boss1Room.setExit("upstairs",Game.floor7);
            changeDescription("***Change description...?***");
        }
        
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
                //=======
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

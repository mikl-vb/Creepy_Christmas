import java.util.Set;
import java.util.HashMap;    
/**
 * Write a description of class Object here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Object
{
    private String description;
    private HashMap<String, Object> objects;        // stores exits of this room.

    /**
     * Create a room described "description". Initially, it has
     * no exits. "description" is something like "a kitchen" or
     * "an open court yard".
     * @param description The room's description.
     */
    public Object(String description) 
    {
        this.description = description;
        objects = new HashMap<String, Object>();

    }

    /**
     * Define an exit from this room.
     * @param direction The direction of the exit.
     * @param neighbor  The room to which the exit leads.
     */
    public void setObject(String object, Object damage) 
    {
        objects.put(object, damage);
    }

    /**
     * @return The short description of the room
     * (the one that was defined in the constructor).
     */
    public String getShortDescription()
    {
        return description;
    }

    /**
     * Return a description of the room in the form:
     *     You are in the kitchen.
     *     Exits: north west
     * @return A long description of this room
     */
    public String getLongDescription()
    {
        return description + ".\n" + getObjectString();
    }

    /**
     * Return a string describing the room's exits, for example
     * "Exits: north west".
     * @return Details of the room's exits.
     */
    private String getObjectString()
    {
        String returnString = "Objects:";
        Set<String> keys = objects.keySet();
        for(String object : keys) {
            returnString += " " + object;
        }
        return returnString;
    }

    /**
     * Return the room that is reached if we go from this room in direction
     * "direction". If there is no room in that direction, return null.
     * @param direction The exit's direction.
     * @return The room in the given direction.
     */
    public Object getDamage(String damage) 
    {
        return objects.get(damage);
    }

    public void grab(Command command)
    {
        System.out.println("Grab what?");
    }

    public void changeDescription(String newDescription)
    {
        description = newDescription;
    }
}


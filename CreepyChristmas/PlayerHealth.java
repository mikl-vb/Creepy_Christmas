
/**
 * Write a description of class PlayerHealth here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayerHealth
{
    // instance variables - replace the example below with your own
    private int health;
    private String healthDescription;

    /**
     * Constructor for objects of class Health
     */
    public PlayerHealth(){
        health = 10;
        healthDescription = getHealthDescription(health);
        
    }

    public String getHealthDescription(int health){
        switch(health) {
            case 1:
            healthDescription = "Health = 1";
            break;
            case 2:
            healthDescription = "Health = 2";
            break;
            case 3:
            healthDescription = "Health = 3";
            break;
            case 4:
            healthDescription = "Health = 4";
            break;
            case 5:
            healthDescription = "Health = 5";
            break;
            case 6:
            healthDescription = "Health = 6";
            break;
            case 7:
            healthDescription = "Health = 7";
            break;
            case 8:
            healthDescription = "Health = 8";
            break;
            case 9:
            healthDescription = "Health = 9";
            break;
            case 10:
            healthDescription = "Health = 10";
            break;
        }
        return healthDescription = "You Health level is: " + healthDescription;
    }
    
    public int getHealth(){
        return health;
    }
    
    public void setHealth(int health)
    {
        this.health = health;
    }
}

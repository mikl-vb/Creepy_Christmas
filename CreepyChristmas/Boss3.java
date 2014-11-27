
/**
 * Write a description of class Boss3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boss3 extends Boss
{
    

    /**
     * Constructor for objects of class Boss3
     */
    public Boss3()
    {
        super();
    }

    public void getBoss3Info()
    {
        System.out.println("I am boss 3 add info here....");
    }
    
    public void hitBoss(Command command)
    {
       super.hitBoss(command);
       
       System.out.println("You hit boss 3 and blah blah blah");
       playerHealth.reduceHealth();
       
    }
}

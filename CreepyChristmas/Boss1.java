
/**
 * Write a description of class Boss1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boss1 extends Boss
{
    
    
    
    /**
     * Constructor for objects of class Boss1
     */
    public Boss1()
    {
       super();
    }
    
    public void getBoss1Info()
    {
        System.out.println("I am boss 1 add info here....");
    }
    
    public void hitBoss(Command command)
    {
       super.hitBoss(command);
       
       System.out.println("You hit boss 1 and blah blah blah");
       playerHealth.reduceHealth();
       
    }
    
}

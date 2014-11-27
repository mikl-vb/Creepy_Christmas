
/**
 * Write a description of class Boss4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boss4 extends Boss
{
   

    /**
     * Constructor for objects of class Boss4
     */
    public Boss4()
    {
        super();
    }
    
    public void getBoss4Info()
    {
        System.out.println("I am boss 4 add info here....");
    }
    
    public void hitBoss(Command command)
    {
       super.hitBoss(command);
       
       System.out.println("You hit boss 4 and blah blah blah");
       playerHealth.reduceHealth();
       
    }

    
}


/**
 * Write a description of class Boss3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boss3 extends Boss
{
    private Boss Riddler;
    

    /**
     * Constructor for objects of class Boss3
     */
    public Boss3()
    {
        super();
        Riddler = new Boss();
    }

    public void getBoss3Info()
    {
        System.out.println("I am boss 3 add info here....");
    }
    
    public void kickBoss(Command command)
    {
       System.out.println("You hit boss 3 and blah blah blah");
       super.kickBoss(command);
       
       
       
       
    }
}

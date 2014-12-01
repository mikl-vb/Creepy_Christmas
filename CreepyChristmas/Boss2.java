
/**
 * Write a description of class Boss2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boss2 extends Boss
{
    private Boss StickyClause;
    
    

    /**
     * Constructor for objects of class Boss2
     */
    public Boss2()
    {
       super(); 
       StickyClause = new Boss();
    }
    
    public void getBoss2Info()
    {
        System.out.println("I am boss 2 add info here....");
    }
    
    public void hitBoss(Command command)
    {
       System.out.println("You hit boss 2 and blah blah blah");
       super.hitBoss(command); 
       
       
       
       
    }

    
}

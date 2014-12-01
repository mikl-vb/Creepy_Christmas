
/**
 * Write a description of class Boss2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boss2 extends Boss
{
    private Boss stickyClause;
    
    

    /**
     * Constructor for objects of class Boss2
     */
    public Boss2()
    {
       super(); 
       stickyClause = new Boss();
    }
    
    public void getBoss2Info()
    {
        System.out.println("I am boss 2 add info here....");
    }
    
    public void kickBoss(Command command)
    {
       System.out.println("You hit boss 2 and blah blah blah");
       super.kickBoss(command); 

       
    }
    
    public void death(){
        System.out.println("Dead Sticky Clause");
    }
    
    public void whenKicked()
    {
        System.out.println("Crunch! The toe of your boot slams into the black and red abdomin of your sticky enemy.");
       
    }
    
    public void whenSlashed()
    {
        System.out.println("A heap of exoskeleton flies over your head as you hack one of Ms. Clause's legs off!");
    
    }
}

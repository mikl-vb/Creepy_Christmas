
/**
 * Write a description of class Boss1 here.
 * 
 * This is for the first place, 
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boss1 extends Boss
{
    private Boss Ruderus;
    
    
    
    /**
     * Constructor for objects of class Boss1
     */
    public Boss1()
    {
       super();
       Ruderus = new Boss(); 
       
    }
    
    public void getBoss1Info()
    {
        System.out.println("I am boss 1 add info here....");
    }
    
    public void kickBoss(Command command)
    {
       System.out.println("You hit boss 1 and blah blah blah");

       super.kickBoss(command);


       
    }
    
    public void death(){
        System.out.println("Dead Ruderus");
    }
    
    public void whenKicked()
    {
        System.out.println("You hear a loud crack as the kick you lands solidly on one of the ferocious beast's jaw.");  
        
    }
    
    public void whenSlashed()
    {
        System.out.println("The beast make a loud roar as you sword kisses its breast.");
        
    }
}

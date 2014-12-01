
/**
 * Write a description of class Boss3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boss3 extends Boss
{
    private Boss riddler;
    

    /**
     * Constructor for objects of class Boss3
     */
    public Boss3()
    {
        super();
        riddler = new Boss();
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
    
    public void death(){
        System.out.println("Dead Riddler");
        
    }
    
    public void whenKicked()
    {
        System.out.println("Your kick barely connects as the over-sized owls flaps away.");
    }
    
    public void whenSlashed()
    {
        System.out.println("Your sword cuts the bird deeply as the foolish bird dives towards you.");
    }
}

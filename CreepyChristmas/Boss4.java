
/**
 * Write a description of class Boss4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boss4 extends Boss
{
    private Boss Santa;

    /**
     * Constructor for objects of class Boss4
     */
    public Boss4()
    {
        super();
        Santa = new Boss();
    }
    
    public void getBoss4Info()
    {
        System.out.println("I am boss 4 add info here....");
    }
    
    public void kickBoss(Command command)
    {
       System.out.println("You hit boss 4 and blah blah blah");
       super.kickBoss(command);
       
    }
    
    public void death(){
        System.out.println("dead SANTA");
    }

    public void whenKicked()
    {
        System.out.println("Santa starts laughing as your heel sinks into his enormous belly! It doesn't seem to have much affect.");
        
    }
    
    public void whenSlashed()
    {
        System.out.println("As you move to strike Santa, your sword begins to shine brightly. You notice the sword burns Santa more than it cuts him!");
    
    }
}

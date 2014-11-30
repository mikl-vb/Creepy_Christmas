
/**
 * Write a description of class Boss here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Boss
{
    // instance variables - replace the example below with your own
    public Health bossHealth;
    public Health playerHealth;
    public Health Dead;
    
    


    

    /**
     * Constructor for objects of class Boss
     */
    public Boss()
    {
        bossHealth = new Health();
        

        

        

    }


    public void hitBoss(Command command)
    {
          bossHealth.reduceHealth(); 
          bossHealth.printHealth();
    }
    

     public void firstBossInfo(){
      
        
        

    }
    
    public void death(){
        System.out.println("Dead Boss...");
    }

   }
    //Boss super class that tracks health. 3 subclasses have attacks and responses. Modify room for the boss rooms
    // boss room subclass of room. 

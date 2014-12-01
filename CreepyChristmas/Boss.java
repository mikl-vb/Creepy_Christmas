
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
    private Boolean dead;

    


    

    /**
     * Constructor for objects of class Boss
     */
    public Boss()
    {
        bossHealth = new Health();
        dead = false; 

        

        


        

    }


    public void hitBoss(Command command)
    {
          if(dead == true)
          {
            System.out.println("Your foe has already fallen. Time to move on.");
            return; 
            
            
            }
          
          bossHealth.reduceHealth(); 
          if(bossHealth.getHealth() < 1)
          {
            bossDeath(); 
            
            
            }
          bossHealth.printHealth();
          
          
    }
    
    public void hitPlayer()
    {
        playerHealth.reduceHealth();
        System.out.println("That hurt...Your health has dropped by 1!");
    
    }

    
    
     public void firstBossInfo(){

        

    }

    public void bossDeath()
    {
        System.out.println("Dead Boss...");

        
        
    
    }
   

    

   }
    //Boss super class that tracks health. 3 subclasses have attacks and responses. Modify room for the boss rooms
    // boss room subclass of room. 

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
<<<<<<< HEAD
    private Boolean dead;

    

=======
>>>>>>> 04654f18274a4183dc7baf47675c53e09a0e0b1e

    public Health Dead;
    

    /**
     * Constructor for objects of class Boss
     */
    public Boss()
    {
        bossHealth = new Health();
<<<<<<< HEAD
        dead = false; 

        

        


=======
>>>>>>> 04654f18274a4183dc7baf47675c53e09a0e0b1e
        

    }


    public void kickBoss(Command command)
    {
<<<<<<< HEAD
          if(dead == true)
          {
            System.out.println("Your foe has already fallen. Time to move on.");
            return; 
            
            
            }
          
=======

        bossHealth.reduceHealth();
        

>>>>>>> 04654f18274a4183dc7baf47675c53e09a0e0b1e
          bossHealth.reduceHealth(); 
          if(bossHealth.getHealth() < 1)
          {
            bossDeath(); 
            
            
            }
          bossHealth.printHealth();
<<<<<<< HEAD
          
          
=======

>>>>>>> 04654f18274a4183dc7baf47675c53e09a0e0b1e
    }
    
    public void hitPlayer()
    {
        playerHealth.reduceHealth();
        System.out.println("That hurt...Your health has dropped by 1!");
    
    }

    
    
     public void firstBossInfo(){

<<<<<<< HEAD
        
=======
>>>>>>> 04654f18274a4183dc7baf47675c53e09a0e0b1e

    }

    public void bossDeath()
    {
        System.out.println("Dead Boss...");

        
        
    
    }
   
<<<<<<< HEAD

    
=======

    public void death(){
        System.out.println("Dead Boss...");
    }

>>>>>>> 04654f18274a4183dc7baf47675c53e09a0e0b1e

   }
    //Boss super class that tracks health. 3 subclasses have attacks and responses. Modify room for the boss rooms
    // boss room subclass of room. 

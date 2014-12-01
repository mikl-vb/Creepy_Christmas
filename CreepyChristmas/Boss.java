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
<<<<<<< HEAD

=======
<<<<<<< HEAD
=======
>>>>>>> FETCH_HEAD
        

        
>>>>>>> origin/master



        

    }


    public void hitBoss(Command command)
    {
<<<<<<< HEAD
        bossHealth.reduceHealth();
        
=======
          bossHealth.reduceHealth(); 
          bossHealth.printHealth();
>>>>>>> origin/master
    }
    

     public void firstBossInfo(){
<<<<<<< HEAD
  
=======
      
        
>>>>>>> origin/master
        

    }
    
<<<<<<< HEAD
    public void bossDeath()
    {
        bossHealth.death();
        
    
    }
   
=======
    public void death(){
        System.out.println("Dead Boss...");
    }

>>>>>>> origin/master
   }
    //Boss super class that tracks health. 3 subclasses have attacks and responses. Modify room for the boss rooms
    // boss room subclass of room. 

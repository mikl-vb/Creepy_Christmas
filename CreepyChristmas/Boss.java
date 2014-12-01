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

    private Boolean bossDied;

   

    private Boolean dead;

    public Health Dead;

    /**
     * Constructor for objects of class Boss
     */
    public Boss()
    {
        bossHealth = new Health();

        bossDied = false;
        dead = false; 

    }
    public void kickBoss(Command command)
    {

        if(bossDied == true)
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


        if(dead == true)
        {
            System.out.println("Your foe has already fallen. Time to move on.");
            return; 

        }

        bossHealth.reduceHealth();

        bossHealth.reduceHealth(); 
        if(bossHealth.getHealth() < 1)
        {
            bossDeath(); 

        }
        bossHealth.printHealth();


        bossHealth.reduceHealth(); 
        bossHealth.printHealth();


    }

    public void hitPlayer()
    {

        playerHealth.reduceHealth();
        System.out.println("That hurt...Your health has dropped by 1!");

        if(playerHealth.getHealth() < 1)
        {
            //Game.playerDied = true; 
        }

    }

    
    public void firstBossInfo(){


    }

    public boolean bossDeath()
    {
        System.out.println("Dead Boss...");
        bossDied = true;
        return bossDied; 

    
    }

    public void death(){
        System.out.println("Dead Boss...");
    }


}
//Boss super class that tracks health. 3 subclasses have attacks and responses. Modify room for the boss rooms
// boss room subclass of room. 

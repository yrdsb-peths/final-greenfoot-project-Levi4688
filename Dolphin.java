import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Dolphin here.
 * 
 * @author Levi
 * @version June 2024
 */
public class Dolphin extends Actor
{
    GreenfootSound dolphinSound = new GreenfootSound("dolphinsound.mp3");
    
    
    public void act()
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("left"))
        {
            move(-3);
        }
        else if(Greenfoot.isKeyDown("right"))
        {
            move(3);
        }
        
        // Remove jellyfish if dolphin eats it
        eat();
    }
    
    
    /**
     * eat the jellyfish and spawn a new one
     */
    public void eat()
    {
        if(isTouching(Jellyfish.class))
        {
            removeTouching(Jellyfish.class);
            MyWorld world = (MyWorld) getWorld();
            world.spawnJellyfish();
            world.increaseScore();
            dolphinSound.play();
        }
        
    }
}

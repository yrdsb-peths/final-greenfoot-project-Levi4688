import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Dolphin here.
 * 
 * @author Levi
 * @version June 2024
 */
public class Dolphin extends Actor
{
    /**
     * Act - do whatever the Dolphin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("left"))
        {
            move(-1);
        }
        else if(Greenfoot.isKeyDown("right"))
        {
            move(1);
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
        }
        
    }
}

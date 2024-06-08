import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * dolphin's food.
 * 
 * @author Levi
 * @version (a version number or a date)June 2024
   */
public class Jellyfish extends Actor
{
    int speed = 1;
    
    public void act()
    {
        // Add your action code here.
        int x = getX();
        int y = getY() + speed;
        setLocation(x, y);
        
        MyWorld world = (MyWorld) getWorld();
        if(getY() >= world.getHeight())
        {
            world.gameOver();
            world.removeObject(this);
        }
    }
    
    public void setSpeed(int spd)
    {
        speed = spd;
    }
}

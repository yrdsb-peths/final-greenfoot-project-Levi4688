import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Dolphin's world.
 * 
 * @author Levi 
 * @version May 2024
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        
        Dolphin dolphin = new Dolphin();
        addObject(dolphin, 300, 200);
        
        Jellyfish jellyfish = new Jellyfish();
        addObject(jellyfish, 300, 0);
    }
}

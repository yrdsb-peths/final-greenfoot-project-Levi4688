import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Dolphin's world.
 * 
 * @author Levi 
 * @version May 2024
 */
public class MyWorld extends World
{
    public int score = 0;
    Label scoreLabel;
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false);
        
        //create object
        Dolphin dolphin = new Dolphin();
        addObject(dolphin, 300, 350);
        
        //create a label
        scoreLabel = new Label(0, 80);
        addObject(scoreLabel, 50, 50);
        
        spawnJellyfish();
    }
    
    /**
     * end the game and draw 'game over'
     */
    public void gameOver()
    {
        Label gameOverLabel = new Label("Game Over", 100);
        addObject(gameOverLabel, 300, 200); 
    }
    
    
    /**
     * increase score
     */
    public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score);
    }
    
    /**
     * Create new Jellyfish at random location at the top of the screen
     */
    public void spawnJellyfish()
    {
        Jellyfish jellyfish = new Jellyfish();
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        addObject(jellyfish, x, y);
    }
}

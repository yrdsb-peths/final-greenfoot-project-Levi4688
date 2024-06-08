import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * TitleScreen
 * 
 * @author Levi 
 * @version June 2024
 */

public class TitleScreen extends World
{
    Label titleLabel = new Label("The Dolphin Game", 70);
    GreenfootSound backgroundMusic = new GreenfootSound("backgroundmusic.mp3");
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        backgroundMusic.playLoop();

        addObject(titleLabel, getWidth()/2, getHeight()/2);
        prepare();
    }

    /**
     * The main world act loop
     */
    public void act()
    {
        //start if user presses the space bar
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Dolphin dolphin = new Dolphin();
        addObject(dolphin,277,308);
        dolphin.setLocation(318,222);
        dolphin.setLocation(234,84);
        dolphin.setLocation(340,75);
        dolphin.setLocation(320,86);
        Label label = new Label("Press <SPACE> to start the game", 35);
        addObject(label,276,297);
        label.setLocation(341,264);
        label.setLocation(373,258);
        label.setLocation(335,250);
        label.setLocation(297,266);
        dolphin.setLocation(150,88);
        dolphin.setLocation(237,67);
        dolphin.setLocation(296,96);
        Label label2 = new Label("Use \u2190 and \u2192 to control the dolphin", 30);
        addObject(label2,274,329);
        label2.setLocation(313,310);
    }
}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameStart here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameStart extends World
{

    /**
     * Constructor for objects of class GameStart.
     * 
     */
    public GameStart()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1048, 700, 1); 
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Start start = new Start();
        addObject(start,290,435);
    }
}

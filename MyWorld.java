import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{   
    public static Counter score = new Counter("Skor: ");
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1048, 700, 1); 
        spawncar();
    }

    private void spawncar(){
        mobilpemain pemain = new mobilpemain();
        addObject(pemain,524,615);
        addObject(score, 70, 20);
        score.setValue(0);
    }

    public void act(){
        if(Greenfoot.getRandomNumber(150)<1){
            addObject(new mobilnpc1(), Greenfoot.getRandomNumber(300) + 540, 0);
        }
        if(Greenfoot.getRandomNumber(150)<1){
            addObject(new mobilnpc2(), Greenfoot.getRandomNumber(300) + 215, 700);
        }
    }
}

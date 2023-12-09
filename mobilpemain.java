import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class mobilpemain here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class mobilpemain extends Actor
{
    /**
     * Act - do whatever the mobilpemain wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        arahpanah();
        nabrak();
    }
    public void arahpanah()
    {
        if(Greenfoot.isKeyDown("up")){
            if(getY()> 85){
                setLocation(getX(),getY() -5);
            }
            Greenfoot.playSound("gass.wav");
        }
        if(Greenfoot.isKeyDown("down")){
            if(getY()< 615){
                setLocation(getX(),getY() +5);
            }
            Greenfoot.playSound("critt.wav");
        }
        if(Greenfoot.isKeyDown("left")){
            if(getX()>= 210){
                setLocation(getX() -5, getY());
            }
        }
        if(Greenfoot.isKeyDown("right")){
            if(getX()<= 840){
                setLocation(getX() +5, getY());
            }
        }
    }
    public void nabrak()
    {
        if(isTouching(mobilnpc1.class)||(isTouching(mobilnpc2.class))){
            Greenfoot.stop();
            Greenfoot.setWorld(new GameOver());
        }
    }
}

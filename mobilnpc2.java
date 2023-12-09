import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class mobilnpc2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class mobilnpc2 extends Utama
{
    int speed = -3;
    public void act()
    {
        mobilnpc2 b = new mobilnpc2();
        Actor i = getOneIntersectingObject(mobilnpc2.class);
        move(speed);
        checkdouble(i);
        selesai();
    }
}

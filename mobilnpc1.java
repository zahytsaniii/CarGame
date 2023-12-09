import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class mobilnpc1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class mobilnpc1 extends Utama
{
    int speed = 5;
    public void act()
    {
        mobilnpc1 a = new mobilnpc1();
        Actor i = getOneIntersectingObject(mobilnpc1.class);
        move(speed);
        checkdouble(i);
        selesai();
    }
}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 *
 * 
 * 
 *
 */
public class FrogWorld extends World
{
    public FrogWorld()
    {    
        super(800, 600, 1);
        addObject( new Frog(), 400, 560 );
        addObject( new Grass(), Greenfoot.getRandomNumber(800), Greenfoot.getRandomNumber(600));
        addObject( new Grass(), Greenfoot.getRandomNumber(800), Greenfoot.getRandomNumber(600));
        addObject( new Grass(), Greenfoot.getRandomNumber(800), Greenfoot.getRandomNumber(600));
        addObject( new Grass(), Greenfoot.getRandomNumber(800), Greenfoot.getRandomNumber(600));
        addObject( new Grass(), Greenfoot.getRandomNumber(800), Greenfoot.getRandomNumber(600));
        addObject( new Grass(), Greenfoot.getRandomNumber(800), Greenfoot.getRandomNumber(600));
        addObject( new Car(), 10, 300);
        addObject( new Car(), 250, 400);
        addObject( new Car(), 510, 500);
    }
}

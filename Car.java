import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * car
 * 
 * @chuk3 
 * @3/26/21
 */
public class Car extends Actor
{
    public void act() 
    {
        move( Greenfoot.getRandomNumber(10) );
        if( isAtEdge() )
        {
            setLocation( 25, getY() );
        }
        
        move( Greenfoot.getRandomNumber(10) );
        restart();
        if( isTouching( Frog.class ) )
        {
            Greenfoot.stop();
        }
    }    
    
    public void restart()
    {
        if( isAtEdge() )
        {
            setLocation( 25, getY() );
        }
    }
}


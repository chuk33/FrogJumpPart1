import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * frog
 * 
 * @chuk3
 * @3/26/21
 */
public class Frog extends Actor
{
    public void act() 
    {
        if( Greenfoot.isKeyDown("w") )
        {
            setLocation( getX(), getY() - 5);
        }
        
        if( Greenfoot.isKeyDown("a") )
        {
            setLocation( getX() - 5, getY() );
        }
        
        if( Greenfoot.isKeyDown("s") )
        {
            setLocation( getX(), getY() + 5 );
        }
        
        if( Greenfoot.isKeyDown("d") )
        {
            setLocation( getX() + 5, getY() );
        }
    }    
    
    public void checkKeyPress()
        {
            if( Greenfoot.isKeyDown("w") )
        {
            setLocation( getX(), getY() - 5);
        }
        
        if( Greenfoot.isKeyDown("a") )
        {
            setLocation( getX(), getY() + 5);
        }
        
        if( Greenfoot.isKeyDown("s") )
        {
            setLocation( getX() - 5 , getY() );
        }
        
        if( Greenfoot.isKeyDown("d") )
        {
            setLocation( getX() + 5, getY() );
        }
        }
}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AvoiderGameIntroScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AvoiderGameIntroScreen extends AvoiderGameOverWorld
{

    /**
     * Constructor for objects of class AvoiderGameIntroScreen.
     * 
     */
    public AvoiderGameIntroScreen()
    {
    }
    
    public void act()
    {
      if(Greenfoot.mouseClicked(this))
      {
       AvoiderWorld world = new AvoiderWorld();
       Greenfoot.setWorld(world);
        
      }
    
    }
}

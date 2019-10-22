import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AvoiderGameOverWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AvoiderGameOverWorld extends AvoiderWorld
{

    /**
     * Constructor for objects of class AvoiderGameOverWorld.
     * 
     */
    public AvoiderGameOverWorld()
    {
        endGame();
        
    }
    
    public void endGame()
    {
      AvoiderGameOverWorld go = new AvoiderGameOverWorld();
      Greenfoot.setWorld(go);
    
    }
    
    public void act()
    {
      if( Greenfoot.mouseClicked(this))
      {
          AvoiderWorld world = new AvoiderWorld();
          Greenfoot.setWorld(world);
      }
    
    }
}

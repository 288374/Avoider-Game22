import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AvoiderWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    
    private GreenfootSound bkgMusic;
    private Counter scoreBoard;
    public AvoiderWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false); 
        
        bkgMusic = new GreenfootSound("sounds/UFO_T-Balt.mp3");
        bkgMusic.playLoop();
        
        prepare();
        endGame();
    }
    
    private void prepare()
    {
      Avatar avatar = new Avatar();
      addObject(avatar, 287, 232);
      scoreBoard = new Counter("Score: ");
      addObject(scoreBoard,70,20);
    
    }
    
    
     public void act()
    {
       if(Greenfoot.getRandomNumber(1000) < 20)
       {
           Enemy e = new Enemy();
           addObject(e, Greenfoot.getRandomNumber(getWidth()-20)+10 ,-30);
           scoreBoard.setValue(scoreBoard.getValue() +1);
           int x = Greenfoot.getRandomNumber(getWidth()-20) + 10;
           int y = -30;
           super.addObject(e,x,y);
       }
       
    }
    
    private void endGame()
  
    {
       bkgMusic.stop();
       
    }
}

package dev.codenmore.game;

import java.awt.Graphics;import java.awt.image.BufferStrategy;

import dev.codenmore.game.display.Display;
import dev.codenmore.game.gfx.Assets;
import dev.codenmore.game.gfx.GameCamera;
import dev.codenmore.game.input.KeyManager;
import dev.codenmore.game.states.GameState;
import dev.codenmore.game.states.State;

public class Game implements Runnable
{
 private Display display;
 private int width,height;
 public String title;
 
 private boolean running = false;
 private Thread thread;
 
 
 private BufferStrategy bs;
 private Graphics g;
 
 //States
 private State gameState;
 
 private KeyManager keyManager;
 
 private GameCamera gameCamera;
 
 private Handler handler;
 
 public Game(String title,int width,int height)
 {
  this.width=width;
  this.height=height;
  this.title=title;
  keyManager= new KeyManager();
 }

 private void init()
 {
  display=new Display(title,width,height);
  display.getFrame().addKeyListener(keyManager);
  Assets.init();
  
  gameCamera = new GameCamera(this,0,0);
  handler = new Handler(this);
  
  gameState=new GameState(handler);
  State.setState(gameState);
 }
 
 private void tick()
 {
	 keyManager.tick();
	 
	 if(State.getState()!=null)
		 State.getState().tick();
 }

 private void render()
 {
	bs = display.getCanvas().getBufferStrategy();
	if(bs==null)
	{
		display.getCanvas().createBufferStrategy(3);
		return;
	}
	
	g=bs.getDrawGraphics();
	
	// CLEAR
	
	g.clearRect(0, 0, width, height);
	
	//DRAW HERE
	
	 if(State.getState()!=null)
		 State.getState().render(g);
	 
	//END DRAW
	
	bs.show();
	g.dispose();
	
 }
 
 public void run()
 {
	 init();
	 
	 int fps = 60;
	 double timePerTick = 1000000000/fps;
	 double delta=0;
	 long now;
	 long lastTime=System.nanoTime();
	// long timer=0;
	// long ticks=0;

	 while(running)
	 {
		now=System.nanoTime();
		delta+=(now-lastTime)/timePerTick;
	//	timer += now-lastTime;
		lastTime=now;
		
		if(delta>=1)
		{
			tick();
			render();
		//	ticks++;
			delta--;
		}
		
		/*
		if(timer >= 1000000000)
		{
			System.out.println("Ticks and frames: "+ticks);
			ticks=0;
			timer=0;
		}
		*/
		
	 }
	 
	 stop();
 }
 
 public KeyManager getKeyManager()
 {
	 return keyManager;
 }
 
 public GameCamera getGameCamera()
 {
	 return gameCamera;
 }
 
 public int getWidth()
 {
	 return width;
 }
 
 public int getHeight()
 {
	 return height;
 }
 
 public synchronized void start()
 {
	 if(running)
		 return;
	 running=true;
	 thread= new Thread(this);
	 thread.start();
 }
 
 public synchronized void stop()
 {
	 if(!running)
		 return;
	 running=false;
	 try {thread.join();} 
	 catch (InterruptedException e) 
	 {e.printStackTrace();}
 }
}

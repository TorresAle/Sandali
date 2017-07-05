package dev.codenmore.game.gfx;

import java.awt.image.BufferedImage;

public class Animation 
{
 private int speed,index;
 private long lastTime,timer;
 private BufferedImage[] frames;
 
 public Animation(int speed,BufferedImage[] frames)
 {
	 this.speed=speed;
	 this.frames=frames;
	 timer=0;
	 index=1;
	 lastTime=System.currentTimeMillis();
 }
 
 public void tick()
 {
	timer+=System.currentTimeMillis()-lastTime;
	lastTime=System.currentTimeMillis();
	
	if(timer> speed)
	{
		index++;
		timer=0;
		if(index >= frames.length)
			index=1;
	}
	
 }
 
 public BufferedImage stopFrame()
 {
	 return frames[0];
 }
 
 public BufferedImage getCurrentFrame()
 {
	 return frames[index];
 }
}

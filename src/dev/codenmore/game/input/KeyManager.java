package dev.codenmore.game.input;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyManager implements KeyListener
{
	private boolean[] keys;
	private boolean isPress=false;
	public boolean up,down,left,right,running=false;
	
	public KeyManager()
	{
		keys = new boolean[256];
	}
	
	public void tick()
	{
		up = keys[KeyEvent.VK_W];
		down = keys[KeyEvent.VK_S];
		left = keys[KeyEvent.VK_A];
		right = keys[KeyEvent.VK_D];
	}
	
	@Override
	public void keyTyped(KeyEvent e) 
	{
		
	}

	@Override
	public void keyPressed(KeyEvent e) 
	{
		if(isPress)
			return;
		keys[e.getKeyCode()]=true;
		isPress=true;
		if(keys[e.getKeyCode()] == keys[KeyEvent.VK_R])
		{
			if(running)
				running=false;
			else
				running=true;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) 
	{
		if(isPress && keys[e.getKeyCode()]==false)
			return;
		keys[e.getKeyCode()]=false;
		isPress=false;
	}

}

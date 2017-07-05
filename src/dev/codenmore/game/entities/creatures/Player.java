package dev.codenmore.game.entities.creatures;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import dev.codenmore.game.Handler;
import dev.codenmore.game.gfx.Animation;
import dev.codenmore.game.gfx.Assets;

public class Player extends Creature
{
	private Animation animeRDown, animeDown,
					  animeRUp, animeUp,
					  animeRLeft,animeLeft,
					  animeRRight,animeRight;
	private boolean run;
	
	private int dir;
	public Player(Handler handler,float x, float y) 
	{
		super(handler,x, y,Creature.DEFAULT_CREATURE_WIDTH,Creature.DEFAULT_CREATURE_HEIGHT);
		bounds.x=0;
		bounds.y=5;
		bounds.width=15;
		bounds.height=15;
		
		animeRDown=new Animation(190,Assets.male_run_front);
		animeRUp=new Animation(190,Assets.male_run_up);
		animeRRight=new Animation(190,Assets.male_run_right);
		animeRLeft=new Animation(190,Assets.male_run_left);
		
		animeDown=new Animation(300,Assets.male_front);
		animeUp=new Animation(300,Assets.male_up);
		animeRight=new Animation(300,Assets.male_right);
		animeLeft=new Animation(300,Assets.male_left);
		
	}

	@Override
	public void tick() 
	{
		animeDown.tick();
		animeUp.tick();
		animeLeft.tick();
		animeRight.tick();
		animeRDown.tick();
		animeRUp.tick();
		animeRLeft.tick();
		animeRRight.tick();
		getInput();
		move();
		handler.getGameCamera().centerOnEntity(this);
	}

	private void getInput()
	{
		xMove=0;
		yMove=0;
		if(run)
		{
			if(handler.getKeyManager().up)
			{
				dir=1;
				yMove =-speed;
			}
			if(handler.getKeyManager().down)
			{
				dir=2;
				yMove = speed;
			}
			if(handler.getKeyManager().left)
			{
				dir=3;
				xMove =-speed;
			}
			if(handler.getKeyManager().right)
			{
				dir=4;
				xMove = speed;
			}
			if(handler.getKeyManager().running)
			{
				run=true;
			}
			else if(!handler.getKeyManager().running)
			{
				run=false;
			}
		}
		else
		{
			if(handler.getKeyManager().up)
			{
				dir=1;
				yMove =-speed+1.5f;
			}
			if(handler.getKeyManager().down)
			{
				dir=2;
				yMove = speed-1.5f;
			}
			if(handler.getKeyManager().left)
			{
				dir=3;
				xMove =-speed+1.5f;
			}
			if(handler.getKeyManager().right)
			{
				dir=4;
				xMove = speed-1.5f;
			}
			if(!handler.getKeyManager().running)
			{
				run=false;
			}
			else if(handler.getKeyManager().running)
			{
				run=true;
			}
		}
	}
	
	@Override
	public void render(Graphics g)
	{
	 g.drawImage(getCurrentAnimationFrame(),(int)(x-handler.getGameCamera().getxOffset()) ,(int)(y-handler.getGameCamera().getyOffset()),null);	
	 g.setColor(Color.red);

	 g.drawRect((int)(x + bounds.x - handler.getGameCamera().getxOffset()), (int)(y + bounds.y - handler.getGameCamera().getyOffset()), bounds.width , bounds.height);
	}
	
	private BufferedImage getCurrentAnimationFrame()
	{
		if(run)
		{
		if(xMove<0)
		{
			return animeRLeft.getCurrentFrame();
		}
		else if(xMove>0)
		{
			return animeRRight.getCurrentFrame();
		}
		
		else if(yMove<0)
		{
			return animeRUp.getCurrentFrame();
		}
		else if(yMove>0)
		{
			return animeRDown.getCurrentFrame();
		}
		else
		{
			if(dir==1)
				return animeRUp.stopFrame();
			else if(dir==2)
				return animeRDown.stopFrame();
			else if(dir==3)
				return animeRLeft.stopFrame();
			else
				return animeRRight.stopFrame();
		}
		}
		else
		{
			if(xMove<0)
			{
				return animeLeft.getCurrentFrame();
			}
			else if(xMove>0)
			{
				return animeRight.getCurrentFrame();
			}
			
			else if(yMove<0)
			{
				return animeUp.getCurrentFrame();
			}
			else if(yMove>0)
			{
				return animeDown.getCurrentFrame();
			}
			else
			{
				if(dir==1)
					return animeUp.stopFrame();
				else if(dir==2)
					return animeDown.stopFrame();
				else if(dir==3)
					return animeLeft.stopFrame();
				else
					return animeRight.stopFrame();
			}
		}

	}
	
}

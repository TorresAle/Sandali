package dev.codenmore.game.entities.creatures;

import dev.codenmore.game.Handler;
import dev.codenmore.game.entities.Entity;
import dev.codenmore.game.tiles.Tile;

public abstract class Creature extends Entity 
{
	public static final int DEFAULT_HEALTH=0;
	public static final float DEFAULT_SPEED=4.0f;
	public static final int DEFAULT_CREATURE_WIDTH = 18,
							DEFAULT_CREATURE_HEIGHT= 23;
	
	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public float getSpeed() {
		return speed;
	}

	public void setSpeed(float speed) {
		this.speed = speed;
	}

	protected int health;
	protected float speed;
	protected float xMove,yMove;
	
	public Creature(Handler handler,float x, float y,int width,int height) 
	{
		super(handler,x, y,width,height);
		health=DEFAULT_HEALTH;
		speed=DEFAULT_SPEED;
		xMove=0;
		yMove=0;
	}
	
	
	public void move()
	{
		if(!CheckEntityCollisions(xMove,0f))
		moveX();
		if(!CheckEntityCollisions(0f,yMove))
		moveY();
	}
	
	public void moveX()
	{
		if(xMove>0)
		{
			int tx = (int)(x+xMove+bounds.x+bounds.width)/Tile.TILEWIDTH;
			
			if( !collisionWidthTile( tx, (int)((y+bounds.y) /Tile.TILEHEIGHT)) && !collisionWidthTile(tx,((int)(y+bounds.y+bounds.height)/Tile.TILEHEIGHT) ))
			{
				x+=xMove;
			}
			else
			{
				x=tx*Tile.TILEWIDTH-bounds.x-bounds.width-1;
			}
		
		}
		else if(xMove<0)
		{
			int tx = (int)(x+xMove+bounds.x)/Tile.TILEWIDTH;
			if( !collisionWidthTile( tx, (int)((y+bounds.y) /Tile.TILEHEIGHT)) && !collisionWidthTile(tx,((int)(y+bounds.y+bounds.height)/Tile.TILEHEIGHT) ))
			{
				x+=xMove;
			}
			else
			{
				x=tx*Tile.TILEWIDTH-bounds.x+Tile.TILEWIDTH;
			}
		}
	}
	
	public void moveY()
	{
		if(yMove < 0)
		{
			int ty=(int)(y+yMove+bounds.y)/Tile.TILEHEIGHT;
			
			if(!collisionWidthTile((int)(x+bounds.x)/Tile.TILEWIDTH,ty) && !collisionWidthTile((int)(x+bounds.x+bounds.width)/Tile.TILEWIDTH,ty) )
			{
			 y+=yMove;
			}
			else
			{
				y=ty*Tile.TILEHEIGHT-bounds.y+Tile.TILEHEIGHT;
			}
		}
		else if(yMove>0)
		{
			int ty=(int)(y+yMove+bounds.y+bounds.height)/Tile.TILEHEIGHT;
			
			if(!collisionWidthTile((int)(x+bounds.x)/Tile.TILEWIDTH,ty) && !collisionWidthTile((int)(x+bounds.x+bounds.width)/Tile.TILEWIDTH,ty) )
			{
			 y+=yMove;
			}
			else
			{
				y=ty*Tile.TILEHEIGHT-bounds.y-bounds.height-1;
			}
		}
	}
	
	protected boolean collisionWidthTile(int x,int y)
	{
		return handler.getWorld().getTile(x, y).isSolid();
	}
	
	
	public float getxMove() {
		return xMove;
	}

	public void setxMove(float xMove) {
		this.xMove = xMove;
	}

	public float getyMove() {
		return yMove;
	}

	public void setyMove(float yMove) {
		this.yMove = yMove;
	}
	
	
}

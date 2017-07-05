package dev.codenmore.game.entities.statics;

import java.awt.Graphics;

import dev.codenmore.game.Handler;
import dev.codenmore.game.gfx.Assets;

public class Tree extends StaticsEntity
{

	public Tree(Handler handler, float x, float y) 
	{
		super(handler, x, y,32,36);
	}

	@Override
	public void tick() 
	{
		
	}

	@Override
	public void render(Graphics g) 
	{
	 	g.drawImage(Assets.tree,(int)(x-handler.getGameCamera().getxOffset()),(int)(y-handler.getGameCamera().getyOffset()),32,36,null);
	}
 
	public boolean isSolid()
	{
		return true;
	}
}

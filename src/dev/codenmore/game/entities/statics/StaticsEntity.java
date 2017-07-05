package dev.codenmore.game.entities.statics;

import dev.codenmore.game.Handler;
import dev.codenmore.game.entities.Entity;

public abstract class StaticsEntity extends Entity
{

	public StaticsEntity(Handler handler, float x, float y, int width, int height) 
	{
		super(handler, x, y, width, height);
	}

}

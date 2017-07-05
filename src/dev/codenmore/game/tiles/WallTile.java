package dev.codenmore.game.tiles;

import dev.codenmore.game.gfx.Assets;

public class WallTile extends Tile
{

	public WallTile(int id) 
	{
		super(Assets.rock, id);
	}
 
	@Override
	 public boolean isSolid()
	 {
		 return true;
	 }
}

package dev.codenmore.game;

import dev.codenmore.game.gfx.GameCamera;
import dev.codenmore.game.input.KeyManager;
import dev.codenmore.game.worlds.World;

public class Handler
{
 private Game game;
 private World world;
 
 public Handler(Game game)
 {
	 this.game=game;
 }
 
 public GameCamera getGameCamera()
 {
	 return game.getGameCamera();
 }

 public int getWidth()
 {
	 return game.getWidth();
 }
 public int getHeight()
 {
	 return game.getHeight();
 }
 

 public KeyManager getKeyManager()
 {
	 return game.getKeyManager();
 }
 
 
public Game getGame() {
	return game;
}

public void setGame(Game game) {
	this.game = game;
}

public World getWorld() {
	return world;
}

public void setWorld(World world) {
	this.world = world;
}
 
 
 
}

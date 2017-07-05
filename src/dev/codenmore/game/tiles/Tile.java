package dev.codenmore.game.tiles;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Tile 
{
 public static Tile[] tiles = new Tile[256];
 public static Tile vuoto = new Vuoto(0);
 public static Tile grassTile = new GrassTile(1);
 public static Tile wallTile = new WallTile(2);

 
	

 public static final int TILEWIDTH=18,
		 				 TILEHEIGHT=18;
 	
	

 protected BufferedImage texture;
 protected final int id;
 
 public Tile(BufferedImage texture,int id)
 {
	 this.texture=texture;
	 this.id=id;
	 
	 tiles[id] = this;
 }
 
 public void tick()
 {
	 vuoto.getClass();	 
 }
 
 public void render(Graphics g,int x,int y)
 {
	 g.drawImage(texture, x, y, TILEWIDTH,TILEHEIGHT,null );
	 
 }

 public boolean isSolid()
 {
	 return false;
 }
 
 public int getId()
 {
	 return id;
 }
 
 
}

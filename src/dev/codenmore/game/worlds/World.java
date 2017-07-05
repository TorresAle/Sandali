package dev.codenmore.game.worlds;

import java.awt.Graphics;

import dev.codenmore.game.Handler;
import dev.codenmore.game.entities.EntityManager;
import dev.codenmore.game.entities.creatures.Player;
import dev.codenmore.game.entities.statics.Tree;
import dev.codenmore.game.tiles.Tile;
import dev.codenmore.game.utils.Utils;

public class World 
{
 private Handler handler;
 private int width,height;
 private int spawnX,spawnY;
 private int[][] tiles;
 private int d=33,s=30;
 
 private EntityManager entityManager;
 
 public World(Handler handlers,String path)
 {

	 this.handler=handlers;
	 entityManager = new EntityManager(handler,new Player(handler,100,100));
	 entityManager.addEntity(new Tree(handler,s*0,d*0));
	 entityManager.addEntity(new Tree(handler,s*0,d*1));
	 entityManager.addEntity(new Tree(handler,s*0,d*2));
	 entityManager.addEntity(new Tree(handler,s*0,d*3));
	 entityManager.addEntity(new Tree(handler,s*0,d*4));
	 entityManager.addEntity(new Tree(handler,s*0,d*5));
	 entityManager.addEntity(new Tree(handler,s*0,d*6));
	 entityManager.addEntity(new Tree(handler,s*0,d*7));
	 entityManager.addEntity(new Tree(handler,s*0,d*8));
	 entityManager.addEntity(new Tree(handler,s*0,d*9));
	 entityManager.addEntity(new Tree(handler,s*0,d*10));
	 entityManager.addEntity(new Tree(handler,s*0,d*11));
	 entityManager.addEntity(new Tree(handler,s*0,d*12));
	 entityManager.addEntity(new Tree(handler,s*0,d*13));
	 entityManager.addEntity(new Tree(handler,s*0,d*14));
	 entityManager.addEntity(new Tree(handler,s*1,d*0));
	 entityManager.addEntity(new Tree(handler,s*1,d*1));
	 entityManager.addEntity(new Tree(handler,s*1,d*2));
	 entityManager.addEntity(new Tree(handler,s*1,d*3));
	 entityManager.addEntity(new Tree(handler,s*1,d*4));
	 entityManager.addEntity(new Tree(handler,s*1,d*5));
	 entityManager.addEntity(new Tree(handler,s*1,d*6));
	 entityManager.addEntity(new Tree(handler,s*1,d*7));
	 entityManager.addEntity(new Tree(handler,s*1,d*8));
	 entityManager.addEntity(new Tree(handler,s*1,d*9));
	 entityManager.addEntity(new Tree(handler,s*1,d*10));
	 entityManager.addEntity(new Tree(handler,s*1,d*11));
	 entityManager.addEntity(new Tree(handler,s*1,d*12));
	 entityManager.addEntity(new Tree(handler,s*1,d*13));
	 entityManager.addEntity(new Tree(handler,s*1,d*14));
	 entityManager.addEntity(new Tree(handler,s*2,d*0));
	 entityManager.addEntity(new Tree(handler,s*2,d*1));
	 entityManager.addEntity(new Tree(handler,s*2,d*2));
	 entityManager.addEntity(new Tree(handler,s*2,d*3));
	 entityManager.addEntity(new Tree(handler,s*2,d*4));
	 entityManager.addEntity(new Tree(handler,s*2,d*5));
	 entityManager.addEntity(new Tree(handler,s*2,d*6));
	 entityManager.addEntity(new Tree(handler,s*2,d*7));
	 entityManager.addEntity(new Tree(handler,s*2,d*8));
	 entityManager.addEntity(new Tree(handler,s*2,d*9));
	 entityManager.addEntity(new Tree(handler,s*2,d*10));
	 entityManager.addEntity(new Tree(handler,s*2,d*11));
	 entityManager.addEntity(new Tree(handler,s*2,d*12));
	 entityManager.addEntity(new Tree(handler,s*2,d*13));
	 entityManager.addEntity(new Tree(handler,s*2,d*14));
	 entityManager.addEntity(new Tree(handler,s*3,d*0));
	 entityManager.addEntity(new Tree(handler,s*3,d*1));
	 entityManager.addEntity(new Tree(handler,s*3,d*2));
	 entityManager.addEntity(new Tree(handler,s*3,d*3));
	 entityManager.addEntity(new Tree(handler,s*3,d*4));
	 entityManager.addEntity(new Tree(handler,s*3,d*5));
	 entityManager.addEntity(new Tree(handler,s*3,d*6));
	 entityManager.addEntity(new Tree(handler,s*3,d*7));
	 entityManager.addEntity(new Tree(handler,s*3,d*8));
	 entityManager.addEntity(new Tree(handler,s*3,d*9));
	 entityManager.addEntity(new Tree(handler,s*3,d*10));
	 entityManager.addEntity(new Tree(handler,s*3,d*11));
	 entityManager.addEntity(new Tree(handler,s*3,d*12));
	 entityManager.addEntity(new Tree(handler,s*3,d*13));
	 entityManager.addEntity(new Tree(handler,s*3,d*14));
	 entityManager.addEntity(new Tree(handler,s*4,d*0));
	 entityManager.addEntity(new Tree(handler,s*4,d*1));
	 entityManager.addEntity(new Tree(handler,s*4,d*2));
	 entityManager.addEntity(new Tree(handler,s*5,d*0));
	 entityManager.addEntity(new Tree(handler,s*5,d*1));
	 entityManager.addEntity(new Tree(handler,s*6,d*0));
	 entityManager.addEntity(new Tree(handler,s*6,d*1));
	 entityManager.addEntity(new Tree(handler,s*7,d*0));
	 entityManager.addEntity(new Tree(handler,s*7,d*1));
	 entityManager.addEntity(new Tree(handler,s*8,d*0));
	 entityManager.addEntity(new Tree(handler,s*8,d*1));
	 entityManager.addEntity(new Tree(handler,s*10,d*0));
	 entityManager.addEntity(new Tree(handler,s*10,d*1));
	 entityManager.addEntity(new Tree(handler,s*11,d*0));
	 entityManager.addEntity(new Tree(handler,s*11,d*1));
	 entityManager.addEntity(new Tree(handler,s*12,d*0));
	 entityManager.addEntity(new Tree(handler,s*12,d*1));
	 
	 
	 loadWorld(path);
	 entityManager.getPlayer().setX(spawnX);
	 entityManager.getPlayer().setY(spawnY);
 }


public EntityManager getEntityManager() {
	return entityManager;
}


public void tick()
 {
	 entityManager.tick();
 }
 
 public void render(Graphics g)
 {
	 int xStart=(int)Math.max(0, handler.getGameCamera().getxOffset()/Tile.TILEWIDTH);
	 int xEnd=(int)Math.min(width, (handler.getGameCamera().getxOffset()+handler.getWidth())/Tile.TILEWIDTH+1);
	 int yStart=(int)Math.max(0, handler.getGameCamera().getyOffset()/Tile.TILEHEIGHT);;
	 int yEnd=(int)Math.min(height, (handler.getGameCamera().getyOffset()+handler.getHeight())/Tile.TILEHEIGHT)+1;;
	 
	 
	 for(int y=yStart;y < yEnd;y++)
	 {
		 for(int x=xStart; x<xEnd;x++)
		 {
			getTile(x,y).render(g,(int)(x*Tile.TILEWIDTH-handler.getGameCamera().getxOffset()),(int)( y*Tile.TILEHEIGHT-handler.getGameCamera().getyOffset())); 
		 }
	 }
	 entityManager.render(g);
 }
 
 public Tile getTile(int x,int y)
 {
	if(x < 0 || y<0 || x>=width||y>=height)
		return Tile.vuoto;
	 
	Tile t =  Tile.tiles[tiles[x][y]];
	
	if(t==null)
		return Tile.wallTile;
	return t;
 }
 
 
 private void loadWorld(String path)
 {
  String file = Utils.loadFileAsString(path);
  String [] tokens = file.split("\\s+");
  width = Utils.parseInt(tokens[0]);
  height = Utils.parseInt(tokens[1]);
  spawnX = Utils.parseInt(tokens[2]);
  spawnY = Utils.parseInt(tokens[3]);
  
 
  tiles = new  int[width][height];
  for(int y=0;y<height;y++)
  {
	  for(int x=0;x<width;x++)
	  {
		  tiles[x][y]=Utils.parseInt(tokens[(x+y*width)+4]);
		  
	  }
  }
 }
}

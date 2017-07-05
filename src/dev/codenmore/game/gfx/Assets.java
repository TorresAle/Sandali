package dev.codenmore.game.gfx;

import java.awt.image.BufferedImage;

public class Assets 
{
 public static BufferedImage vuoto;
	
 public static BufferedImage[] male_run_front,male_front,
 							   male_run_right,male_right,
 							   male_run_left,male_left,
 							   male_run_up,male_up;
 
 public static BufferedImage grass,rock,tree;
 
 
 
 
 public static void init()
 {
  
  male_run_front = new BufferedImage[3];
  male_run_left = new BufferedImage[3];  
  male_run_right = new BufferedImage[3];  
  male_run_up = new BufferedImage[3]; 
  male_front = new BufferedImage[3]; 
  male_up = new BufferedImage[3];  
  male_right = new BufferedImage[3]; 
  male_left = new BufferedImage[3];
  
  //STOP
  male_run_front[0] = ImageLoader.loadImage("/textures/Man_Pg/pg_stop/pg_stop_front.png");
  male_run_left[0] = ImageLoader.loadImage("/textures/Man_Pg/pg_stop/pg_stop_left.png");
  male_run_right[0] = ImageLoader.loadImage("/textures/Man_Pg/pg_stop/pg_stop_right.png");  
  male_run_up[0] =  ImageLoader.loadImage("/textures/Man_Pg/pg_stop/pg_stop_up.png");  

  male_front[0] =  ImageLoader.loadImage("/textures/Man_Pg/pg_stop/pg_stop_front.png");
  male_left[0] =ImageLoader.loadImage("/textures/Man_Pg/pg_stop/pg_stop_left.png");
  male_right[0] = ImageLoader.loadImage("/textures/Man_Pg/pg_stop/pg_stop_right.png");  
  male_up[0] =  ImageLoader.loadImage("/textures/Man_Pg/pg_stop/pg_stop_up.png");  
  
  
  //RUN
  male_run_front[1] =  ImageLoader.loadImage("/textures/Man_Pg/pg_run_l/pg_run_l_front.png");
  male_run_right[1] = ImageLoader.loadImage("/textures/Man_Pg/pg_run_l/pg_run_l_right.png");
  male_run_up[1] = ImageLoader.loadImage("/textures/Man_Pg/pg_run_l/pg_run_l_up.png"); 
  male_run_left[1] = ImageLoader.loadImage("/textures/Man_Pg/pg_run_l/pg_run_l_left.png");   
  
  
  male_run_front[2] = ImageLoader.loadImage("/textures/Man_Pg/pg_run_r/pg_run_r_front.png");   
  male_run_left[2] = ImageLoader.loadImage("/textures/Man_Pg/pg_run_r/pg_run_r_left.png");
  male_run_right[2] =ImageLoader.loadImage("/textures/Man_Pg/pg_run_r/pg_run_r_right.png");
  male_run_up[2] =ImageLoader.loadImage("/textures/Man_Pg/pg_run_r/pg_run_r_up.png");


  //MOVE
  male_front[1] = ImageLoader.loadImage("/textures/Man_Pg/pg_move_l/pg_move_l_front.png");
  male_left[1] =ImageLoader.loadImage("/textures/Man_Pg/pg_move_l/pg_move_l_left.png");
  male_right[1] =ImageLoader.loadImage("/textures/Man_Pg/pg_move_l/pg_move_l_right.png");
  male_up[1] = ImageLoader.loadImage("/textures/Man_Pg/pg_move_l/pg_move_l_up.png");
  
  
  male_front[2] =ImageLoader.loadImage("/textures/Man_Pg/pg_move_r/pg_move_r_front.png");
  male_left[2] =ImageLoader.loadImage("/textures/Man_Pg/pg_move_r/pg_move_r_left.png");
  male_right[2] =ImageLoader.loadImage("/textures/Man_Pg/pg_move_r/pg_move_r_right.png");
  male_up[2] =ImageLoader.loadImage("/textures/Man_Pg/pg_move_r/pg_move_r_up.png");

  
  vuoto = ImageLoader.loadImage("/textures/BackGround/void.png");
  //SFONDI
  
  grass = ImageLoader.loadImage("/textures/BackGround/grass.png");
  rock = ImageLoader.loadImage("/textures/BackGround/rock_grass.png");
  tree = ImageLoader.loadImage("/textures/BackGround/tree.png");
 }
}

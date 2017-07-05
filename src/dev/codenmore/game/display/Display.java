package dev.codenmore.game.display;

import javax.swing.JFrame;
import java.awt.Canvas;
import java.awt.Dimension;

public class Display 
{
 private JFrame display;
 private Canvas canvas;
 
 private String title;
 private int width, height;
 
 public Display(String title, int width, int height)
 {
  this.title=title;
  this.width=width;
  this.height=height;
  
  createDisplay();
 }
 
 private void createDisplay()
 {
  display = new JFrame(title);
  display.setSize(width, height);
  display.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  display.setResizable(false);
  display.setLocationRelativeTo(null);
  display.setVisible(true);
 
  canvas = new Canvas();
  canvas.setPreferredSize(new Dimension(width, height));
  canvas.setMaximumSize(new Dimension(width, height));
  canvas.setMinimumSize(new Dimension(width, height));
  canvas.setFocusable(false);
  
  display.add(canvas);
  display.pack();
  
 }
 
 public Canvas getCanvas()
 {
	 return canvas;
 }
 
 public JFrame getFrame()
 {
	 return display;
	
 }
}

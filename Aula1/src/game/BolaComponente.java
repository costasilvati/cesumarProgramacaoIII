package game;

import java.awt.*;
import java.util.*;
import javax.swing.*;

/**
 * O componente que desenha a bola.
 * @version 1.34 2012-01-26
 * @author Cay Horstmann
 */
public class BolaComponente extends JPanel{
   private static final int LARGURA = 450;
   private static final int ALTURA = 350;

   private java.util.List<Ball> balls = new ArrayList<>();

   /**
    * Adiciona a bola ao componente.
    * @param b a bola adicionada
    */
   public void add(Ball b){
      balls.add(b);
   }

   public void paintComponent(Graphics g){
      super.paintComponent(g); // erase background
      Graphics2D g2 = (Graphics2D) g;
      for (Ball b : balls){
         g2.fill(b.getShape());
      }
   }
   
   @Override
   public Dimension getPreferredSize() { 
       return new Dimension(LARGURA, ALTURA); 
   }
}

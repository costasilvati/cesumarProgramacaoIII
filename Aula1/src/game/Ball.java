package game;

import java.awt.geom.*;

/**
 * Uma bola que desenvolve movimentos em uma janela
 * @version 1.33 2007-05-17
 * @author Cay Horstmann
 */
public class Ball{
   private static final int XSIZE = 15;
   private static final int YSIZE = 15;
   private double x = 0;
   private double y = 0;
   private double dx = 1;
   private double dy = 1;

   /**
    * Movimenta a bola para a próxima posição, revertendo a diração caso encontre arestas
    */
   public void mover(Rectangle2D limites){
      x += dx;
      y += dy;
      if (x < limites.getMinX()){
         x = limites.getMinX();
         dx = -dx;
      }
      if (x + XSIZE >= limites.getMaxX()){
         x = limites.getMaxX() - XSIZE;
         dx = -dx;
      }
      if (y < limites.getMinY()){
         y = limites.getMinY();
         dy = -dy;
      }
      if (y + YSIZE >= limites.getMaxY()){
         y = limites.getMaxY() - YSIZE;
         dy = -dy;
      }
   }

   /**
    * Obtem o formato da bola em sua posição atual.
    */
   public Ellipse2D getShape(){
      return new Ellipse2D.Double(x, y, XSIZE, YSIZE);
   }
}

package bounce;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * Exibe uma bola que executa um trajeto aleatório no Frame.
 */
public class Bounce{
   public static void main(String[] args){
      EventQueue.invokeLater(new Runnable(){
            public void run(){
               JFrame frame = new BounceFrame();
               frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
               frame.setVisible(true);
            }
         });
   }
}


package game;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * Exibe uma animação com um elemento gráfico em formato de bola.
 * @version 1.33 2007-05-17
 * @author Cay Horstmann
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

/**
 * A janela com bola e botões.
 */
class BounceFrame extends JFrame{
   private BolaComponente comp;
   public static final int STEPS = 1000;
   public static final int DELAY = 3;

   /**
    * Construção da janela com os componentes para exibição da animação e, botões Jogar e Fechar
    */
   public BounceFrame() {
      setTitle("Jogo");

      comp = new BolaComponente();
      add(comp, BorderLayout.CENTER);
      JPanel buttonPanel = new JPanel();
      addButton(buttonPanel, "Jogar", new ActionListener(){
            public void actionPerformed(ActionEvent event){
               addBall();
            }
         });

      addButton(buttonPanel, "Fechar", new ActionListener()
         {
            public void actionPerformed(ActionEvent event)
            {
               System.exit(0);
            }
         });
      add(buttonPanel, BorderLayout.SOUTH);
      pack();
   }

   /**
    * Adiciona o botão ao container.
    * @param c container
    * @param titulo título do botão
    * @param ouvinte o ouvente de ações (action listener)
    */
   public void addButton(Container c, String titulo, ActionListener ouvinte){
      JButton botao = new JButton(titulo);
      c.add(botao);
      botao.addActionListener(ouvinte);
   }

   /**
    * Aiciona uma bola ao painel e faz ela saltar 1.000 vezes
    */
   public void addBall(){
      try{
         Ball ball = new Ball();
         comp.add(ball);

         for (int i = 1; i <= STEPS; i++){
            ball.mover(comp.getBounds());
            comp.paint(comp.getGraphics());
            Thread.sleep(DELAY);
         }
      }catch (InterruptedException e){
      }
   }
}

package bounce;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * O frame with a bola e botões.
 */
class BounceFrame extends JFrame{
   private BallComponent bola;
   public static final int STEPS = 1000;
   public static final int DELAY = 3;

   /**
    * Construção do frame com a bola que será exibida e botões de Iniciar a Encerrar
    */
   public BounceFrame(){
      setTitle("Game");

      bola = new BallComponent();
      add(bola, BorderLayout.CENTER);
      JPanel buttonPanel = new JPanel();
      addButton(buttonPanel, "Iniciar", new ActionListener(){
            public void actionPerformed(ActionEvent event){
               addBall();
            }
         });

      addButton(buttonPanel, "Fechar", new ActionListener(){
            public void actionPerformed(ActionEvent event){
               System.exit(0);
            }
         });
      add(buttonPanel, BorderLayout.SOUTH);
      pack();
   }

   /**
    * Adiciona um botão a Janela.
    * @param c a Janela
    * @param title o texto do botão
    * @param listener o ouvinte de ações (ActionListener do botão
    */
   public void addButton(Container c, String title, ActionListener listener){
      JButton button = new JButton(title);
      c.add(button);
      button.addActionListener(listener);
   }

   /**
    * Adciona uma bola a Janela e faz ela se movimentar 1.000 vezes
    */
   public void addBall(){
      try{
         Ball ball = new Ball();
         bola.add(ball);

         for (int i = 1; i <= STEPS; i++){
            ball.move(bola.getBounds());
            bola.paint(bola.getGraphics());
            Thread.sleep(DELAY);
         }
      }
      catch (InterruptedException e){
      }
   }
}


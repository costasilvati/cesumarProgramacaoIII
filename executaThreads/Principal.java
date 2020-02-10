package aula1;

// Impressão de múltiplas threads em diferentes intervalos.
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class Principal {
    public static void main(String[] args) {
      ExibeTarefa tarefa1;
      tarefa1 = new ExibeTarefa("thread1");
      ExibeTarefa tarefa2 = new ExibeTarefa("thread2");
      ExibeTarefa tarefa3 = new ExibeTarefa("thread3");
      System.out.println("Iniciando threads...");
      ExecutorService threadExecutor;
      threadExecutor = Executors.newFixedThreadPool(3);
      threadExecutor.execute(tarefa1);
      threadExecutor.execute(tarefa2);
      threadExecutor.execute(tarefa3);
      threadExecutor.shutdown();
      System.out.println("Threads iniciadas, main terminou");
    } // fim do main
} // fim da classe RunnableTester 


/**************************************************************************
 * (C) Copyright 1992-2005 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/

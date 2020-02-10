package aula1;

// Classe PrintTask dorme por um tempo aleatório de 0 a 5 segundos
import java.util.Random;

class ExibeTarefa implements Runnable {
    private int sleepTime; 
    private String threadName;
    private static Random rand = new Random();

    public ExibeTarefa(String name) {
        threadName = name; 
        sleepTime = rand.nextInt(5000);
    } 

    // método run é o código a ser executado pela nova thread 
  public void run() {
    try {
       System.out.println("Thread " + threadName);
       System.out.println("Dormindo por "+ sleepTime + " milisegundos");
       Thread.sleep(sleepTime);
    } catch (InterruptedException exception) {
        exception.printStackTrace();
    } 
    System.out.println( threadName + " acordou!!");
  } 
}


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


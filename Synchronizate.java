public class Synchronizate {

  public synchronized void synchronizedMethod() {
      for (int i = 0; i < 10; i++) {
          System.out.println("synchronized - Count: " + i);
          try {
              Thread.sleep(100);
          } catch (InterruptedException e) {
              e.printStackTrace();
          }
      }
  }

  public static synchronized void staticSynchronizedMethod() {
      for (int i = 0; i < 10; i++) {
          System.out.println("static synchronized - Count: " + i);
          try {
              Thread.sleep(100);
          } catch (InterruptedException e) {
              e.printStackTrace();
          }
      }
  }

  public static void main(String[] args) {
      Synchronizate obj = new Synchronizate();

      // Non-static synchronized method
      Thread t1 = new Thread(new Runnable() {
          @Override
          public void run() {
              obj.synchronizedMethod();
          }
      });

      // Static synchronized method
      Thread t2 = new Thread(new Runnable() {
          @Override
          public void run() {
              staticSynchronizedMethod();
          }
      });

      // Start the first thread
      t1.start();

      try {
          // Wait for t1 to finish before starting t2
          t1.join();
      } catch (InterruptedException e) {
          e.printStackTrace();
      }

      // Start the second thread after the first one has finished
      t2.start();
  }
}

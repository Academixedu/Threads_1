public class Synchronizate {

  // Synchronized method (locks on the instance)
  public synchronized void instanceMethod() {
      for (int i = 0; i < 5; i++) {
          System.out.println("Instance method - " + i);
          try {
              Thread.sleep(100); // Pause to simulate work
          } catch (InterruptedException e) {
              e.printStackTrace();
          }
      }
  }

  // Static synchronized method (locks on the class)
  public static synchronized void staticMethod() {
      for (int i = 0; i < 5; i++) {
          System.out.println("Static method - " + i);
          try {
              Thread.sleep(100); // Pause to simulate work
          } catch (InterruptedException e) {
              e.printStackTrace();
          }
      }
  }

  public static void main(String[] args) {
      // Create an instance of the Synchronizate class
      Synchronizate obj = new Synchronizate();

      // Thread for instanceMethod
      new Thread(() -> obj.instanceMethod()).start();

      // Another thread for instanceMethod
      new Thread(() -> obj.instanceMethod()).start();

      // Thread for staticMethod
      new Thread(() -> Synchronizate.staticMethod()).start();

      // Another thread for staticMethod
      new Thread(() -> Synchronizate.staticMethod()).start();
  }
}

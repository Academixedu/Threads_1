


public class Synchronizate {

  public synchronized void instanceMethod() {
    for (int i = 0; i < 5; i++) {
      System.out.println(Thread.currentThread().getName() + " " + i);
    }
  }

  // Static synchronized method
  public static synchronized void staticMethod() {
    for (int i = 0; i < 5; i++) {
      System.out.println(Thread.currentThread().getName() + " - Static Method: " + i);
    }
  }

  public static void main(String[] args) {
    Synchronizate sync = new Synchronizate();

    Thread t1 = new Thread(() -> sync.instanceMethod(), "Thread 1");
    Thread t2 = new Thread(() -> sync.instanceMethod(), "Thread 2");

    Thread t3 = new Thread(Synchronizate::staticMethod, "Thread 3");
    Thread t4 = new Thread(Synchronizate::staticMethod, "Thread 4");

    t1.start();
    t2.start();
    t3.start();
    t4.start();
  }
}
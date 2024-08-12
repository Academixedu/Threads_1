public class Synchronizate{
  // Show The Difference Between Synchronized and static synchronized and print both functions
  public  synchronized void synchronizateMethod(){
    for (int i = 0; i < 5; i++) {
      System.out.println(Thread.currentThread().getName());
    }
  }

  public static synchronized void staticSynchronizateMethod(){
    for (int i = 0; i < 5; i++) {
      System.out.println(Thread.currentThread().getName());
    }
  } 

  public static void main(String[] args) {
    Synchronizate sync = new Synchronizate();


    Thread t1=new Thread(() -> sync.synchronizateMethod());
    t1.setName("Thread 1");
    t1.start();

    Thread t2=new Thread(() -> Synchronizate.staticSynchronizateMethod());
    t2.setName("Thread 2");
    t2.start();
    

  }

  
}

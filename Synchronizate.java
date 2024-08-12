public class Synchronizate{
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
    t1.setName("Mani");
    t1.start();

    Thread t2=new Thread(() -> Synchronizate.staticSynchronizateMethod());
    t2.setName("Charan");
    t2.start();
  }
}
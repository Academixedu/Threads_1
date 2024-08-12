public class Synchronizate{
  // Show The Difference Between Synchronized and static synchronized and print both functions
 public synchronized void m1() {
  for(int i=0;i<5;i++) {
    System.out.println(Thread.currentThread().getName());
  }
}
  public static synchronized void m2() {
    for(int i=0;i<5;i++) {
      System.out.println(Thread.currentThread().getName());
    }
  }
   
  
  public static void main(String[] args) {
     Synchronizate obj = new Synchronizate();
    // Thread t1 = new Thread() {
    //   @Override
    //   public void run() {
    //     obj.m1();
    //   }
      
    // };
    // t1.start();
    // Synchronizate obj2 = new Synchronizate();
    // Thread t2 = new Thread() {
    //   @Override
    //   public void run() {
    //    obj2.m1();
    //   }
    // };
    
    //t2.start(); 

    Synchronizate obj3 = new Synchronizate();
    Thread t3 = new Thread() {
      @Override
      public void run() {
        obj3.m2();
      }
      
    };
    t3.start();
    Synchronizate obj4 = new Synchronizate();
    Thread t4 = new Thread() {
      @Override
      public void run() {
       obj4.m2();
      }
    };
    t4.start();
  }
}
   

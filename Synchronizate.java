public class Synchronizate{
  // Show The Difference Between Synchronized and static synchronized and print both functions
  public synchronized void m1(){
    for(int i=0;i<5;i++){
      System.out.println("synchronized"+Thread.currentThread().getName());
    }
  }

  public static synchronized void m2(){
    for(int i=0;i<5;i++){
      System.out.println("Static synchronized"+Thread.currentThread().getName());
    }
  }

  public static void main(String[] args) {
    Synchronizate s = new Synchronizate();
    Thread t = new Thread(){
    public void run(){
      s.m1();
    }
  };
  t.start();
    Synchronizate s1 = new Synchronizate();
    Thread t1 = new Thread(){
    public void run(){
      s1.m1();
    }
  };
  t1.start();

  }
}

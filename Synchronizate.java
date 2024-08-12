public class Synchronizate{
    public static synchronized void m1()
    {
        for(int i =1;i<5;i++)
        {
            System.out.println(Thread.currentThread().getName());
        }
    }

    public synchronized void m2()
    {
        for(int i =1;i<5;i++)
        {
            System.out.println(Thread.currentThread().getName());
        }
    }
    public static void main(String[] args) 
    {
        Synchronizate s=new Synchronizate();
        Thread t=new Thread()
        {
            public void run()
            {
                s.m1();
            }
        };
        t.start();
        Synchronizate s1=new Synchronizate();
        Thread t1=new Thread()
        {
            public void run()
            {
                s1.m1();
            }
        };
        t1.start();
    }
}

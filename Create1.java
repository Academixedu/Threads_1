

public class Create1 implements Runnable{
    // implement Runnable and Post The Sub Class Object in to Thread and run the Logic to print Threadname for 10 times

public void run(){
    for(int i=0;i<5;i++){
        System.out.println(Thread.currentThread().getName());
    }
}

public static void main(String[] args) {
    Create1 c = new Create1();
    Thread t = new Thread(c);
    t.start();
    for(int i=0;i<5;i++){
        System.out.println(Thread.currentThread().getName());
    }
}

}


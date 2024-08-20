public class Create1{
    // implement Runnable and Post The Sub Class Object in to Thread and run the Logic to print Threadname for 10 times
    public class Create1 implements Runnable{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("Thread Name : "+i+" "+Thread.currentThread().getName());
        }
    }
    public static void main(String[] args) {
        Create1 create = new Create1();
        Thread thread = new Thread(create);
        thread.start();
    }
}
}
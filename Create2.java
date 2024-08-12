public class Create2{
// Prepare a Thread Object and Override run() method in it using Anomous class Approach

    public static void main(String args[]){
        Thread thread=new Thread(new Runnable(){
            public void run(){
                for(int i=0;i<10;i++){
                    System.out.println(Thread.currentThread().getName());
                }
            }
        });

        thread.setName("Thread 1..");
        thread.start();
    }
}

public class Create2{
// Prepare a Thread Object and Override run() method in it using Anomous class Approach
// Create a Thread object using anonymous class

    public static void main(String[] args) {
        Thread t=new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + " - " + i);
                }
            }
        };
        t.start();
    }
        

}

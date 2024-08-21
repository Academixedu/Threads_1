public class Create2{
    public static void m(){
        for(int i=1;i<=10;i++){
            System.out.println(Thread.currentThread().getName());
        }
    }
    public static void main(String[] args) {
        Thread t=new Thread(){
            public void run(){
                m();
            }
        };
        t.start();
    }
// Prepare a Thread Object and Override run() method in it using Anomous class Approach
}

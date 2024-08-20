public class Create2{
// Prepare a Thread Object and Override run() method in it using Anomous class Approach
   public static void a1(){
    for (int i=1;i<=5; i++){
        System.out.println(Thread.currentThread()+ " " + i);
    }
   }
   public static void main(String[] args) {
    Thread n = new Thread(){
        @Override
        public void run(){
            a1();
        }
    };n.start();
   }
}

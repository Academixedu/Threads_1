public class Create2{
// Prepare a Thread Object and Override run() method in it using Anomous class Approach
public static void m1(){
    for(int i=1;i<=5;i++){
        System.out.println("Hello "+i+ " " +Thread.currentThread().getName());

    }
}
public static void main(String[] args) {
    Thread t1=new Thread(){
        @Override
        public void run(){
         m1();
        }
    }; t1.start();
    Thread t2=new Thread(){
        @Override
        public void run(){
         m1();
        }
    }; t2.start();
}
}

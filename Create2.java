public class Create2{
// Prepare a Thread Object and Override run() method in it using Anomous class Approach
public static void A1(){
    for(int i=0;i<=10;i++){
        System.out.println(Thread.currentThread().getName());
    }
}
public static void main(String[] args) {
    Thread T = new Thread(){
        public void run(){
            A1();
        }
    };
    T.start();
}
}

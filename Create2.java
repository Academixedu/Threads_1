public class Create2 {
// Prepare a Thread Object and Override run() method in it using Anomous class Approach
public static void k1(){
    for(int i=0;i<10;i++){
        System.out.println(Thread.currentThread().getName()+" "+i);
    }
}
public static void main(String[] args) {
    Thread k = new Thread(){
        @Override
        public void run(){
            k1();
        }
    };
    k.start();
}
}

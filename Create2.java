public class Create2{
public static void threadName(){
    for(int i=0;i<10;i++){
        System.out.println("Thread Name : "+i+" "+Thread.currentThread().getName());
    }
}
public static void main(String[] args) {
    Thread thread = new Thread(){
        @Override
        public void run(){
            threadName();
        }
    };
    thread.start();
    }
}

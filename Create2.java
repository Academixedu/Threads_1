public class Create2{
// Prepare a Thread Object and Override run() method in it using Anomous class Approach
public static void main(String[] args) {
    Thread thr = new Thread() {
        @Override
        public void run() {
            for (int i = 1; i < 10; i++) {
                System.out.println(Thread.currentThread().getName());
            }
        }
    };
    thr.start();
}}

 public class Create2{
    // Prepare a Thread Object and Override run() method in it using Anomous class Approach
    public static void s(){
        for(int i=1;i<=10;i++){
            System.out.println("Thread2:"+i);
        }
    }
    public static void main(String[] args) {
        Thread t1= new Thread(){
            @Override
            public void run(){
        s();

            }
        };
        t1.start();
    }
    }

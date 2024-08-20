public class Create2{
    // Prepare a Thread Object and Override run() method in it using Anomous class Approach
    public static void name(){
        for(int i =1;i<=10;i++){
            System.out.println(i+" thread nanem : "+Thread.currentThread().getName());
        }
    }
    public static void main(String[] args){
        Thread th = new Thread(){
            public void run(){
                name();
            }
        };
        th.start();
    }
    }
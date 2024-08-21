public class Create2 { //anonymous class//
// Prepare a Thread Object and Override run() method in it using Anomous class Approach
public static void m1(){
    for(int i=1;i<=5;i++){
    System.out.println("hello " +i+ " "  +Thread.currentThread().getName());
}
}
public static void main(String args[]){
    Thread t1=new Thread(){
        public void run(){
        m1();
    }

};t1.start();
Thread t2=new Thread(){
    public void run(){
    m1();
}

};t2.start();
}}


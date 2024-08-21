public class Create1 implements Runnable{
// implement Runnable and Post The Sub Class Object in to Thread and run the Logic to print Threadname for 10 times
public void run(){
    for(int i=1;i<=10;i++){
    System.out.println("Hello "+i+ " " +Thread.currentThread().getName());
}}
public static void main(String args[]){
    Create1 m1=new Create1();//object
    Thread t=new Thread(m1);//thread creation//
    Thread t1=new Thread(m1);
    t.start();
    t1.start();
}}

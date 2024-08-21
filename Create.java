public class Create extends Thread{
// Prepare a Logic to print Thread name  for 10 times using Thread Concept
public void run(){
    for(int i=1;i<=10;i++){
    System.out.println("Hello "+i+ " " +Thread.currentThread().getName());

}}
public static void main(String args[]){
    Create m1=new Create();
    Create m2=new Create();
    
 m1.start();
 m2.start();
}
}

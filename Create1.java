public class Create1 implements Runnable{
// implement Runnable and Post The Sub Class Object in to Thread and run the Logic to print Threadname for 10 times
@Override
public void run(){
    for(int i=0;i<=9;i++){
        System.out.println("thread1:" +i);
    }

}
public static void main(String[] args) {
    Create1 c=new Create1();
    Thread t=new Thread(c);
    t.start();
}
}

public class Create extends Thread{
    public void run(){
    for(int i=1;i<=10;i++){
    System.out.println(Thread.currentThread().getName()+" "+i);
    }
    }
    
    public static void main(String args[]){
    Create thread=new Create();
    thread.setName(" Mani");
    thread.start();
    }
    }
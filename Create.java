public class Create extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("Thread Name : "+i+" "+Thread.currentThread().getName());
        }
    }
    public static void main(String[] args) {
        Create create = new Create();
        create.start();
    }
}

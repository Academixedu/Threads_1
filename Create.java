public class Create extends Thread {

    @Override
    public void run() {
        
        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + " - " + i);
          
        }
    }

    public static void main(String[] args) {

        Create thread1 = new Create();
        
        thread1.setName("Medhas");
        
        thread1.start();
    }
}

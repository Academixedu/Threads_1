public class Create2 {
    public static void main(String[] args) {
        Thread myThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread is running using anonymous class!");
            }
        });
        myThread.start();
    }
}


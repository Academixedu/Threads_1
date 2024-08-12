public class Create1 {
    public static void main(String[] args) {
        Runnable task = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + " Count: " + i);
                }
            }
        };
        Thread t = new Thread(task);
        t.setName("Thread");
        t.start();
    }
}

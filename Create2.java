public class Create2 {
    public static void main(String[] args) {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + " Count: " + i);
                }
            }
        });
        t.setName("Thread");
        t.start();
    }
}

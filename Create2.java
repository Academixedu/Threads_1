public class Create2{
// Prepare a Thread Object and Override run() method in it using Anomous class Approach

    public static void main(String[] args) {
        Thread t = new Thread() {
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("hi threds");
                }
            }
        };
        t.start();
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName());
        }
}

}
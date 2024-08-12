public class Create extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(getName() + " From: " + i);
        }
    }
    public static void main(String[] args) {
        Create t = new Create();
        t.setName("Thread");
        t.start();
    }
}

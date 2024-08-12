
    public class Main {
        public static void main(String[] args) {
            PrintThread thread = new PrintThread();
            thread.setName("MyThread");
            thread.start();
        }
    }


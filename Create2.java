public class Create2{
    
        public static void main(String args[]){
            Thread thread=new Thread(new Runnable(){
                public void run(){
                    for(int i=1;i<=10;i++){
                        System.out.println(Thread.currentThread().getName()+" "+i+"..");
                    }
                }
            });
    
            thread.setName("Thread ");
            thread.start();
        }
    }
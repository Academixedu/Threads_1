public class Create1{
    public class Create implements Runnable{
        public void run(){
            for(int i=1;i<=10;i++){
                System.out.println(Thread.currentThread().getName());
            }
        }

        public static void main(String[] args) {
            Create1 de=new Create1();
            Create t1=de.new Create();
            Thread t=new Thread(t1);
            t.start();
            
           

        

          
    }

      
         

    

// implement Runnable and Post The Sub Class Object in to Thread and run the Logic to print Threadname for 10 times
}


}
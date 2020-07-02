public class app {
    
    //private int count = 0;
    private int count = 0;

    public synchronized void increment(){
        count++;
    }

    public static void main(String[] args){
        app app = new app();
        app.doWork();
    }

    public void doWork() {
        Thread t1 = new Thread(new Runnable() {
            public void run(){
                for(int i = 0; i < 10000; i ++){
                    //count++;
                    increment();
                }
            }
        });

        Thread t2 = new Thread(new Runnable(){
            public void run(){
                for(int i = 0; i < 10000; i++){
                    // This is three steps
                    // count = count + 1;
                    //count++;
                    increment();
                }
            }
        });

        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        } catch(InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("Count is: " + count);
    }
}

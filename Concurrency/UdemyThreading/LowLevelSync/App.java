public class App {
    public static void main(String[] args) throws InterruptedException {
        final Processor processor = new Processor();

        Thread t1 = new Thread(new Runnable(){

            @Override
            public void run() {
                try {
                    processor.produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread t2 = new Thread(new Runnable(){

            @Override
            public void run() {
                try {
                    processor.consume();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        
        t1.start();
        t2.start();
        
        t1.join();
        t2.join();

        // pause for 30 seconds anf roce quitting the app (looping indef)
        Thread.sleep(300000);
        System.exit(0);
    }
}

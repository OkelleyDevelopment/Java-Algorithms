class RunnerRunnable implements Runnable {

    @Override
    public void run(){
        for(int i = 0; i < 5; i++){
            System.out.println("Hello: " + i + " Thread: " + Thread.currentThread().getName());
            try{
                Thread.sleep(100);
            } catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

public class simpleThread {
    public static void main(String[] args){
        Thread firstThread = new Thread(new RunnerRunnable());
        Thread secondThread = new Thread(new RunnerRunnable());
        firstThread.start();
        secondThread.start();
    }
}

import java.util.Scanner;

class Processor extends Thread {

    private volatile boolean running = true;

    public void run(){
        while(running){
            System.out.println("Loop in a thread till we find the abyss");

            try{
                Thread.sleep(100);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
    
    public void shutdown(){
        running = false;
    }

}

public class app {
    public static void main(String[] args){
        Processor proc1 = new Processor();
        proc1.start();

        System.out.println("Press return to stop ... ");
        Scanner scan = new Scanner(System.in);
        scan.nextLine();

        proc1.shutdown();
        scan.close();
    }
}

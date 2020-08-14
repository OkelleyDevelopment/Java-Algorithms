import java.util.LinkedList;
import java.util.Random;

public class Processor {

    private LinkedList<Integer> list = new LinkedList<Integer>();
    private final int LIMIT = 10;
    private Object lock = new Object();


    public void produce() throws InterruptedException {
        int value = 0;

        while(true){
            synchronized (lock){
                while (list.size() == LIMIT) {
                    lock.wait();
                }

                list.add(value);
                System.out.println("Producer added: " + value + " queue size is " + list.size());
                value++;
                lock.notify();
            }
        }
    }

    public void consume() throws InterruptedException {

        Random random = new Random();
        while (true) {
            synchronized (lock){
                while (list.size() == LIMIT) {
                    lock.wait();
                }
                System.out.print("List size is: " + list.size());
                int value = list.removeFirst();
                System.out.println("; Value is: " + value);
                lock.notify();
            }
        // Sleep on avg half a second
        Thread.sleep(random.nextInt(1000));
        }
    }
}

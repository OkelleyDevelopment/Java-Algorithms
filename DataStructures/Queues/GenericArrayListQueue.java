
import java.util.ArrayList;


/**
 * THis class implements a Generic ArrayList Queue.
 *
 * @author Nicholas O'Kelley
 *
 */
public class GenericArrayListQueue<T> {

	// An array list representing the queue.
	ArrayList<T> queue = new ArrayList<T>();

	private boolean hasElements(){
		return !queue.isEmpty();
	}


	/**
	 * 
	 * * Checks what's at the front of the queue
     	 *
     	 * @return If queue is not empty, element at the front of the queue. Otherwise, null
     	 */
	public T peek(){
		T result = null;
		if(this.hasElements()){
			result = queue.get(0);
		}
		return result;
	}

	/**
	 * Retrieves the item at the front of the queue.
	 *
	 * @return element retrieved, null if empty.
	 */
	public T poll(){
		T result = null;
		if(this.hasElements()){
			result = queue.remove(0);
		}

		return result;
	}


	/**
	 * Inserts an element of type T into the queue.
	 *
	 * @return true if the element is added. False otherwise.
	 */
	public boolean add(T element){
		return queue.add(element);
	}


	/**
	 * The main method.
	 *
	 * @param args - not used in this implementation
	 */
	public static void main(String[] args){
		GenericArrayListQueue<Integer> queue = new GenericArrayListQueue<Integer>();

		queue.add(300);
		queue.add(400);

		System.out.println("the peak element of the queue is(by peeking) " + queue.peek());
        	System.out.println("the peak element of the queue is(by polling) " + queue.poll());
        	//System.out.println("element 300 removed " + queue.remove(300));
        	System.out.println(queue);


		}
	
}


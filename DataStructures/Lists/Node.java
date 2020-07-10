/**
 * A simple Node class that has a part of data
 * and a pointer to the next node in the sequence.
 *
 * @author Nicholas O'Kelley
 *
 * @version July 5, 2020
 *
 **/
/**
 * Node
 */
public class Node {

    // A variable to hold the data of the node
    private int data;

    // Node to point to the next in the list
    Node next;

    /**
     * Constructor
     *
     * @param data - the data to be placed in the node
     **/
    public Node(int data){
        this(data, null);
    }

    public Node(int data, Node next){
        this.data = data;
        this.next = next;
    }

}

/**
 * A simple implementation of a linked list
 * in Java as review.
 *
 * @author Nicholas O'Kelley
 * 
 * @version July 9, 2020
 **/

public class SingleLinkedList {

    // Head is used to reference the front/ start of the list
    private Node head;
    
    // An int variable to keep track of the size of the list
    private int size;

    /**
     * A default constructor
     **/
    public SingleLinkedList(){
        this.head = new Node(0);
        this.size = 0;
    }

    public SingleLinkedList(Node start, int size){
        this.head = start;
        this.size = size;
    }
}

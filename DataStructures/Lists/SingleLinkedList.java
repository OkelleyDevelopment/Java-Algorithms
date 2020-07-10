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


    public void insertHead(int data){
        insertAtPos(data, this.size);
    }

    public void insert(int data){
        insertAtPos(data, size);
    }

    public void insertAtPos(int data, int position){
        if(position < 0 || position > this.size){
            throw new IndexOutOfBoundsException();
        }

        Node current = head;
        for (int i = 0; i < position; i++) {
            current = current.next;
        }

        Node n = new Node(data);
        n.next = current.next;
        current.next = n;
        size++;
    }

    public void deleteHead(){
        deleteAtPos(size - 1);
    }

    public void deleteAtPos(int pos){
        // Check the bounds
        if(pos < 0 || pos > this.size){
            throw new IndexOutOfBoundsException();
        }

        // Current node will start at the head of the list
        Node current = head;

        // Iterate to the position in the list
        for (int i = 0; i < pos; i++) {
            current = current.next;
        }

        // Set the current nodes next pointer to the node
        // after the immediate next node
        current.next = current.next.next;
        // Update the size variable
        size--;
    }


    /**
     * A method to clear the list, setting all nodes
     * to NULL and letting Java Garbage collection 
     * take care of the clean up.
     *
     * @param none
     *
     * @return none
     **/
    public void clear(){
        if(size == 0){
            return;
        }
        Node prev = head.next;
        Node curr = prev.next;

        while(curr != null){
            prev = null; // Set the Node to null to let GC take over
            prev = curr; // Set the previous node to the current
            curr = curr.next; // Set the current to the next node
        }
        prev = null;
        head.next = null;
        this.size = 0;
    }

    public boolean isEmpty(){
        return this.size == 0;
    }

    public int size(){
        return this.size;
    }


    @Override
    public String toString(){
        if(size == 0){
            return "Empty List.";
        }

        StringBuilder builder = new StringBuilder();
        Node curr = head.next;
        while(curr != null){
            builder.append(curr.data).append(" --> ");
            curr = curr.next;
        }
        return builder.replace(builder.length() - 2, builder.length(), "").toString();
    }


    public static void main(String[] args) {
        SingleLinkedList list = new SingleLinkedList();
        
        assert list.isEmpty();
        assert list.toString().equals("Empty List.");

        list.insertHead(4);
        list.insertHead(9);
        list.insertHead(11);
        assert list.toString().equals("11->9->4");

        list.deleteHead();
        assert list.toString().equals("9->4");

        list.insertAtPos(10, 2);
        assert list.toString().equals("9->4->10");

        list.deleteAtPos(1);
        assert list.toString().equals("9->10");

        list.clear();
        assert list.isEmpty();
    }

}

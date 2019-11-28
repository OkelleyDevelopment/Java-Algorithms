
import java.util.*;

/**
 * 
 * This class models a simple adjacency list graph.  
 *
 * @author Nicholas O'Kelley
 *
 * @version 1.0
 *
 * @since October 30, 2019
 */
public class Graph{
	
	// Max number of vertices
	int vertex;

	// A linkedList that holds the all the vertices. 
	private LinkedList<Integer> vertices[];


	/**
	 * Constructor that initalizes the graph.
	 *
	 * @param vertex - maximum number of vertices.
	 */
	public Graph(int vertex){
		this.vertex = vertex;
		vertices = new LinkedList[vertex];
		for(int i = 0; i < vertex; i++){
			vertices[i] = new LinkedList<>();
		}
	}
	

	/**
	 * This method adds the edges to the list with
	 * the src and then the connected vertex (dest)
	 * at the end.
	 *
	 * @param src - value for the first vertex
	 *
	 * @param dest - value for the second vertex
	 *
	 */
	public void addEdge(int src, int dest){
		
		// add edge to the list
		vertices[src].addFirst(dest);
		
		vertices[dest].addFirst(src);

	}
	
	/**
	 *
	 * This method iterates over the entire list of vertices and 
	 * prints out the connections.
	 *
	 */
	public void printGraph(){
		for(int i = 0; i < vertex; i++){
		    if(vertices[i].size()>0) {
                	System.out.print("Vertex " + i + " is connected to: ");
               	 	for (int j = 0; j < vertices[i].size(); j++) {
                    		System.out.print(vertices[i].get(j) + " ");
                	}	
                	System.out.println();
            	    }
        	}	
    	}



	/**
	 * Driver for the graph
	 */
	public static void main(String[] args){
		int vertices = 7;
		Graph graph = new Graph(vertices);

		graph.addEdge(0, 1);
		graph.addEdge(0, 4);
		graph.addEdge(1, 2);
            	graph.addEdge(1, 3);
            	graph.addEdge(1, 4);
            	graph.addEdge(2, 3);
            	graph.addEdge(3, 4);
            
            	graph.printGraph();
	}
	
}






import java.util.*;

/**
 * 
 * This class models a weighted graph, where  only unique verticies are 
 * valid. 
 *
 * @author Nicholas O'Kelley
 *
 * @version 1.0
 *
 * @since October 30, 2019
 */
public class Graph2{

	public enum location { UNVISITED, VISITED};
	public enum State { COMPLETE };
	
	// Keep  track of vertices
	private ArrayList<Vertex> vertices;
	
	// keep track of the edges
	private ArrayList<Edge> edges;


	/**
	 * Default constructor
	 */
	public Graph2(){
		vertices = new ArrayList<>();
		edges = new ArrayList<>();
	}

	/**
	 * Creates Edge from two values T in the order: from -- to.
	 *
	 * @param from - value for the first vertex
	 *
	 * @param to - value for the second vertex
	 *
	 * @param weight - weight to of the edge
	 *
	 */
	public void addEdge(T from, T to, int weight){

		Edge temp = findEdge(from, to);

		// This allows us to check and stop the creation of duplicate vertices.
		//
		if( temp != null){

			System.out.println("Edge " + from + "," + to +  " already exists. Changing weight.");
			temp.cost = cost;
		}
		else{
			// this should create the vertices
			Edge e = new edge(from, to, weight);
			edges.add(e);
		}
	}


	/**
	 * Finds the vertex in the Graph.
	 *
	 * @param v - value of type T
	 *
	 * @return Vertex or null if not found
	 *
	 */
	public Vertex findVertex(T v){
		
		for(Vertex e : vertices){
			if(e.value.compareTo(v) == 0){
				return each;
			}
		}
		return null;

	}



	/**
	 * Find the edge that contains the two verticies. Could be changed to
	 * a contains method, but i like this name better.
	 *
	 *
	 * @param v1 - the starting vertex
	 *
	 * @param v2 - the end vertex
	 *
	 * @return either null if no edge is found or it will return the edge. 
	 */
	private Edge findEdge(Vertex v1, Vertex v2){

		for( Edge e : edges){
			if(e.from.equals(v1) && e.to.equals(v2)){
				return e;
			}
		}
		return null;
	}


	/**
	 * Set all the states of the vertex to UNVISITED
	 *
	 *
	 */ 
	private void clearLocationFound(){
		
		for(Vertex each : vertices){
			each.location = location.UNVISITED;
		}

	}


	/**
	 * Method to test if the graph is connected.
	 *
	 * @return true if connected, false otherwise
	 */
	public boolean isConnected(){
		for(Vertex each : vertices){
			if(each.location != State.COMPLETE){
				return false;
			}

		}
		return true;
	}

	public void displayGraph(){
		for(int i = 0; i < vertices.size(); i ++){
			for(int j = 0; j < vertices.size(); j++){
				System.out.println("Vertex - " + i + " is connected to " + 
						edges.get(j).end + " with weight " + edges.get(j).weight);
			}

		}

	}


	
	public static void main(String[] args){
		int vertices = 6;
		Graph2 graph = new Graph2();

		graph.addEdge(0, 1, 4);
		graph.addEdge(0, 2, 3);
		graph.addEdge(1, 3, 2);
            	graph.addEdge(1, 2, 5);
            	graph.addEdge(2, 3, 7);
            	graph.addEdge(3, 4, 2);
            	graph.addEdge(4, 0, 4);
            	graph.addEdge(4, 1, 4);
            	graph.addEdge(4, 5, 6);

            	graph.displayGraph();
	}
	
}





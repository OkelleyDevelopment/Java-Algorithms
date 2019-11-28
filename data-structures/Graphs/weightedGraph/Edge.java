
/**
 * This class models an edge in the Graph implementation. An
 * edge contains two verticies (nodes) and a weight. If no weight is 
 * specified, default to 1. 
 *
 * This is so traversing edges is assumed to be of greater
 * distance or cost than staying at the given vertex.
 * 
 * @author Nicholas O'Kelley
 *
 */

public class Edge{

	// Beginning of the vertex
	public Vertex source;
	
	// End of the vertex
	public Vertex end;

	// The weight the edge has for traversal
	public int weight;

	/**
	 *
	 * Default constructor
	 *
	 */
	public Edge(Vertex src,Vertex end){
		this(src, end, 1);
	}
	
	/**
	 * Builds the edge
	 *
	 * @param vertex1 - first vertex in the edge
	 * 
	 * @param vertex2 - second vertex in the edge
	 *
	 * @param weight - weight of this edge
	 */
	public Edge(Vertex vertex1, Vertex vertex2, int Weight){
		this.source = vertex1;
		this.end = vertex2;
		this.weight = weight;
	}


	public Node getStartVertex(){
		return this.source;
	}

	public Node getEndVertex(){
		return this.end;
	}

	public int getWeight(){
		return this.weight;
	}

	public void setWeight(int weight){
		this.weight = weight;
	}
	
}


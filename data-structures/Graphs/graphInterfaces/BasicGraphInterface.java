/**
 * An interface of methods that provide the operations
 * for both an undirected or directed graph that is
 * weighted or unweighted.
 *
 *
 * @author Nicholas O'Kelley
 *
 * @since November 27, 2019
 *
 */
public interface BasicGraphInterface<T>{

	/**
	 * Adds a given vertex to this graph.
	 *
	 * @param vertexLabel An object that labels the new vertex and is 
	 * 		      is distinct form the labels of current vertices.
	 *
	 * @return true if the vertex is added, false otherwise.
	 */
	public boolean addVertex(T vertexLabel);


	/**
	 * Adds a weighted edge between two given distinct vertices that are currently in  this graph.
	 * The desired edge must not already be in the graph. In a directed graph,
	 * the edge points toward a second vertex.
	 * 
	 * @param start - the starting vertex of the edge
	 *
	 * @param end - the end vertex of the edge
	 *
	 * @param edgeWeight - value of the edge's weight
	 *
	 * @return True if the edge is added, false otherwise.
	 */
	public boolean addEdge(T start, T end, double edgeWeight);


	/**
	 * Adds an unweighted edge between two given distinct vertices that are currently in this graph. 
	 * The desired edge must not already be in the graph.
	 * 
	 * @param start - the starting vertex of the edge
	 *
	 * @param end - the end vertex of the edge
	 *
	 * @return True if the edge is added, false otherwise.
	 */
	public boolean addEdge(T start, T end);


	/**
	 * Checks if an edge exists between two vertices.
	 */
	public boolean hasEdge(T start, T end);

	/**
	 * Determines if the graph is empty.
	 * @return true if empty.
	 */
	public boolean isEmpty();

	/**
	 * Gets the number of vertices in the graph.
	 * @return the number of vertices in the graph
	 */
	public int getNumOfVertices();


	/**
	 * Removes all vertices and edges from the graph.
	 */
	public void clear();

}




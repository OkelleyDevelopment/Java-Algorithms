/**
 * Simple Vertex Interface
 *
 * @author Nicholas O'Kelley
 */
public interface VertexInterface<T> {

	public T getLabel();

	/**
	 * Marks the vertex as visited
	 */
	public void visit();

	/**
	 * removes this vertex from the visited
	 *
	 */
	public void unvist();

	/**
	 * Checks if the vertex has been visited
	 */
	public boolean isVisited();


	/**
	 * Connects this vertex and a given vertex with a weighted
	 * edge. The two cannot be the same and must not already have
	 * this edge between them.
	 *
	 * @param end - the end vertex of the edge
	 *
	 * @param weight - the edge weight (if any)
	 *
	 * @return true if added
	 *
	 */
	public boolean connect(VertexInterface<T> end, double weight);

	/**
	 * Connects this vertex and a given vertex with a weighted
	 * edge. The two cannot be the same and must not already have
	 * this edge between them.
	 *
	 * @param end - the end vertex of the edge
	 *
	 * @return true if added
	 *
	 */
	public boolean connect(VertexInterface<T> end);

	/**
	 * Creates an iterator of this vertex's neighbors by following
	 * all eges that begin at this vertex
	 *
	 * @return an iterator of the nieghboring vertices of this vertex
	 *
	 */
	public Iterator<VertexInterface<T>> getNeightbor



















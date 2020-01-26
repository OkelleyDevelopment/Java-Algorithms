
import java.util.ArrayList;
import java.util.HashMap;

/**
 * A node to hold the name of a point and the related edges
 * a graph. 
 *
 * @author Nicholas O'Kelley
 *
 */
public class Vertex {
	
	public String name;

	public ArrayList<Edge> adjacentEdges;
	// public List<Edge> adjacentEdges;

	// Total distance from origin
	public double distance;
	
	public boolean located;

	public Vertex prev;

	
	/**
	 * Constructor of the vertex class
	 *
	 * @param label - unique label associated with this vertex
	 */
	public Vertex(String label, int x, int y){
		this.name = label;
		this.located = false;
		this.distance = 0.0;
	}


	public Vertex(String label){
		this.name = label;
	}

	

	
	/**
	 * @param index - the index of the Edge to return
	 *
	 * @return Edge at the specified index
	 *
	 */
	public Edge getEdge(int index){
		return this.edges.get(index);
	}

	/**
	 * Gets the name
	 *
	 * @return the name
	 */
	public String getName(){
		return this.name;
	}


	/**
	 * Allows us to print the name and (X, Y) coordinates of the vertex.
	 *
	 * @return String representation of this vertex
	 */
	public String toString(){
		return this.name + " (" + this.x + ", " + this.y + ")";
	}

	/**
	 * This method provides the hash of the vertex name
	 * which allows us to ensure unique names.
	 *
	 * @return the hash code of this vertex's name.
	 */
	public int hashCode(){
		return this.name.hashCode();
	}


	/**
	 * @param other - object to compare
	 * 
	 * @return true iff other instanceof Node and the two have the
	 * 	same name and (x, y) coordinates.
	 */
	@Override
	public boolean equals(Object other){
		if(this == other){
			return true;
		}
		if(other == null){
			return false;
		}

		if(!(other instanceof Vertex)){
			return false;
		}

		Vertex n = (Vertex)other;
		return this.name.equals(n.name);
		//return this.name.equals(n.name) && this.x == n.x && this. y == n.y;
	}

}

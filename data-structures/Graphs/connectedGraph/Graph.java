

import java.util.ArrayDeque;
import java.util.Hashtable;
import java.util.ArrayList;

//TODO: Handle execeptions? 

public class Graph<T> {

	public Hashtable<Vertex<T>, ArrayList<Edge<T>>> adjacencyList = null;
	public Hashtable<Vertex<T>, Vertex<T>> connectedComponents = null;

	public Graph(){
		adjacencyList = new Hashtable<Vertex<T>, ArrayList<Edge<T>>>>();
		connectedComponents = new Hashtable<Vertex<T>, Vertex<T>>();

	}


	public Vertex<T> addVertex(T element){
		if(element == null){
			System.out.println("Check the advertex method.");
			throw new NullPointerException();
		}
		else{
			Vertex<T> v = findVertex(element(elm);
			
			if(v == null){
				v = new Vertex<T>(element);
				adjacencyList.put(v, new ArrayList<>());
				connectedComponents.put(v,v);
				
				System.out.println("Added (" + element + ")");


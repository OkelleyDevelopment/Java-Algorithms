import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * This class models a graph based on a given input file and allows
 * the user to traverse the graph in various different ways.
 *
 * @author Nicholas O'Kelley
 *
 * @version June 9, 2020
 */

public class Graph {

    private ArrayList<Vertex> vertexList;

    // Adj List where the list at each index corresponds to the vertices
    // adjacent to vertex ID 
    private ArrayList<ArrayList<Integer>> adjacencyList;

    // Adjacency matrix where a value of 1 is an edge
    private int[][] adjMatrix;

    // A stack for DFS
    private Stack stack;

    // A starting number to initalize our adjMatrix
    private final int maxVertices = 25;

    private int numOfVertices;

    public Graph(){
        this.vertexList = new ArrayList<>();
        this.adjacencyList = new ArrayList<>();
		this.adjMatrix = new int[maxVertices][maxVertices];
		
        for(int column=0; column < 20; column++){
			for(int row=0; row < 20; row++){
				adjMatrix[row][column] = 0;
			}
	    }
		stack = new Stack();
		
    }


    public void buildGraph(String inputFile){
        try{
            Scanner sc = new Scanner(new File(inputFile));

            while(sc.hasNextLine()){
                String mapData = sc.nextLine(); 

                int ID = 0;
                int neighbor = 0;
                try{
                    ID = Integer.parseInt(mapData);
                    neighbor = Integer.parseInt(mapData);
                } catch(NumberFormatException e){
                    System.out.println("ERROR: The map appears to" +
                            "have a smudge!\nPlease try another map.");
                    System.exit(0);
                }

                int largest = Math.max(ID, neighbor);
                adjMatrix[ID][neighbor] = 1;

                for(int i = vertexList.size(); i < largest + 1; i++){
                    vertexList.add(new Vertex(i));
                }

                while(adjacencyList.size() < largest + 1){
                    adjacencyList.add(new ArrayList<>());
                }

                if(!(adjacencyList.get(ID).contains(neighbor))){
                    int size = adjacencyList.get(ID).size();
                    // if the size is zero, then just add the neighbor
                    if(size == 0){
                        adjacencyList.get(ID).add(neighbor);
                    } else{
                        // Sort out the adjacencyList 
                        // and then add in the new neighbor
                        while(size != 0){
                            if(neighbor < adjacencyList.get(ID).get(size - 1)){
                                size--;
                            } else {
                                break;
                            }
                        }
                        adjacencyList.get(ID).add(size, neighbor);
                    }
                }   
            }
        } catch(FileNotFoundException e){
            System.out.println("That map is not available...");
            System.exit(0);
        } 
    }



    public void displayGraph(){
        System.out.println("\nVertex List: " + vertexList.toString() +
                "\nAdjacency List: " + adjacencyList.toString() + 
                "\n Adjacency Matrix: ");
        printMatrix(adjMatrix);

    }

    private void printMatrix(int[][] givenMatrix){
		
		System.out.print("  ");
		for(int k = 0; k < numOfVertices; k++){
			System.out.print("  "+k);
		}
		System.out.println();
		System.out.print("  ");
		for(int l = 0; l < numOfVertices; l++){
			System.out.print("  -");
		}
		System.out.println();
		for (int i = 0; i < numOfVertices; i++){
			System.out.print(i + " | ");
	        for (int j = 0; j < numOfVertices; j++){
	        	System.out.print(givenMatrix[i][j] + "  ");
	        }
	        System.out.println();
	        System.out.println();
	    }
	}
}

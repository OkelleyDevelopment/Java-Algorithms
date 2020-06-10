/**
 * The driver for my graph program. 
 *
 * @author Nicholas O'Kelley
 * @version June 10, 2020
 */
public class Driver {

    public static void main(String[]){
        if(args.length < 2 || args.length > 2){
            System.out.println("Usage: <mapName> <search>");
            Sytem.exit(0);
        }
        Graph g = new Graph();
        g.buildGraph(args[0]);
    }
}

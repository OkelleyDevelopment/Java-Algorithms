import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * The driver for my graph program. 
 *
 * @author Nicholas O'Kelley
 * @version June 10, 2020
 */
public class Driver {

    public static void main(String[] args){
        if(args.length < 1){
            System.out.println("Usage: <mapName> <search>");
            System.exit(0);
        }
        
        Scanner scan = new Scanner(System.in);
        Graph g = new Graph();
        g.buildGraph(args[0]);
        boolean running = true;

        while(running){
            try{
                Scanner source = new Scanner(System.in);
                System.out.println("Enter the source vertex #: ");
                int sourceVertex = source.nextInt();
                while(sourceVertex < 0){
                    System.out.println("Can't you read? Try again.");
                    System.out.println("Enter the source vertex #: ");
                    sourceVertex = source.nextInt();
                }

            } catch(InputMismatchException e){
                System.out.println("Can't you read? Integers are accepted here!");
            }
            try{
                Scanner dest = new Scanner(System.in);
                System.out.println("Enter the source vertex #: ");
                int destVertex = dest.nextInt();
                while(destVertex < 0){
                    System.out.println("Can't you read? Try again.");
                    System.out.println("Enter the source vertex #: ");
                    destVertex = dest.nextInt();
                }

            } catch(InputMismatchException e){
                System.out.println("Can't you read? Integers are accepted here!");
            }

            g.

        }
    }
}

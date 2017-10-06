package Maze3D;

import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * MazeTester uses recursion to determine if a maze can be traversed.
 *
 * @author Java Foundations
 * @version 4.0
 */
public class MazeTester
{
    /**
     * Creates a new maze, prints its original form, attempts to
     * solve it, and prints out its final form.
     */
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner scan = new Scanner(System.in);
//        System.out.print("Enter the name of the file containing the maze: ");
//        String filename = scan.nextLine();
        
        Maze3D labyrinth = new Maze3D("/Users/qmtruong92/School Code/CSC205/src/Maze3D/betterOne.txt");


        System.out.println(labyrinth.validPosition(2,2,2));
      
        System.out.println(labyrinth.toString());

        MazeSolver3D solver = new MazeSolver3D(labyrinth);

        if (solver.traverse(0, 0, 0))
            System.out.println("The maze was successfully traversed!");
        else
            System.out.println("There is no possible path.");

        System.out.println(labyrinth);
    }
}

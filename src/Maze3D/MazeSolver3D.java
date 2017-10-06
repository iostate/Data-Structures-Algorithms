package Maze3D;

/**
 * MazeSolver attempts to recursively traverse a Maze. The goal is to get from the
 * given starting position to the bottom right, following a path of 1's. Arbitrary
 * constants are used to represent locations in the maze that have been TRIED
 * and that are part of the solution PATH.
 *
 * @author Java Foundations
 * @version 4.0
 */
public class MazeSolver3D
{
    private Maze3D maze;

    /**
     * Constructor for the MazeSolver class.
     */
    public MazeSolver3D(Maze3D maze)
    {
        this.maze = maze;
    }

    /**
     * Attempts to recursively traverse the maze. Inserts special
     * characters indicating locations that have been TRIED and that
     * eventually become part of the solution PATH.
     *
     * @param row row index of current location
     * @param column column index of current location
     * @return true if the maze has been solved
     */
    public boolean traverse(int row, int column, int planes)
    {
        boolean done = false;

        if (maze.validPosition(row, column, planes))
        {
            maze.tryPosition(row, column, planes);   // mark this cell as tried

            if (row == maze.getRows()-1 && column == maze.getColumns()-1
                    && planes == maze.getPlanes() -1 )
                done = true;  // the maze is solved
            else
            {
                done = traverse(row+1, column, planes);      // down ||  move fwd
                if (!done)
                    done = traverse(row, column+1, planes);  // right
                if (!done)
                    done = traverse(row-1, column, planes);  // up
                if (!done)
                    done = traverse(row, column-1, planes);  // left
                if (!done)
                    done = traverse(row, column, planes+1);        // move forward
                if (!done)
                    done = traverse(row, column, planes-1);            // move backward
                if (!done)
                    done = traverse(row, column -1, planes - 1);
            }

            if (done)  // this location is part of the final path
                maze.markPath(row, column, planes);
        }
        System.out.println(maze);
        return done;
    }
}

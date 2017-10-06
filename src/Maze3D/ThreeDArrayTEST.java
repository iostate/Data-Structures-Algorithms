package Maze3D; /**
 * Created by qmtruong92 on 7/13/17.
 */

import java.util.Arrays;
import java.util.Random;

public class ThreeDArrayTEST {

   public static void main(String[] args) {

      Random rand = new Random();

      //Generate numbers 1-4
      int someNum = rand.nextInt(4) + 1;


      int[][][] three3Array = new int[3][3][3];



      for (int a = 0; a <= 2; a++) {
         for (int b = 0; b <= 2; b++) {

            for (int c = 0; c <= 2; c++) {
               three3Array[a][b][c] = c;

            }
         }
      }

printArray(three3Array);
      System.out.println("\n\n");
      System.out.println(Arrays.deepToString(three3Array));

   }

//      System.out.println(Arrays.deepToString(three3Array));
//      print3DArray(three3Array);

//      printArray(three3Array);


   public static void print3DArray(int[][][] threeDarray) {

      for (int a = 0; a <= 2; a++) {
         for (int b = 0; b <= 2; b++) {
            for (int c = 0; c <= 2; c++) {
               System.out.print(threeDarray[a][b][c]);
            }
            System.out.println();
         }
         System.out.println();
      }


   }

   public static void printArray(int matrix[][][]) {
      for (int row = 0; row < matrix.length; row++) {
         for (int column = 0; column < matrix[row].length; column++) {
            for (int plane = 0; plane < matrix[column].length; plane++) {
               System.out.print(matrix[row][column][plane] + " ");
            }
            System.out.println();
         }
         System.out.println();
      }
   }
}

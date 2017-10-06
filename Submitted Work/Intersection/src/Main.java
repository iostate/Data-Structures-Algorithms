import java.io.FileNotFoundException;

/**
 * Created by qmtruong92 on 7/11/17.
 */
public class Main {

   public static void main(String[] args) throws FileNotFoundException {
//String result = "";
//
//
//      for (int i = 0; i <= 101; i++) {
//
//
//         int directionChosen = Car.RAND.nextInt(4 - 0) + 1;
//
//         switch(directionChosen) {
//            case 1: result = "1 found";
//               break;
//            case 2: result = "2 found";
//               break;
//            case 3: result = "3 found";
//               break;
//            case 4: result = "4 found";
//               break;
//            default:
//               break;
//         }
//         System.out.println(result);
//
//
//      }

      Simulator simulator = new Simulator();
      simulator.run();

   }
}



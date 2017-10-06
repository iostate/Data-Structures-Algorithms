package Exception;

import java.io.*;
import java.util.Scanner;

public class Test {


    public static void main(String[] args) throws FileNotFoundException {

        Scanner kb = new Scanner(System.in);

        boolean fileFound = false;

        File test;


//        Scanner file = new Scanner(new File("/Users/qmtruong92/pslog.txt"));


        do {
            try {


                //Attempts to locate the file
                test = new File("/Users/qmtruong92/pslog.txt");


                //Occurs if the file is found
                fileFound = true;
                throw new FileNotFoundException("I am an exception");
            } catch (FileNotFoundException e) {

                //Occurs if the file is not found
                System.out.println("The file was not found");
                System.out.print("Please enter the new file path: ");
                String newFilePath = kb.next();
                test = new File(newFilePath);

                fileFound = false;


            }
        } while (fileFound != true);


    }


}


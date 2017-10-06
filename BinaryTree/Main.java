import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

import java.io.BufferedReader;
import java.io.FileInputStream;

/**
 * Created by qmtruong92 on 7/18/17.
 */
public class Main {

    public static final Scanner KB = new Scanner(System.in);

    public static void main(String[] args) throws FileNotFoundException {
        String filename = "";


        System.out.print("Enter the name of the file: ");
        filename = KB.nextLine();

        Scanner file = new Scanner(new File(filename));

        while (file.hasNextLine()) {

            //Intake the next line
            String currentLine = file.nextLine();
            String lineParts[];
            //Store the lines parts

            //Skip over comments
            if (currentLine.startsWith("#"))
                continue;
            else {
                lineParts = currentLine.split(" ");
            }



        }

    }


}

/*
 * CLASS: H1_43 (H1_43.java)
 * GROUP 15
 * AUTHOR 1: Emily Nesbitt, eanesbit, eanesbit@asu.edu
 * AUTHOR 2: Alan Morales, aamora14, aamora14@asu.edu
 * AUTHOR 3: Ethen Kisner, ekisner, ekisner@asu.edu
 */
package H1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class H1_43 {

    public static void main(String[] args) throws FileNotFoundException {
        //user input
        Scanner in = new Scanner(System.in);
        System.out.println("What is your file name?");
        String fname = in.nextLine();
        in.close();

        //reader
        Scanner scanner = new Scanner(new File(fname));

        //writer
        PrintWriter out = new PrintWriter(new File(fname + ".txt"));
        int count = 0;
        while (scanner.hasNextLine()) {
            count++;
            String output = scanner.nextLine();
            out.printf("[%03d] %s %n", count, output);
        }
        scanner.close();
        out.close();

    }

}

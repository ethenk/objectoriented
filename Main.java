
/*********************************************************************************************************
* CLASS: classname (classname.java)
*
* DESCRIPTION
* A description of the contents of this file.
*
* COURSE AND PROJECT INFORMATION
* CSE205 Object Oriented Programming and Data Structures, Fall 2020
* Project Number: 1
*
* GROUP INFORMATION
* AUTHOR 1: Emily Nesbitt, eanesbit, eanesbit@asu.edu
* AUTHOR 2: Alan Morales, aamora14, aamora14@asu.edu
* AUTHOR 3: Ethen Kisner, ekisner, ekisner@asu.edu
********************************************************************************************************/

import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

// Main.java
public class Main {
    public static void main(String[] pArgs) {
        new Main().run();
    }

    private void run() {
        // You will start writing code here to implement the software requirements.

        ArrayList<Integer> intList = new ArrayList<Integer>();

        try (Scanner s = new Scanner(new FileReader("./p1-in.txt"))) {
            while (s.hasNext()) {
                intList.add(s.nextInt());
            }
        } catch (FileNotFoundException intListException) {
            System.out.println("File not found");
            System.exit(-100);
        }

        ArrayList<Integer> listRunsUpCount = new ArrayList<Integer>();
        ArrayList<Integer> listRunsDnCount = new ArrayList<Integer>();

        // listRunsUpCount ← findRuns(list, RUNS_UP)
        // listRunsUpCount ← findRuns(list, RUNS_UP)

        ArrayList<Integer> listRunsCount = new ArrayList<Integer>();
        listRunsCount.addAll(listRunsUpCount);
        listRunsCount.addAll(listRunsDnCount);

        try {
            FileOutputStream file = new FileOutputStream("output.txt"); 
            try (PrintWriter pw = new PrintWriter(file)) {
            int dataList = listRunsCount.size();

            for (Integer elem : listRunsCount) {
                pw.println(elem);
            }
            pw.close();
        } catch (IOException intFileException) {
            System.out.println("IOException failure");
        }
        } catch (FileNotFoundException intListException) {
            System.out.println("Output file not found");
            System.exit(-200);
        }
    }
}
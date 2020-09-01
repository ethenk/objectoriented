
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

  public static int RUNS_UP = 1;
  public static int RUNS_DN = -1;

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
    listRunsUpCount.add(findRuns(intList, RUNS_UP));
    // listRunsDNCount ← findRuns(list, RUNS_DN)
    listRunsDnCount.add(findRuns(intList, RUNS_DN));

    ArrayList<Integer> listRunsCount = new ArrayList<Integer>();
    // Loop to add integers at same index (which represent same K value)
    for (int i = 0; i < listRunsUpCount.size(); i++) {
      listRunsCount.add(listRunsUpCount.get(i) + listRunsDnCount.get(i));
    }

    try (FileOutputStream file = new FileOutputStream("output.txt")) {
      PrintWriter pw = new PrintWriter(file);
      int dataList = listRunsCount.size();

      for (Integer elem : listRunsCount) {
        pw.println(elem);
      }
      pw.close();
    } catch (IOException intListException) { // This includes FileNotFoundException
      System.out.println("Output file not found");
      System.exit(-200);
    }
  }

  private ArrayList<Integer> findRuns(ArrayList<Integer> pList, int pDir) {

    int i = 0;
    int k = 0;

    while (i < pList.size() - 1) {

    }
  }

 	private ArrayList<Integer> mergeLists(ArrayList<Integer> pListRunsUpCount, ArrayList<Integer> pListRunsDnCount) {
		ArrayList<Integer> listRunsCount = new ArrayList<Integer>(pListRunsUpCount.size(), 0);
    //i cant figure out to make the parameters for listrunscount work
		for(int i=0; i<=pListRunsUpCount.size()-1; i++) {
			listRunsCount.set(i, pListRunsUpCount.get(i)+pListRunsDnCount.get(i));
		}
		return listRunsCount;
	}

  private ArrayList<Integer> arrayListCreate(int pSize, int pInitValue){
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0; i<pSize; i++){
			list.add(pInitValue);
		}
		return list;
	}

	private void writeOutputFile(String pFilename, ArrayList<Integer> pListRuns) throws FileNotFoundException {
    //im struggling to figure out how to use println instead of printf because with printf i cant put new lines so it all comes out as one long line 
		PrintWriter out = new PrintWriter(new File(pFilename));
		out.printf("runs_total: ", pListRuns.size());
		for (int k=1; k<=pListRuns.size()-1; k++) {
			out.printf("runs_",k," ", pListRuns.get(k));
		}
		out.close();
		
	}

  private ArrayList<Integer> readInputFile(String pFilename, ArrayList<Integer> pListRuns) throws FileNotFoundException {
		Scanner in = new Scanner( new File(pFilename));
		ArrayList<Integer> list = new ArrayList<Integer>();
		while(in.hasNext()) {
			list.add(in.nextInt());
		}
		in.close();
		return list;
	}
}
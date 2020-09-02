
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

  /*Main method that runs the program */
  private void run() {

    ArrayList<Integer> list = new ArrayList<Integer>();

    try{
      list.addAll(readInputFile("./p1-in.txt",list));
    } catch (FileNotFoundException intListException) {
      System.out.println("File not found");
      System.exit(-100);
    }

    ArrayList<Integer> listRunsUpCount = new ArrayList<Integer>();
    ArrayList<Integer> listRunsDnCount = new ArrayList<Integer>();

    // listRunsUpCount ← findRuns(list, RUNS_UP)
    listRunsUpCount.addAll(findRuns(list, RUNS_UP));
    // listRunsDNCount ← findRuns(list, RUNS_DN)
    listRunsDnCount.addAll(findRuns(list, RUNS_DN));

    ArrayList<Integer> listRunsCount = mergeLists(listRunsUpCount, listRunsDnCount);
    // Loop to add integers at same index (which represent same K value)
    for (int i = 0; i < listRunsUpCount.size(); i++) {
      listRunsCount.add(listRunsUpCount.get(i) + listRunsDnCount.get(i));
    }

    try (FileOutputStream file = new FileOutputStream("output.txt")) {
      writeOutputFile("p1-runs.txt", listRunsCount);
    } catch (IOException intListException) { // This includes FileNotFoundException
      System.out.println("Output file not found");
      System.exit(-200);
    }
  }

  //Find runs method
private ArrayList<Integer> findRuns(ArrayList<Integer> pList, int pDir) {
	    //Init ArrayList with zeros on it
        ArrayList<Integer> listRunsCount = new ArrayList<Integer>();
        for(int n = 0; n < pList.size(); n++) {
            listRunsCount.add(0);
        }
		int i = 0;
		int k = 0;
		while (i < pList.size() - 1) {
		    if (pDir==RUNS_UP && pList.get(i)<= pList.get(i+1)){
		        k++;
		    } else if (pDir==RUNS_DN && pList.get(i)>=pList.get(i+1)){
		        k++;
		    } else {
		        if(k!=0) {
		            int oldCount = listRunsCount.get(k);
		            listRunsCount.set(k, oldCount+1);
		        }
		    }
      i++;
		}
    return listRunsCount;
    }

 	private ArrayList<Integer> mergeLists(ArrayList<Integer> pListRunsUpCount, ArrayList<Integer> pListRunsDnCount) {
		ArrayList<Integer> listRunsCount = new ArrayList<Integer>();
		for(int i=0; i<pListRunsUpCount.size(); i++) {
			listRunsCount.add(0);
		}
		for(int i=0; i<=pListRunsUpCount.size()-1; i++) {
			listRunsCount.set(i, pListRunsUpCount.get(i)+pListRunsDnCount.get(i));
		}
		return (listRunsCount);
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
      out.println();
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
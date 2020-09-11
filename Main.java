
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
        listRunsCount.addAll(arrayListCreate(pList.size(), 0));
		int i = 0;
		int k = 0;
		while (i < pList.size() - 1) {
		    if (pDir==RUNS_UP && pList.get(i)<= pList.get(i+1)){
		        k++;
		    } else if (pDir==RUNS_DN && pList.get(i)>=pList.get(i+1)){
		        k++;
		    } else {
		        if(k!=0) {
		            listRunsCount.set(k, listRunsCount.get(k)+1);
                k = 0;
		        }
		    }
      i++;
		}
    return listRunsCount;
    }

  //Combines the runs up and runs down lists
 	private ArrayList<Integer> mergeLists(ArrayList<Integer> pListRunsUpCount, ArrayList<Integer> pListRunsDnCount) {
		ArrayList<Integer> listRunsCount = new ArrayList<Integer>();
    listRunsCount.addAll(arrayListCreate(pListRunsUpCount.size(), 0));
		for(int i=0; i<=pListRunsUpCount.size()-1; i++) {
			listRunsCount.set(i, pListRunsUpCount.get(i)+pListRunsDnCount.get(i));
		}
		return (listRunsCount);
   }
// short cut to create an arraylist of a certain amount of ints all assigned to 0
  private ArrayList<Integer> arrayListCreate(int pSize, int pInitValue){
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0; i<pSize; i++){
			list.add(pInitValue);
		}
		return list;
	}

//Writes run results to the output file
	private void writeOutputFile(String pFilename, ArrayList<Integer> pListRuns) throws FileNotFoundException { 
    int sum = 0;
    for(int i = 0; i<pListRuns.size(); i++){
      sum += pListRuns.get(i);
    }
		PrintWriter out = new PrintWriter(new File(pFilename));
        out.printf("runs_total: " + sum);
        out.println();
		for (int k=1; k<=pListRuns.size()-1; k++) {
            out.printf("runs_" + k + " " + pListRuns.get(k));
      out.println();
		}
		out.close();
		
	}

//input file name and create an array from inputed numbers
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
class test {
  public static void main(String[] args) {
    System.out.println("Hello world!");
  }

  test() {
    int A = 100;
  }
}

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class insertionSort {

public static void main(String[] args) {

    File file = new File("10_Random");

    try {

        Scanner sc = new Scanner(file);

        while (sc.hasNextLine()) {
            int i = sc.nextInt();
            System.out.println(i);
        }
        sc.close();
    } 
    catch (FileNotFoundException e) {
        e.printStackTrace();
    }
 }
}
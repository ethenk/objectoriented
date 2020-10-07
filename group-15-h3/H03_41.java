/*********************************************************************************************************
 * CLASS: H03_41 (H03_41.java)
 *
 * DESCRIPTION
 *Recursive linear search that returns element if found and returns -1 if element is not found
 *
 * COURSE AND PROJECT INFORMATION
 * CSE205 Object Oriented Programming and Data Structures, * Fall 2020
 * Homework Number: 3
 *
 * GROUP INFORMATION
 *AUTHOR 1:Emily Nesbitt, eanesbit, eanesbit@asu.edu
 *AUTHOR 2:Alan Morales, aamora14, aamora14@asu.edu
 *AUTHOR 3.Ethen Kisner, ekisner,ekisner@asu.edu
 ********************************************************************************************************/
public class H03_41 {
  public int recLinearSearch(ArrayList<String>pList,String pKey, int pBeginIdx, int pEndIdx){

    Integer pKey=Integer.valueOf(pKey); //String cannot be compared to Integer, convert pKey to Integer using .valueOf method
    if (pBeginIdx>pEndIdx){ //base case is reached when pBeginIdx>pEndIdx--pKey not found, return -1
      return -1;
    }else if (pList.get(pBeginIdx.equals(pKey))) { //check if element at pBeginIdx is equal to pKey 
          return pBeginIdx;
    }else {
      return recLinearSearch(pList,pKey,pBeginIdx+1,pEndIdx); //recursive method call to search pList at elements pBeginIdx+1 to pEndIdx 
    }
  }


 


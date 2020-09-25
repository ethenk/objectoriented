/*********************************************************************************************************
 * CLASS: H03_31 (H03_31.java)
 *
 * DESCRIPTION
 * Return sum of first postive n numbers
 *
 * COURSE AND PROJECT INFORMATION
 * CSE205 Object Oriented Programming and Data Structures, Fall 2020
 * Homework Number: 3
 *
 * GROUP INFORMATION
 * AUTHOR 1: Emily Nesbitt, eanesbit, eanesbit@asu.edu
 * AUTHOR 2: Alan Morales, aamora14, aamora14@asu.edu
 * AUTHOR 3: Ethen Kisner, ekisner, ekisner@asu.edu
 ********************************************************************************************************/

class H03_31 {
    public static int sum1toN(int n) { // You may assume n 1≥
        if (n > 0) {
            return n + sum1toN(n - 1);
        } else {
            return 0;
        }
    }
}
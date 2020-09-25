/*********************************************************************************************************
 * CLASS: H03_32 (H03_32.java)
 *
 * DESCRIPTION
 * Return power(x) of n
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


class H03_32 {
    public double power(double x, int n) { 
        if (n > 0) {
            return n * power(x, n - 1);
        } else {
            return 1;
        }
    }
}
/*********************************************************************************************************
 * CLASS: H03_35 (H03_35.java)
 *
 * DESCRIPTION
 * Reverse string(s)
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

class H03_35 {
    public String reverse(String s) {
        if (s == null || s.length() <= 1 ) {
            //String is empty or only contains one character
            return s;
        } else {
            return reverse(s.substring(1)) + s.charAt(0);
        }
    }
}
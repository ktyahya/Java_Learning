/* Print the Following Plus Pattern

Input Format

Integer(ODD NUMBER)

Constraints

NIL

Output Format

Star Format

Sample Input 0

11
Sample Output 0

     *     
     *
     *
     *
     *
***********
     *
     *
     *
     *
     *
Sample Input 1

12
Sample Output 1

      *     
      *     
      *     
      *     
      *     
      *     
************
      *     
      *     
      *     
      *     
      *     


*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int mid = n / 2;  // works for both odd and even

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == mid || j == mid) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}

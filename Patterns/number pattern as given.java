/* Print the following pattern

Input Format

Accept an integer as an input

Constraints

NIL

Output Format

Number Format

Sample Input 0

5
Sample Output 0

1 1 1 1 1 2 
3 2 2 2 2 2 
3 3 3 3 3 4 
5 4 4 4 4 4 
5 5 5 5 5 6

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

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                // odd row: i repeated n times, then i+1
                for (int j = 0; j < n; j++) {
                    System.out.print(i + " ");
                }
                System.out.print((i + 1) + " ");
            } else {
                // even row: i+1, then i repeated n times
                System.out.print((i + 1) + " ");
                for (int j = 0; j < n; j++) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}

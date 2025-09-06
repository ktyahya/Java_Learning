/* Hollow Square Pattern with X pattern inside(Made of 0's and 1's)

Input Format

Accept an integer as an input

Constraints

NIL

Output Format

MATRIX

Sample Input 0

7
Sample Output 0

1111111
1100011
1010101
1001001
1010101
1100011
1111111
Sample Input 1

8
Sample Output 1

11111111
11000011
10100101
10011001
10011001
10100101
11000011
11111111

*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Outer border
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    System.out.print("1");
                }
                // Diagonals
                else if (i == j || i + j == n - 1) {
                    System.out.print("1");
                }
                // Inside
                else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}




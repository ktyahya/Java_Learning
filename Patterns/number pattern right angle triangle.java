/* Write a program to display the following pattern

Input Format

Integer

Constraints

input>0

Output Format

Star Pattern

Sample Input 0

5
Sample Output 0

1
24
135
2468
13579

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
        int row, col, val;
        for(row=1;row<=n;row++)
        {
            if(row%2==0)
            {
                val=2;
            }
            else
            {
                val=1;
            }
            for(col=1;col<=row;col++)
            {
                System.out.print(val);
                val+=2;
            }
            System.out.println();
        }
        
    }
}

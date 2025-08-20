/*  Write a program to display the following pattern

Input Format

Integer

Constraints

input>0

Output Format

Star pattern

Sample Input 0

4
Sample Output 0

*******
**   **
* * * *
*  *  *
* * * *
**   **
*******


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
        int r, c;
        n=(2*n)-1;
        
        
        for(r=1;r<=n;r++)
        {
            for(c=1;c<=n;c++)
            {
                if(r == 1 || r == n || c == 1 || c == n || r+c == n+1 || r==c)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
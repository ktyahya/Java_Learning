/* Write a program to display the following pattern

Input Format

Integer

Constraints

input>0

Output Format

Star pattern

Sample Input 0

5
Sample Output 0

*****
*   *
*   *
*   *
*****



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
        int row,col;
        for(row=1;row<=n;row++)
        {
            for(col=1;col<=n;col++)
            {
                if(row == 1 || row == n || col == 1 || col == n){
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
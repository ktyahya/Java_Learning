/* Write a program to display the following pattern.

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
 *****
  ***
   *


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
        int row,col,s;
        for(row=n;row>=1;row--){
            for(s=1;s<=n-row;s++){
                System.out.print(" ");
            }
            for(col=1;col<=row*2-1;col++){
                System.out.print("*"); 
            }
            System.out.println();
        }
    }
}
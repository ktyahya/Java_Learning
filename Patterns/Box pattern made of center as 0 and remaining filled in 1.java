/*  Box pattern made of center as 0 and remaining filled in 1's

Input Format

Accept an integer as an input

Constraints

NIL

Output Format

MATRIX

Sample Input 0

5
Sample Output 0

11111
11111
11011
11111
11111
Sample Input 1

6
Sample Output 1

111111
111111
110011
110011
111111
111111


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
        int mid1 = n/2;
        int mid2 = (n%2==0) ? mid1-1:mid1;
        for(row=0;row<n;row++)
        {
            for(col=0;col<n;col++)
            {
                if(n%2==1)
                {
                    if(row==mid1 && col==mid1)  
                    {
                        System.out.print(0);
                    }
                    else
                    {
                        System.out.print(1);
                    }
                }
                else
                {
                    if((row==mid1 || row==mid2 ) && (col==mid1 || col==mid2))
                        System.out.print(0);
                    else
                        System.out.print(1);
                }
                
            }
            System.out.println();
        }
    }
}

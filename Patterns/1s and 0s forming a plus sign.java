/* Box filled with 1's and 0's forming a plus sign

Input Format

Accept an integer as an input

Constraints

NIL

Output Format

MATRIX

Sample Input 0

5
Sample Output 0

11011
11011
00000
11011
11011
Sample Input 1

8
Sample Output 1

11100111
11100111
11100111
00000000
00000000
11100111
11100111
11100111

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
                if (n%2==1)
                {
                    if(n/2+1==row || n/2+1==col)
                        System.out.print(0);
                    else
                        System.out.print(1);
                        
                    
                    }
                else{
                    if(n/2+1==row || n/2+1==col || n/2==row || n/2==col)
                        System.out.print(0);
                    else
                        System.out.print(1);
                }
                }
            System.out.println();
            }
        }
    }



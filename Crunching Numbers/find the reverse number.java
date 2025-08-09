/* Write a C program to find the reverse number of the given number

Input Format

Integer

Constraints

Input>0

Output Format

Integer

Sample Input 0

123
Sample Output 0

321

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
        long n = sc.nextLong();
        long rev=0, ld=0;
         while(n>0)
        {
            ld=n%10;
            n=n/10;
            rev = rev*10 + ld;
            
        }
            System.out.print(rev);
        
       
        
    }
}
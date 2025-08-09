/* Write a c Program to find the product of the digits in a given number

Input Format

INTEGER

Constraints

INPUT>0

Output Format

INTEGER

Sample Input 0

123
Sample Output 0

6

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
        long a = sc.nextLong();
        long ld=0,ans=1;
        while(a>0)
        {
            ld=a%10;
            a=a/10;
            ans = ans*ld;
            
        }
        System.out.println(ans);
    }
}
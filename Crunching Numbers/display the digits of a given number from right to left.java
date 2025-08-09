/* Write a C program to display the digits of a given number from right to left

Input Format

Integer

Constraints

Input>=1

Output Format

Integer

Sample Input 0

1234
Sample Output 0

4 3 2 1 */

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
        long ld=0;
        while(n>0)
        {
            ld = n%10;
            n=n/10;
            System.out.print(ld+" ");
        }
        
        
    }
}
/* Write a C program to find whether the given number is Palindrome or Not

Input Format

Integer

Constraints

Input>0

Output Format

Integer

Sample Input 0

121
Sample Output 0

Palindrome
Sample Input 1

548
Sample Output 1

Not a Palindrome
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
        long copy = n;
        while(n>0)
        {
            ld = n%10;
            n = n/10;
            rev = rev*10 + ld;
        }
        if (copy==rev)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not a Palindrome");
        }
    }
}
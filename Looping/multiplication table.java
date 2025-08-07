/* Write a C program to print the multiplication table as per the multiplicant and n.

Input Format

Two integers

Constraints

Nill

Output Format

Display the multiplication table

Sample Input 0

6 5
Sample Output 0

1 * 5 = 5
2 * 5 = 10
3 * 5 = 15
4 * 5 = 20
5 * 5 = 25
6 * 5 = 30

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
        int a = sc.nextInt();
        int b = sc.nextInt();
        for(int i=1;i<=a;i++){
            System.out.println(i+" * "+b+" = "+i*b);
        }
    }
}
/* Write a C program to accept 2 numbers, print the first number as a 5-digit number and print the second number in the next line with 5 width space

Input Format

Input two integers

Constraints

Nill

Output Format

Display the value in the corresponding width

Sample Input 0

25 98
Sample Output 0

00025
   98 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.printf("%05d\n",a);
        System.out.printf("%5d\n",b);
        
    }
}
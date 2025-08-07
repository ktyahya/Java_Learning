/* Write a C program to divide the given two numbers and print the quotient without using / operator.

Input Format

Input two integers

Constraints

Nill

Output Format

Display the result

Sample Input 0

10 2
Sample Output 0

5
*/

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
        int count = 0;
        while(a>=b){ 
            a = a-b;
            count++;
            }
        System.out.print(count);
        
    }
}
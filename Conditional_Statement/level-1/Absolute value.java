/* Write a program Given an integer input, print the Absolute value of the input number

Input Format

Integer

Constraints

NIL

Output Format

Positive Integer

Sample Input 0

-5
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
        int negative= 1;
        if (a<0)
        {
            negative = -1;
        }
            System.out.println(a*negative);
    }
}
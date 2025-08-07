/* Write a C program to print all the even numbers in the given range.

Input Format

Integer

Constraints

Number>0

Output Format

Display the even numbers in the given range

Sample Input 0

2 10
Sample Output 0

2 4 6 8 10
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
        int i;
        for (i=a;i<=b;i++){
            if (i%2==0){System.out.print(i+" ");}
              
            
        }
    }
}
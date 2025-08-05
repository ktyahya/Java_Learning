/* Write a program to Check whether a triangle is Equilateral or Isosceles or Scalene based on length of three sides

Input Format

Integer

Constraints

NIL

Output Format

Equilateral/Isosceles/Scalene

Sample Input 0

40 20 40
Sample Output 0

Isosceles
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
        int c = sc.nextInt();
        if (a==b && b==c)
            System.out.println("Equilateral");
        else if (a==b || b==c || c==a)
            System.out.println("Isosceles");
        else
            System.out.println("Scalene");
        sc.close();
    }
}
/* Write a C program multiply the given two numbers without using * operator.

Input Format

Integer Integer

Constraints

Nill

Output Format

Integer

Sample Input 0

10 2
Sample Output 0

20

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
        int sum=0;
        for(int i=1;i<=a;i++){
            sum=sum+b;
        }
        System.out.println(sum);
    }
}
/* Write a C program to print all the numbers from 1 to n.

Input Format

Integer

Constraints

Nill

Output Format

Display the numbers in the range

Sample Input 0

10
Sample Output 0

1 2 3 4 5 6 7 8 9 10
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
        for (int i=1;i<=a;i++){
            System.out.print(i+" ");
        }
    }
}
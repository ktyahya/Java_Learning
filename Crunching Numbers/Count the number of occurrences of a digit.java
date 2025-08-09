/* Write a C program Count the number of occurrences of a digit in a given number

Input Format

The number and the digit

Constraints

NUMBER>0

Output Format

Integer

Sample Input 0

12224 2
Sample Output 0

3
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
        long a = sc.nextLong();
        int b = sc.nextInt();
        long ld=0,count=0;
        while(a>0)
        {
            ld=a%10;
            a=a/10;
            if(ld==b){
                count++;
            }
            
        }
        System.out.println(count);
    }
}
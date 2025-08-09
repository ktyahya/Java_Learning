/* Count the number of digits in a given number

Input Format

Integer

Constraints

NUM>0

Output Format

Integer

Sample Input 0

12345
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
        long n = sc.nextLong();
        int count=0;
        while(n>0)
        {
            n=n/10;
            
            count++;
        }
        System.out.println(count);
    }
}
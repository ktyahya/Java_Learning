/* Find whether the given number is perfect or not.

Input Format

Integer

Constraints

nil

Output Format

Perfect Number or Not a Perfect Number

Sample Input 0

6
Sample Output 0

Perfect Number
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
        int n = sc.nextInt();
        int sum = 0;
        for(int i=1;i<=n/2;i++)
        {
            if(n%i==0)
            {
                 sum = sum+i;
            }
            
        }
        if(sum==n)
        {
            System.out.println("Perfect Number");
        }
        else{
            System.out.println("Not a Perfect Number");
        }
    }
}
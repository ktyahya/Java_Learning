/* Find whether the given number is strong number or not.

Input Format

Integer

Constraints

input>0

Output Format

Integer

Sample Input 0

145
Sample Output 0

Strong Number
Sample Input 1

98
Sample Output 1

Not a strong number

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
        int ld=0,fact=0, sum =0, copy=n;
        while(n>0)
        {
            ld=n%10;
            n=n/10;
            fact = 1;
            for(int i=1;i<=ld;i++){
                fact = fact * i;
                
            }
            sum = sum + fact;
        }
        if(sum==copy)
        {
            System.out.println("Strong Number");
        }
        else{
            System.out.println("Not a strong number");
        }
    }
}
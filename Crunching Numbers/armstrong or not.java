/* Find whether the given number is armstrong or not.

Input Format

Integer

Constraints

Input>0

Output Format

Integer

Sample Input 0

153
Sample Output 0

Armstrong number
Sample Input 1

157
Sample Output 1

Not an Armstrong number

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
        int ld, sum=0, pow=1,copy=n,temp=n;
        int count = 0;
        while(n>0)
        {
            n=n/10;
            count++;
        }
        while(copy>0)
        {
            ld = copy%10;
            copy=copy/10;
            pow = 1;
            
        
        for(int i=1;i<=count;i++)
            {
                pow = pow*ld;
    
            }
            sum = sum+pow;
        }
        
        
        if(temp==sum)
        {
            System.out.println("Armstrong number");
        }
        else
        {
            System.out.println("Not an Armstrong number");
            
        }
    }
}
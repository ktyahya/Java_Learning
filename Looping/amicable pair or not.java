/* Find whether the given number is amicable pair or not.

Input Format

Integer Integer

Constraints

NIL

Output Format

Amicable Pair or Not a Amicable Pair

Sample Input 0

220 284
Sample Output 0

Amicable Pair

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
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int sum1=0,sum2=0;
        for(int i=1;i<=n1/2;i++)
        {
           if(n1%i==0)
           {
               sum1 = sum1+i;
           }
        }
        
        for(int i=1;i<=n2/2;i++)
        {
           if(n2%i==0)
           {
               sum2 = sum2+i;
           }
        }
         
        if(sum1==n2 && sum2==n1)
        {
            System.out.println("Amicable Pair");
        }
        else{
            System.out.println("Not a Amicable Pair");
            
        }
        
    }
}
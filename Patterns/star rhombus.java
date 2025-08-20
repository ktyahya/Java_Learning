/* Print the following pattern

Input Format

Integer

Constraints

input>0

Output Format

Star pattern

Sample Input 0

5
Sample Output 0

    *****
   *****
  *****
 *****
*****


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
        int r = 1,c,s;
        
        
            for(r=1;r<=n;r++)
            {
                for(s=1;s<=n-r;s++)
                {
                    System.out.print(" ");
                }
                    
                        for(c=1;c<=n;c++)
                        {
                            System.out.print("*");
                        }
                System.out.println();
            }
    }
}
                             
                
               
        
        
        
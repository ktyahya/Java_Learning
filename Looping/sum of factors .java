/* Find the sum of factors of the given number.

Input Format

Integer

Constraints

NIL

Output Format

Integer

Sample Input 0

10
Sample Output 0

18
Sample Input 1

12
Sample Output 1

28
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i=1;i<=n/2;i++){
            if(n%i==0){
                sum=sum+i;
            }
            
        }
         System.out.println(sum+n);   
        } 
    }

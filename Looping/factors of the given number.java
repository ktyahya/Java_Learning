/* Print all the factors of the given number.

Input Format

Integer

Constraints

nil

Output Format

Integer

Sample Input 0

12
Sample Output 0

1,2,3,4,6,12
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
        for(int i=1;i<=n/2;i++){
            if(n%i==0)
                System.out.print(i+",");
            
        }
        System.out.print(n);
    }
}
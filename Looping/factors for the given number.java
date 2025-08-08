/* Count the number of factors for the given number

Input Format

Accept the integer

Constraints

nil

Output Format

print the no of factors

Sample Input 0

10
Sample Output 0

4

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
        int count = 1;
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                count++;
            }
            
        }
        System.out.println(count);
    }
}
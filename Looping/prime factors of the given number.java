/* Find all the prime factors of the given number.

Input Format

Integer

Constraints

nil

Output Format

Integer -> Integer

Sample Input 0

10
Sample Output 0

2->1
5->1

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
        int count=0, i=2;
        while(n!=1){
            if(n%i==0){
                count++;
                n=n/i;
            }
            else{
                if(count>0){
                    System.out.println(i+"->"+count);
                }
                i++;
                count = 0;
            }
        }
        System.out.println(i+"->"+count);
    }
}
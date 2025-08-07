/* Write a C program to find the sum of even numbers in the given range.

Input Format

Integer

Constraints

Nill

Output Format

Display the sum of even numbers in the range

Sample Input 0

10
Sample Output 0

30

*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum=0;
        for(int i=0; i<=a; i++){
            if(i%2==0){
                sum+=i;
                }
            
        }
        System.out.print(sum);
    }
}
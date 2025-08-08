/* Implement the pow function using looping statement.

Input Format

First integer refers to the base

Second integer refers to the power

Constraints

nil

Output Format

Result calculated based on the given base and power

Sample Input 0

2 5
Sample Output 0

32
Sample Input 1

5 5
Sample Output 1

3125

*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int pow = sc.nextInt();
        int c=1;
        for(int i=1;i<=pow;i++){
            c=c*base;
        }
        System.out.println(c);
    }
}

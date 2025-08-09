/* Find whether the given number is Adam or Not.

Input Format

Integer

Constraints

input>0

Output Format

Integer

Sample Input 0

12
Sample Output 0

Adam Number
Sample Input 1

23
Sample Output 1

Not a adam number

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
        int sq = n*n;
        int rev=0,ld=0;
        while(n>0)
        {
            ld = n%10;
            n=n/10;
            rev =rev*10 + ld;
        }
        int rev2 = 0,ld2 = 0;
        int sq2 =rev*rev;
        while(sq2>0)
        {
            ld2 = sq2%10;
            sq2=sq2/10;
            rev2 =rev2*10 + ld2;
        }
        if (sq == rev2)
        {
            System.out.println("Adam Number");
        }
        else
        {
            System.out.println("Not a adam number");
        }
    }
}
Print the following pattern

Input Format

Integer

Constraints

input>0

Output Format

Star pattern

Sample Input 0

5
Sample Output 0

10101
01010
10101
01010
10101
Sample Input 1

6
Sample Output 1

101010
010101
101010
010101
101010
010101


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
        int row, col;
        for(row=1;row<=n;row++)
        {
            for(col=1;col<=n;col++)
            {
                if(row%2==col%2)
                {
                    System.out.print("1");
                }
                else
                {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}



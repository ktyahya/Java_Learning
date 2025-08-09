/* Print all the prime digits in a given number

Input Format

Integer

Constraints

Input>0

Output Format

Integer

Sample Input 0

12345
Sample Output 0

2 3 5 

*/

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int p = 1;
        long copy = n, ld = 0;

        // Step 1: Calculate the correct positional divisor
        while(n > 0)
        {
            n = n / 10;
            p = p * 10;
        }

        p = p / 10;
        n = copy;

        int prev = -1;  // Store previous digit to skip repeats

        while(p > 0)
        {
            ld = n / p;
            n = n % p;
            p = p / 10;

            // Skip repeating digits
            if(ld == prev)
                continue;
            prev = (int)ld;

            // Only print prime digits
            if(ld == 2 || ld == 3 || ld == 5 || ld == 7) {
                System.out.print(ld + " ");
            }
        }
    }
}

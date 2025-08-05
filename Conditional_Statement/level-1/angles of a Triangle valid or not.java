/* Input all angles of a Triangle and check whether it is Valid or Not Valid

Input Format

Integer

Constraints

NIL

Output Format

Valid/Not Valid

Sample Input 0

70 70 40
Sample Output 0

Valid
Sample Input 1

130 30 60
Sample Output 1

Not Valid
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
        int b = sc.nextInt();
        int c = sc.nextInt();
        int result =a+b+c;
        if (result==180)
            System.out.println("Valid");
        else
            System.out.println("Not Valid");
    }
}
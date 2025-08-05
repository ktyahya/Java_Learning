/* Check whether the given character is in upper case or lower case

Input Format

Character

Constraints

NIL

Output Format

UPPERCASE/LOWERCASE

Sample Input 0

z
Sample Output 0

LOWERCASE
Sample Input 1

Z
Sample Output 1

UPPERCASE
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        int asci = (int)a;
        if (asci>=65 && asci<=90)
            System.out.println("UPPERCASE");
        else 
            System.out.println("LOWERCASE");
    }
}
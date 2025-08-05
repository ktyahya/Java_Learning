/* Check whether the given character is a Vowel or Consonant

Input Format

Character

Constraints

nil

Output Format

Vowel/Consonant

Sample Input 0

A
Sample Output 0

Vowel
Sample Input 1

c
Sample Output 1

Consonant
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
        if (a == 'A' || a == 'E' || a == 'I' || a == 'O' || a == 'U' || a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u' )
            System.out.println("Vowel");
        else
            System.out.println("Consonant");
    }
}
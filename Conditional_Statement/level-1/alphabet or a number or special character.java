/* Check whether the given character is an alphabet or a number or special character

Input Format

Character

Constraints

NIL

Output Format

NUMBER/ALPHABET/SPECIAL CHARACTER

Sample Input 0

7
Sample Output 0

NUMBER
Sample Input 1

a
Sample Output 1

ALPHABET
Sample Input 2

?
Sample Output 2

SPECIAL CHARACTER 

*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        int asci = (int) a;
        if (asci>=48 && asci<=57)
            System.out.println("NUMBER");
        else if ((asci>=65 && asci<=90) || (asci>=97 && asci<=122))
            System.out.println("ALPHABET");
        else
            System.out.println("SPECIAL CHARACTER");
    }
}

/* Get three inputs in the format-integer,character,integer. The inputs are all seperated by spaces. Perform the operation with the integer values based on the character(+,-,*,/). Display the calculated value as the output.

Ex : 23 + 45

o/p : 68

Input Format

Integer Character Integer

Constraints

NIL

Output Format

Integer
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char b = sc.next().charAt(0);
        int c = sc.nextInt();
        switch(b)
        {
            case '+':
                System.out.print(a+c);
                break;
            case '-':
                System.out.print(a-c);
                break;
            case '*':
                System.out.print(a*c);
                break;
            case '/':
                System.out.print(a/c);
                break;
                
        }    
    }
}
/* Write a program to check whether the time is valid or not using conditional construct.

Input Format

hh:mm:ss

Constraints

NIL

Output Format

VALID/NOT VALID

Sample Input 0

16:70:45
Sample Output 0

Not Valid
Sample Input 1

11:45:45
Sample Output 1

Valid */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        s = sc.next();
        String[] t = s.split(":");
        
        int hour = Integer.parseInt(t[0]);
        int min = Integer.parseInt(t[1]);
        int sec = Integer.parseInt(t[2]);
        
        if (hour>=0 && hour<=23 && min>=0 && min<=59 && sec>=0 && sec<=59)
            System.out.println("Valid");
        else
            System.out.println("Not Valid");
    }
}


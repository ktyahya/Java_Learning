/* Write a program to find given a specific date ,check whether the date is valid or not. Year will be in range 1900 to 9999

Input Format

dd/mm/yy

Constraints

NIL

Output Format

VALID/INVALID

Sample Input 0

08/16/2000
Sample Output 0

Invalid
Sample Input 1

17/10/1994
Sample Output 1

Valid 

*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] d = s.split("/");
        int day = Integer.parseInt(d[0]);
        int mon = Integer.parseInt(d[1]);
        int year = Integer.parseInt(d[2]);
        
        if (year>1900 && year<9999){
            if ((mon == 1 || mon == 3 || mon == 5 || mon == 7 || mon == 8 || mon == 10) && (day>0 && day<=31))
            { 
                System.out.println("Valid");
            }
             else if ((mon == 4 || mon == 6 || mon == 9 || mon == 11 || mon == 12 ) && (day>0 && day<=30))
             {
                 System.out.println("Valid");
             }
            else if (mon == 2 && (day>0 && day<=29) && year%4==0){
                System.out.println("Valid");
            }
            else
                System.out.println("Invalid");
        }
        else{
            System.out.println("Invalid");
        }
        
    }
}


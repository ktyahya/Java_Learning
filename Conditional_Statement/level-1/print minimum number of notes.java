/* Write a C program to input amount from user and print minimum number of notes (Rs.500,100,50,20,10,5,2,1) required for the given amount in c programming.

Input Format

Integer

Constraints

NIL

Output Format

Integer

Sample Input 0

575
Sample Output 0

Total number of notes:
500 : 1
100 : 0
50 : 1
20 : 1
10 : 0
5 : 1
2 : 0
1 : 0

*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cash = sc.nextInt();
        int fhnote = 0;
        int hdnote = 0;
        int ftnote = 0;
        int ttnote = 0;
        int tennote = 0;
        int fivenote = 0;
        int twonote = 0;
        int onenote = 0;
        System.out.println("Total number of notes:");
        if (cash>=500)
        {
            fhnote = cash/500;
            cash -= (fhnote*500);
            System.out.println("500 : "+fhnote);
        }
        else
        {
            System.out.println("500 : 0");
        }
        if (cash>=100)
        {
            hdnote = cash/100;
            cash -= (hdnote*100);
            System.out.println("100 : "+hdnote);
        }
        else
        {
            System.out.println("100 : 0");
        }
        if (cash>=50)
        {
            ftnote = cash/50;
            cash -= (ftnote*50);
            System.out.println("50 : "+ftnote);
        }
        else
        {
            System.out.println("50 : 0");
        }
        if (cash>=20)
        {
            ttnote = cash/20;
            cash -= (ttnote*20);
            System.out.println("20 : "+ttnote);
        }
        else
        {
            System.out.println("20 : 0");
        }
        if (cash>=10)
        {
            tennote = cash/10;
            cash -= (tennote*10);
            System.out.println("10 : "+tennote);
        }
        else
        {
            System.out.println("10 : 0");
        }
        if (cash>=5)
        {
            fivenote = cash/5;
            cash -= (fivenote*5);
            System.out.println("5 : "+fivenote);
        }
        else
        {
            System.out.println("5 : 0");
        }
        if (cash>=2)
        {
            twonote = cash/2;
            cash -= (twonote*2);
            System.out.println("2 : "+twonote);
        }
        else
        {
            System.out.println("2 : 0");
        }
        if (cash>=1)
        {
            onenote = cash/1;
            cash -= (onenote*1);
            System.out.println("1 : "+onenote);
        }
        else
        {
            System.out.println("1 : 0");
        }  
    }
}
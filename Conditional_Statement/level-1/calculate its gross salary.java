/* Write a C program to input basic Salary of an employee and calculate its gross salary according to following:

Basic Salary <= 10000 : HRA = 20%, DA=80%

Basic Salary <= 20000 : HRA = 25%, DA=90%

Basic Salary > 20000 : HRA = 30%, DA=95%

Input Format

Integer indicating the basic salary

Constraints

NIL

Output Format

Decimal value indicating the gross salary

Sample Input 0

14000
Sample Output 0

Rs.30100.00
*/ 

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salary = sc.nextDouble();
        double HRA;
        double DA;
        double gross = 0;
        if (salary <= 10000)
        {
            HRA = ((20*salary)/100);
            DA = ((80*salary)/100);
            gross = HRA + DA + salary;
            System.out.printf("Rs.%.2f",gross);
        }
        else if (salary <= 20000)
        {
            HRA = ((25*salary)/100);
            DA = ((90*salary)/100);
            gross = HRA + DA + salary;
            System.out.printf("Rs.%.2f",gross); 
        }
        else 
        {
            HRA = ((30*salary)/100);
            DA = ((95*salary)/100);
            gross = HRA + DA + salary;
            System.out.printf("Rs.%.2f",gross);   
        }   
    }
}
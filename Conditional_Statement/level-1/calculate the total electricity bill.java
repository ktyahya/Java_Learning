/* Write a C program to input electricity unit charge and calculate the total electricity bill according to the given condition:

For first 50 Units Rs.0.50/unit

For next 100 Units Rs.0.75/unit

For next 100 Units Rs.1.20/unit

For unit above 250 Rs.1.50/unit

An additional surcharge of 20% is added to the bill.P

Input Format

Integer value indicating the number of units consumed

Constraints

nil

Output Format

Decimal value indicating the total cost rounded off to two decimal places*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int unit = sc.nextInt();
        double rs;
        double total, ans;

        if (unit <= 50) {
            rs = 0.50;
            total = unit * rs;
            System.out.printf("%.2f", total + total * 0.20);
        } 
        else if (unit <= 150) {
            rs = 0.75;
            total = unit - 50;
            ans = total * rs + (0.50 * 50);
            System.out.printf("%.2f", ans + ans * 0.20);
        } 
        else if (unit <= 250) {
            rs = 1.20;
            total = unit - 150;
            ans = total * rs + (0.75 * 100) + (0.50 * 50);
            System.out.printf("%.2f", ans + ans * 0.20);
        } 
        else {
            rs = 1.50;
            total = unit - 250;
            ans = total * rs + (1.20 * 100) + (0.75 * 100) + (0.50 * 50);
            System.out.printf("%.2f", ans + ans * 0.20);
        }
    }
}

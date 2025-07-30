/* Write a c program to accept an integer from the user and print the number along with its sign.

Input Format

Input will be an integer

Output Format

Display the integer along with its sign

/*

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a>=0)
            System.out.println("+"+a);
        else
            System.out.println(a);
    }
}
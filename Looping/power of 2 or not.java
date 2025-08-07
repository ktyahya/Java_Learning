/* Write a c program to find whether the given number is power of 2 or not.

Input Format

Input an integer

Constraints

Nill

Output Format

YES/NO

Sample Input 0

8
Sample Output 0

YES
Sample Input 1

17
Sample Output 1

NO
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int p=1,flag = 0;
        while (p<=a){
            if (p==a){flag =1;} 
                
            p = p*2;
        }
        if (flag == 1){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
               
            
        }
        
    }

/* Find the max,min,sum and average of the given n numbers without using array.

Note: -1 will be the termination of the input.

Input Format

Set of integers

Constraints

NIL

Output Format

Min = Integer

Max = Integer

Sum = Interger

Average = Float

Sample Input 0

10 20 30 40 50 -1
Sample Output 0

Min = 10
Max = 50
Sum = 150
Average = 30.000000
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        int sum = 0, count = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        while (true) {
            num = sc.nextInt();

            if (num == -1) {
                break;
            }

            if (num < min) {
                min = num;
            }

            if (num > max) {
                max = num;
            }

            sum += num;
            count++;
        }

        if (count == 0) {
            System.out.println("No numbers entered.");
        } else {
            double average = (double) sum / count;

            System.out.println("Min = " + min);
            System.out.println("Max = " + max);
            System.out.println("Sum = " + sum);
            System.out.printf("Average = %.6f\n", average);
        }

        sc.close();
    }
}

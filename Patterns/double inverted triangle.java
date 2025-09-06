/* Print the following pattern

Input Format

Accept an integer as an input

Constraints

NIL

Output Format

Pattern Format

Sample Input 0

4
Sample Output 0

*      *
**    **
***  ***
********
********
***  ***
**    **
*      *

*/

import java.util.*;
public class MirrorWingsPattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // half-width; n=4 prints the pattern shown
        printMirrorWings(n);
    }

    private static void printMirrorWings(int n) {
        // Top half (excluding the solid center)
        for (int i = 1; i <= n - 1; i++) {
            repeat('*', i);
            repeat(' ', 2 * (n - i));
            repeat('*', i);
            System.out.println();
        }

        // Two solid middle lines
        repeat('*', 2 * n);
        System.out.println();
        repeat('*', 2 * n);
        System.out.println();

        // Bottom half (mirror of the top)
        for (int i = n - 1; i >= 1; i--) {
            repeat('*', i);
            repeat(' ', 2 * (n - i));
            repeat('*', i);
            System.out.println();
        }
    }

    private static void repeat(char ch, int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(ch);
        }
    }
}

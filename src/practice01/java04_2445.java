package practice01;
/*
 *        *
 **      **
 ***    ***
 ****  ****
 **********
 ****  ****
 ***    ***
 **      **
 *        *
 */
import java.util.Scanner;

public class java04_2445 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 1; i <= (2*N)-1; i++) {
            if (i <= N) {
                System.out.print("*".repeat(i));
                System.out.print(" ".repeat((2*N)-(2*i)));
                System.out.print("*".repeat(i));
            } else {
                System.out.print("*".repeat((2*N)-i));
                System.out.print(" ".repeat((N-((2*N)-i))*2));
                System.out.print("*".repeat((2*N)-i));
            }
            System.out.println();
        }
        sc.close();
    }
}

/*
1.
String repeat = "*".repeat(Math.min(i, (2 * N) - i));
System.out.print(repeat);
System.out.print(" ".repeat(Math.max((2*N)-(2*i), (N-((2*N)-i))*2)));
System.out.print(repeat);
System.out.println();
 */

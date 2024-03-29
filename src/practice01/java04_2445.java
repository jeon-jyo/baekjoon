package practice01;
/*
별 찍기 - 8

첫째 줄부터 2×N-1번째 줄까지 차례대로 별을 출력한다.

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
                System.out.print(" ".repeat((N-((2*N)-i)) * 2));
                System.out.print("*".repeat((2*N)-i));
            }
            System.out.println();
        }
        sc.close();
    }
}

/*
1.
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
                System.out.print(" ".repeat((N-((2*N)-i)) * 2));
                System.out.print("*".repeat((2*N)-i));
            }
            System.out.println();
        }
        sc.close();
    }
}

2.
String repeat = "*".repeat(Math.min(i, (2 * N) - i));
System.out.print(repeat);
System.out.print(" ".repeat(Math.max((2*N)-(2*i), (N-((2*N)-i))*2)));
System.out.print(repeat);
System.out.println();
 */

/*
팀코드

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringBuilder tmp_sb;

        int n = Integer.parseInt(br.readLine());
        br.close();

        for (int i = 1; i <= n - 1; i++) {
            tmp_sb = new StringBuilder();

            for (int j = 0; j < i; j++) {
                tmp_sb.append("*");
            }

            for (int j = n - i; j > 0; j--) {
                tmp_sb.append(" ");
            }
            sb.append(tmp_sb).append(tmp_sb.reverse()).append("\n");
        }

        for (int i = 0; i < n * 2; i++) {
            sb.append("*");
        }
        sb.append("\n");

        for (int i = 1; i <= n - 1; i++) {
            tmp_sb = new StringBuilder();

            for (int j = n - i; j > 0; j--) {
                tmp_sb.append("*");
            }

            for (int j = 0; j < i; j++) {
                tmp_sb.append(" ");
            }
            sb.append(tmp_sb).append(tmp_sb.reverse()).append("\n");
        }
        System.out.println(sb);
    }
}
 */
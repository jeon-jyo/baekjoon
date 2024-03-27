package practice;

import java.util.Scanner;
import java.util.Stack;

public class java02_10773 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < K; i++) {
            int n = sc.nextInt();
            if (n == 0) {
                stack.pop();
            } else {
                stack.push(n);
            }
        }

        int sum = 0;
        for (Integer i : stack) {
            sum += i;
        }
        System.out.println(sum);
        sc.close();
    }
}

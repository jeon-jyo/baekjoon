package step04;

import java.util.Scanner;

public class java01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr = new int[N];
        for(int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        int v = scanner.nextInt();
        int count = 0;
        for(int i = 0; i < N; i ++) {
            if(arr[i] == v) {
                count++;
            }
        }
        System.out.println(count);
        scanner.close();
    }
}

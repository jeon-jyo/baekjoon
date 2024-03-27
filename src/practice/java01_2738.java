package practice;

import java.util.Scanner;

public class java01_2738 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];

        for(int i = 0; i < n * 2; i++) {
            for(int j = 0; j < m; j++) {
                if (i >= n) {
                    arr[i - n][j] = sc.nextInt() + arr[i - n][j];
                } else {
                    arr[i][j] = sc.nextInt();
                }
            }
        }

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}

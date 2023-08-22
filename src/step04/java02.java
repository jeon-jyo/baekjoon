package step04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class java02 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        st = new StringTokenizer(br.readLine(), " ");

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        System.out.println(A);
        System.out.println(B);
//        int N = Integer.parseInt(st.nextToken());
//        int[] A = new int[N];
//        int X = Integer.parseInt(st.nextToken());
//
//        for(int i = 0; i < N; i++) {
//            A[i] = br.readLine();
//        }
//
//        System.out.println(Arrays.toString(A));
//
//        for(int i = 0; i < N; i ++) {
//            if(A[i] < X) {
//                System.out.print(A[i] + " ");
//            }
//        }

//        Scanner scanner = new Scanner(System.in);
//        int N = scanner.nextInt();
//        int[] A = new int[N];
//        int X = scanner.nextInt();
//
//        for(int i = 0; i < N; i++) {
//            A[i] = scanner.nextInt();
//        }
//
//        for(int i = 0; i < N; i ++) {
//            if(A[i] < X) {
//                System.out.print(A[i] + " ");
//            }
//        }

    }
}

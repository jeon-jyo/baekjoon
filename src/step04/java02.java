package step04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class java02 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st1.nextToken());
        int X = Integer.parseInt(st1.nextToken());

        List<Integer> aList = new ArrayList<>();
        for(int i = 0; i < N; i++) {
            aList.add(Integer.parseInt(st2.nextToken()));
        }

        for(int i = 0; i < aList.size(); i++) {
            if(aList.get(i) < X) {
                System.out.print(aList.get(i) + " ");
            }
        }
        br.close();

//        int[] A = new int[N];
//        for(int i = 0; i < N; i++) {
//            A[i] = Integer.parseInt(st2.nextToken());
//        }
//
//        for(int i = 0; i < N; i ++) {
//            if(A[i] < X) {
//                System.out.print(A[i] + " ");
//            }
//        }

//        Scanner scanner = new Scanner(System.in);
//        int N = scanner.nextInt();
//        int X = scanner.nextInt();
//
//        int[] A = new int[N];
//        for(int i = 0; i < N; i++) {
//            A[i] = scanner.nextInt();
//        }
//
//        for(int i = 0; i < N; i ++) {
//            if(A[i] < X) {
//                System.out.print(A[i] + " ");
//            }
//        }
//        scanner.close();
    }
}

package step02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class java07 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        String[] A = str.split(" ");

        int x = Integer.parseInt(A[0]);
        int y = Integer.parseInt(A[1]);
        int z = Integer.parseInt(A[2]);

        if (x == y && x == z && y == z) {
            System.out.println(10000 + (x*1000));
        } else if (x == y && x != z) {
            System.out.println(1000 + (x*100));
        } else if (x == z && x != y) {
            System.out.println(1000 + (x*100));
        } else if (y == z && y != x) {
            System.out.println(1000 + (y*100));
        } else {
            if (x >= y && x >= z) {
                System.out.println(x*100);
            } else if (y >= x && y >= z) {
                System.out.println(y*100);
            } else if (z >= y && z >= x) {
                System.out.println(z*100);
            }
        }

        br.close();
    }
}
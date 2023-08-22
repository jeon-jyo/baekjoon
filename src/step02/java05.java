package step02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class java05 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int A = M - 45;

        if (A >= 0) {
            System.out.println(H + " " + A);
        } else {
            if (H == 0) {
                System.out.println((23) + " " + (60+A));
            } else {
                System.out.println((H-1) + " " + (60+A));
            }
        }

        br.close();
    }
}
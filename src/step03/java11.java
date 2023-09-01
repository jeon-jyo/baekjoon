package step03;

import java.io.*;
import java.util.StringTokenizer;

public class java11 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        while (true) {
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            if (A == 0 && B == 0) {
                break;
            }

            System.out.println(A+B);
        }

        br.close();
    }
}
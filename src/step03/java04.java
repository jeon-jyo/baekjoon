package step03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class java04 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int X = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i <= N; i++) {

            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            X -= (a*b);
        }

        if (X == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        br.close();
    }
}
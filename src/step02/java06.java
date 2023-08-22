package step02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class java06 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(br.readLine());

        int T = B + C;
        int I = T / 60;

        if (T >= 60) {
            if ((A+I) > 24) {
                System.out.println(((A+I)-24) + " " + (T-(I*60)));
            } else if ((A+I) == 24) {
                System.out.println(0 + " " + (T-(I*60)));
            } else {
                System.out.println((A+I) + " " + (T-(I*60)));
            }
        } else {
            System.out.println(A + " " + T);
        }

        br.close();
    }
}
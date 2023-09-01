package step02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class java01 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        if (A > B) {
            System.out.println(">");
        } else if (A < B) {
            System.out.println("<");
        } else if (A == B) {
            System.out.println("==");
        }
        // 조건식 ? 참 : 거짓(조건식 ? 참 : 거짓)
        // System.out.println(A > B ? ">" : A < B ? "<" : "==");

        br.close();
    }
}
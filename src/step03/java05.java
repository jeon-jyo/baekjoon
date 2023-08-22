package step03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class java05 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int x = N/4;
        String str = "";

        for (int i = 1; i <= x; i++) {
            str += "long ";
        }
        System.out.println(str + "int");

        br.close();
    }
}
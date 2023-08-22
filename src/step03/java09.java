package step03;

import java.io.*;

public class java09 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        String str = "";

        for (int i = 1; i <= T; i++) {
            str += "*";
            bw.write(str + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
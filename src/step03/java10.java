package step03;

import java.io.*;

public class java10 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        String star = "";

        for (int i = 1; i <= T; i++) {
            String str = "";
            for (int j = T-i; j >= 1; j--) {
                str += " ";
            }
            star += "*";
            bw.write(str + star + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
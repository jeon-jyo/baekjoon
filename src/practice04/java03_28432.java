package practice04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class java03_28432 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String word = "";
        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            if (s.length() == 1) {
                String str = br.readLine();
                word += String.valueOf(str.charAt(0));
                break;
            } else {
                word = String.valueOf(s.charAt(s.length()-1));
            }
        }
        System.out.println(word);
    }
}

package practice07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class java03_2002 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<String> list = new ArrayList<String>();
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            list.add(str);
        }
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            // list의 첫번째 값과 같지 않으면 추월한값 +1 하고 삭제
            if (!list.get(0).equals(str)) {
                cnt++;
                list.remove(list.indexOf(str));
                continue;
            }
            // 같으면 현재 값을 삭제
            list.remove(0);
        }
        System.out.println(cnt);
    }
}

package practice02;
/*
숫자 카드 2
 */
// 	146008	1032
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class java26_10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        Map<String, Integer> map = new HashMap<>();
        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            String s = st.nextToken();
            map.put(s, map.getOrDefault(s, 0)+1);
        }

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            String s = st.nextToken();
            if (map.get(s) != null) {
                sb.append(map.get(s)).append(" ");
            } else {
                sb.append(0).append(" ");
            }
        }
        System.out.println(sb);
        br.close();
    }
}

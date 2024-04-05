package practice07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class java01_9375 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Map<String, Integer> map = new HashMap<>();
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());
            for (int j = 0; j < n; j++) {
                String key = br.readLine().split(" ")[1];
                // 같은 종류는 숫자로 +1 해서 map에 넣어줌
                // 안 입을 수 있는 경우의 수까지 넣어줘야해서 디폴트 값을 1로 설정
                map.put(key, map.getOrDefault(key, 1)+1);
            }

            int sum = 1;
            for (Map.Entry<String, Integer> entrySet : map.entrySet()) {
                // 조합공식을 사용
                sum *= entrySet.getValue();
            }
            map.clear();
            // 모두 안 입을 수 있는 경우의 수를 최종적으로 -1
            sb.append(sum-1).append('\n');
        }
        System.out.println(sb);
        br.close();
    }
}

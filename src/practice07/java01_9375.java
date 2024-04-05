package practice07;
/*
패션왕 신해빈

해빈이는 패션에 매우 민감해서 한번 입었던 옷들의 조합을 절대 다시 입지 않는다.

각 테스트 케이스의 첫째 줄에는 해빈이가 가진 의상의 수 n(0 ≤ n ≤ 30)이 주어진다.
다음 n개에는 해빈이가 가진 의상의 이름과 의상의 종류가 공백으로 구분되어 주어진다. 같은 종류의 의상은 하나만 입을 수 있다.
모든 문자열은 1이상 20이하의 알파벳 소문자로 이루어져있으며 같은 이름을 가진 의상은 존재하지 않는다.

각 테스트 케이스에 대해 해빈이가 알몸이 아닌 상태로 의상을 입을 수 있는 경우를 출력하시오.
 */
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

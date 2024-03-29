package practice02;
/*
할리갈리

펼쳐진 카드들 중 한 종류 이상의 과일이 정확히 5개 있는 경우 종을 눌러야 하며 ...

첫 번째 줄에 펼쳐진 카드의 개수 N이 주어집니다.
두 번째 줄부터 N개의 줄에 걸쳐 한 줄에 하나씩 펼쳐진 카드의 정보가 주어집니다.
카드의 정보는 공백으로 구분된, 과일의 종류를 나타내는 문자열 S와
과일의 개수를 나타내는 양의 정수 X로 이루어져 있습니다.
 */
import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class java02_27160 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        Map<String,Integer> map = new HashMap<String,Integer>();
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            String key = st.nextToken();
            int value = Integer.parseInt(st.nextToken());
            if (map.containsKey(key)) {
                map.put(key, map.get(key)+value);
            } else {
                map.put(key, value);
            }
        }
        if (map.containsValue(5)) {
            bw.write("YES");
        } else {
            bw.write("NO");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}

package practice04;
/*
크리스마스 선물
 */
// 	35624	392
import java.io.*;
import java.util.*;

public class java12_14235 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());    // 아이들과 거점지를 방문한 횟수
        Queue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            while (st.hasMoreTokens()) {
                // 선물을 챙긴 횟수 or 0 (아이들을 만나서 선물을 줌)
                int num = Integer.parseInt(st.nextToken());
                if (num == 0) {
                    if (!pq.isEmpty()) {
                        sb.append(pq.poll()).append("\n");
                    } else {
                        sb.append(-1).append("\n");
                    }
                }
                // 챙긴 횟수 만큼 선물 offer
                for (int j = 0; j < num; j++) {
                    pq.offer(Integer.parseInt(st.nextToken()));
                }
            }
        }
        System.out.println(sb);
        br.close();
    }
}

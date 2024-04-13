package practice03;
/*
절댓값 힙
 */
// 	26456	332
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class java16_11286 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        Queue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                // 절대값이 큰 순으로 오름차순 정렬
                if (Math.abs(o1) > Math.abs(o2)) {
                    return Math.abs(o1) - Math.abs(o2);
                // 절대값이 같으면 작은 순으로 오름차순 정렬
                } else if (Math.abs(o1) == Math.abs(o2)) {
                    return o1 - o2;
                } else {
                    return -1;
                }
            }
        });
        for (int i = 0; i < N; i++) {
            int x = Integer.parseInt(br.readLine());
            if (x == 0) {
                if (!pq.isEmpty()) {
                    sb.append(pq.poll()).append("\n");
                } else {
                    sb.append(0).append("\n");
                }
            } else {
                pq.offer(x);
            }
        }
        System.out.println(sb);
        br.close();
    }
}

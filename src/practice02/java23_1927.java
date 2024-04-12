package practice02;
/*
최소 힙
 */
// 26516	336
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Queue;

public class java23_1927 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new PriorityQueue<>();
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            if (!queue.isEmpty() && num == 0) {
                sb.append(queue.poll()).append("\n");
            } else if (queue.isEmpty() && num == 0) {
                sb.append(0).append("\n");
            } else {
                queue.offer(num);
            }
        }
        System.out.println(sb);
        br.close();
    }
}

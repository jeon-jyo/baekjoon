package practice09;
/*
센티와 마법의 뿅망치

 */
// 28660KB	384ms
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class java04_19638 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < N; i++) {
            pq.add(Integer.parseInt(br.readLine()));
        }

        int cnt = 0;
        for (int i = 0; i < T; i++) {
            // 키가 같아도 1이면 줄어들지 않기 때문에 먼저 계산
            if (pq.peek() < H || pq.peek() == 1) {
                break;
            } else {    // 같거나 클 때
                pq.add(pq.poll()/2);
                cnt++;
            }
        }

        if (pq.peek() < H) {
            System.out.println("YES");
            System.out.println(cnt);
        } else {
            System.out.println("NO");
            System.out.println(pq.peek());
        }
        br.close();
    }
}

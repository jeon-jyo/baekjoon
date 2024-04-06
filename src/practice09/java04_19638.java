package practice09;
/*
센티와 마법의 뿅망치

이 뿅망치에 맞은 사람의 키가 ⌊ 뿅망치에 맞은 사람의 키 / 2 ⌋로 변하는 마법 도구이다.
단, 키가 1인 경우 더 줄어들 수가 없어 뿅망치의 영향을 받지 않는다.

하지만 마법의 뿅망치는 횟수 제한이 있다. 그래서 센티는 마법의 뿅망치를 효율적으로 사용하기 위한 전략을 수립했다.
바로 매번 가장 키가 큰 거인 가운데 하나를 때리는 것이다.

첫 번째 줄에는 센티를 제외한 거인의 나라의 인구수 N (1 ≤ N ≤ 105)과 센티의 키를 나타내는 정수 Hcenti (1 ≤ Hcenti ≤ 2 × 109),
마법의 뿅망치의 횟수 제한 T (1 ≤ T ≤ 105)가 빈칸을 사이에 두고 주어진다.
두 번째 줄부터 N개의 줄에 각 거인의 키를 나타내는 정수 H (1 ≤ H ≤ 2 × 109)가 주어진다.

마법의 뿅망치를 센티의 전략대로 이용하여 거인의 나라의 모든 거인이 센티보다 키가 작도록 할 수 있는 경우, 첫 번째 줄에 YES를 출력하고,
두 번째 줄에 마법의 뿅망치를 최소로 사용한 횟수를 출력한다.

마법의 뿅망치를 센티의 전략대로 남은 횟수 전부 이용하고도 거인의 나라에서 센티보다 키가 크거나 같은 거인이 있는 경우,
첫 번째 줄에 NO를 출력하고, 두 번째 줄에 마법의 뿅망치 사용 이후 거인의 나라에서 키가 가장 큰 거인의 키를 출력한다.
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

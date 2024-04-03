package practice06;
/*
프린터 큐
예를 들어 Queue에 4개의 문서(A B C D)가 있고, 중요도가 2 1 4 3 라면 C를 인쇄하고, 다음으로 D를 인쇄하고 A, B를 인쇄하게 된다.

여러분이 할 일은, 현재 Queue에 있는 문서의 수와 중요도가 주어졌을 때, 어떤 한 문서가 몇 번째로 인쇄되는지 알아내는 것이다.
예를 들어 위의 예에서 C문서는 1번째로, A문서는 3번째로 인쇄되게 된다.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class java02_1966 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            LinkedList<int[]> queue = new LinkedList<>();
            for (int j = 0; j < N; j++) {
                int num = Integer.parseInt(st.nextToken());
                queue.add(new int[]{j, num});
            }

            int cnt = 0;
            while (!queue.isEmpty()) {
                int[] chk = queue.poll();
                boolean isMax = true;
                for (int j = 0; j < queue.size(); j++) {
                    if (chk[1] < queue.get(j)[1]) {
                        isMax = false;
                        queue.add(chk);
                        for (int k = 0; k < j; k++) {
                            queue.add(queue.poll());
                        }
                        break;
                    }
                }

                if (isMax) {
                    cnt++;
                    if (chk[0] == M) {
                        sb.append(cnt).append('\n');
                        break;
                    }
                }
            }
        }
        System.out.println(sb);
        br.close();
    }
}

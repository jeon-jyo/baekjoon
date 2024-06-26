package practice07;
/*
N번째 큰 수

N×N의 표에 수 N2개 채워져 있다.
...

첫째 줄에 N(1 ≤ N ≤ 1,500)이 주어진다. 다음 N개의 줄에는 각 줄마다 N개의 수가 주어진다.
표에 적힌 수는 -10억보다 크거나 같고, 10억보다 작거나 같은 정수이다.

첫째 줄에 N번째 큰 수를 출력한다.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class java02_2075 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        // 내림차순 정렬 람다식으로 구현
        PriorityQueue<Integer> queue = new PriorityQueue<>((a, b)-> b - a);
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for(int j = 0; j < N; j++){
                queue.add(Integer.parseInt(st.nextToken()));
            }
        }
        int result = 0;
        // N번째 큰수
        for(int i = 0; i < N; i++) {
            result = queue.poll();
        }
        sb.append(result);
        System.out.println(sb);
        br.close();
    }
}

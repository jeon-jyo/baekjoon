package practice07;

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

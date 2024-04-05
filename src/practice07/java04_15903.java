package practice07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class java04_15903 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine()," ");
        PriorityQueue<Long> pr = new PriorityQueue<>();
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        Long sum = 0L;
        st = new StringTokenizer(br.readLine()," ");
        for(int i = 0; i < N; i++) {
            pr.add(Long.parseLong((st.nextToken())));
        }

        for(int i = 0; i < M; i++) {
            Long x = pr.poll();
            Long y = pr.poll();
            pr.add(x+y);
            pr.add(x+y);
        }

        while (!pr.isEmpty()) {
            sum += pr.poll();
        }

        System.out.println(sum);
        br.close();
    }
}

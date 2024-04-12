package practice02;
/*
바이러스
 */
// 	14276	124
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class java27_2606 {
    static int node, line;
    static int[][] arr;
    static boolean[] chk;
    static int cnt = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        node = Integer.parseInt(br.readLine()); // 컴퓨터의 수
        line = Integer.parseInt(br.readLine()); // 컴퓨터 쌍의 수
        arr = new int[node+1][node+1];
        chk = new boolean[node+1];
        for (int i = 0; i < line; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            // 양방향 그래프
            arr[a][b] = 1;
            arr[b][a] = 1;
        }

        dfs(1);
        
        sb.append(cnt);
        System.out.println(sb);
        br.close();
    }

    private static void dfs(int n) {
        // 바이러스 감염
        chk[n] = true;
        // 해당 노드와 연결된 노드들을 순서대로 탐색
        for (int i = 1; i <= node; i++) {
            if (arr[n][i] == 1 && !chk[i]) {
                cnt++;
                dfs(i);
            }
        }
    }
}

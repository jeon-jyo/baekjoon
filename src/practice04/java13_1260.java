package practice04;
/*
DFS와 BFS
 */
// 	23388	256
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class java13_1260 {
    static StringBuilder sb = new StringBuilder();
    static int N;   // 정점의 개수
    static int M;   // 간선의 개수
    static int V;   // 시작 정점 번호
    static int edge[][];    // 간선을 기록하는 배열
    static boolean visited[];   // 방문한 노드를 기록하는 배열
    static int count;
    static Queue<Integer> queue = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());

        // 최대 정점 개수 +1
        edge = new int[1001][1001];
        visited = new boolean[1001];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            edge[x][y] = edge[y][x] = 1;
        }

        // V를 이용하여 dfs 시작
        dfs(V);
        sb.append("\n");

        // visited[] 초기화 후 bfs 시작
        visited = new boolean[1001];
        bfs(V);

        System.out.println(sb);
        br.close();
    }

    public static void dfs(int start) {
        // 노드를 방문
        visited[start] = true;
        // 방문된 점 출력
        sb.append(start).append(" ");
        // 반복횟수를 줄이기 위한 dfs 종료 장치
        if(count == N) {
            return;
        }
        count ++;

        // 1부터 최대 노드값 N까지
        // 해당 노드와 연결된 노드들을 순서대로 탐색
        // visited 배열이 모두 true 면 dfs 종료
        for(int i = 1; i <= N; i++) {
            if(edge[start][i] == 1 && !visited[i]) {
                dfs(i);
            }
        }
    }

    public static void bfs(int start) {
        // 노드를 방문
        queue.offer(start);
        visited[start] = true;
        sb.append(start).append(" ");

        // queue 비었으면 모든 노드 방문한 것
        while(!queue.isEmpty()) {
            // queue 에서 빼낸 값으로 start 지정
            start = queue.poll();
            // start 값은 그대로 두고 i 값을 증가시키며 연결된 간선을 찾음
            for(int i = 1; i <= N; i++) {
                if(edge[start][i] == 1 && !visited[i]) {
                    // 연결된 간선으로 찾은 노드값을 queue 에 넣음
                    // 노드를 방문
                    queue.offer(i);
                    visited[i] = true;
                    sb.append(i).append(" ");
                }
            }
        }
    }
}

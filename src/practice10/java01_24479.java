package practice10;
/*
알고리즘 수업 - 깊이 우선 탐색 1

N개의 정점과 M개의 간선으로 구성된 무방향 그래프(undirected graph)가 주어진다. 정점 번호는 1번부터 N번이고 모든 간선의 가중치는 1이다.
정점 R에서 시작하여 깊이 우선 탐색으로 노드를 방문할 경우 노드의 방문 순서를 출력하자.
깊이 우선 탐색 의사 코드는 다음과 같다. 인접 정점은 오름차순으로 방문한다.

dfs(V, E, R) {  # V : 정점 집합, E : 간선 집합, R : 시작 정점
    visited[R] <- YES;  # 시작 정점 R을 방문 했다고 표시한다.
    for each x ∈ E(R)  # E(R) : 정점 R의 인접 정점 집합.(정점 번호를 오름차순으로 방문한다)
        if (visited[x] = NO) then dfs(V, E, x);
}

첫째 줄에 정점의 수 N (5 ≤ N ≤ 100,000), 간선의 수 M (1 ≤ M ≤ 200,000), 시작 정점 R (1 ≤ R ≤ N)이 주어진다.
다음 M개 줄에 간선 정보 u v가 주어지며 정점 u와 정점 v의 가중치 1인 양방향 간선을 나타낸다.
(1 ≤ u < v ≤ N, u ≠ v) 모든 간선의 (u, v) 쌍의 값은 서로 다르다.

첫째 줄부터 N개의 줄에 정수를 한 개씩 출력한다. i번째 줄에는 정점 i의 방문 순서를 출력한다.
시작 정점의 방문 순서는 1이다. 시작 정점에서 방문할 수 없는 경우 0을 출력한다.
 */
// 99836KB	1780ms
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class java01_24479 {
    static List<List<Integer>> list = new ArrayList<>();
    static int[] visited;
    static int cnt;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());   // 정점의 수
        int M = Integer.parseInt(st.nextToken());   // 간선의 수
        int R = Integer.parseInt(st.nextToken());   // 시작 정점
        visited = new int[N+1];
        for (int i = 0; i <= N; i++) {
            list.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int u = Integer.parseInt(st.nextToken());   // 정점
            int v = Integer.parseInt(st.nextToken());   // 정점의 가중치 1인 양방향 간선
            list.get(u).add(v);
            list.get(v).add(u);
        }

        // 각 노드와 연결된 노드들끼리 오름차순 정렬 (list의 list를 정렬)
        for (int i = 1; i <= N; i++) {
            Collections.sort(list.get(i));
        }

        cnt++;
        dfs(R);

        for (int i = 1; i <= N; i++) {
            System.out.println(visited[i]);
        }
        br.close();
    }

    private static void dfs(int R) {
        visited[R] = cnt;
        // 해당 노드와 연결된 노드들을 순서대로 탐색
        for (int i = 0; i < list.get(R).size(); i++) {
            int r = list.get(R).get(i);
            if (visited[r] == 0) {
                cnt++;
                dfs(r);
            }
        }
    }
}

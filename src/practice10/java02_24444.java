package practice10;
/*
알고리즘 수업 - 너비 우선 탐색 1

정점 R에서 시작하여 너비 우선 탐색으로 노드를 방문할 경우 노드의 방문 순서를 출력하자.
너비 우선 탐색 의사 코드는 다음과 같다. 인접 정점은 오름차순으로 방문한다.

bfs(V, E, R) {  # V : 정점 집합, E : 간선 집합, R : 시작 정점
    for each v ∈ V - {R}
        visited[v] <- NO;
    visited[R] <- YES;  # 시작 정점 R을 방문 했다고 표시한다.
    enqueue(Q, R);  # 큐 맨 뒤에 시작 정점 R을 추가한다.
    while (Q ≠ ∅) {
        u <- dequeue(Q);  # 큐 맨 앞쪽의 요소를 삭제한다.
        for each v ∈ E(u)  # E(u) : 정점 u의 인접 정점 집합.(정점 번호를 오름차순으로 방문한다)
            if (visited[v] = NO) then {
                visited[v] <- YES;  # 정점 v를 방문 했다고 표시한다.
                enqueue(Q, v);  # 큐 맨 뒤에 정점 v를 추가한다.
            }
    }
}
 */
// 99252KB	1944ms
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class java02_24444 {
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
        bfs(R);

        for (int i = 1; i <= N; i++) {
            System.out.println(visited[i]);
        }
        br.close();
    }

    private static void bfs(int R) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(R);
        visited[R] = cnt++;
        while (!queue.isEmpty()) {
            int r = queue.poll();
            for (int i = 0; i < list.get(r).size(); i++) {
                int rr = list.get(r).get(i);
                if (visited[rr] != 0) {
                    continue;
                }
                queue.add(rr);
                visited[rr] = cnt++;
            }
        }
    }
}

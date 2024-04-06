package practice08;
/*
좌표 압축

첫째 줄에 N이 주어진다.
둘째 줄에는 공백 한 칸으로 구분된 X1, X2, ..., XN이 주어진다.

첫째 줄에 X'1, X'2, ..., X'N을 공백 한 칸으로 구분해서 출력한다.

5
2 4 -10 4 -9

2 3 0 3 1
 */
// 185736KB	1656ms
import java.io.*;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class java03_18870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Coords> pq = new PriorityQueue<>();
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for (int i = 0; i < N; i++) {
            int coord = Integer.parseInt(st.nextToken());
            pq.add(new Coords(i, coord));
        }

        int[] arr = new int[N];
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            Coords x = pq.poll();
            arr[x.idx] = cnt;
            if (pq.peek() != null && pq.peek().coord != x.coord) cnt++;
        }

        for (int x : arr) {
            bw.write(x + " ");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}

class Coords implements Comparable<Coords> {
    int idx;
    int coord;

    public Coords(int idx, int coord) {
        this.idx = idx;
        this.coord = coord;
    }

    @Override
    public int compareTo(Coords o) {
        return this.coord - o.coord;
    }
}

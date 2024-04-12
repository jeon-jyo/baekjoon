package practice03;
/*
회의실 배정
 */
// 	43616	516
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class java12_1931 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][2];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        // 종료시간 기준 오름차순 정렬
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                // 종료시간이 같으면 시작시간 기준 오름차순 정렬
                if (o1[1] == o2[1]) {
                    return o1[0] - o2[0];
                }
                return o1[1] - o2[1];
            }
        });

        int cnt = 0;
        int end = 0;
        for (int i = 0; i < N; i++) {
            // 지난 종료시간과 비교하여 지금 시작시간이 같거나 크면 지금 종료시간을 저장
            if (end <= arr[i][0]) {
                end = arr[i][1];
                cnt++;
            }
        }
        sb.append(cnt);
        System.out.println(sb);
        br.close();
    }
}

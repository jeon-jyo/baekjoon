package practice03;
/*
수 찾기
 */
// 43972	596
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class java17_1920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            int num = Integer.parseInt(st.nextToken());
            // arr의 인덱스 값으로 이분탐색
            int start = 0;
            int end = N-1;
            int result = 0;
            while (start <= end) {
                int mid = (start+end)/2;
                // 같으면 빠져나온다
                if (num == arr[mid]) {
                    result = 1;
                    break;
                }
                // 같기전 or 끝날때까지 반복
                if (num > arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
            sb.append(result).append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}

package practice06;
/*
이친수
 */
// 	14180	124
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class java13_2193 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        long[] arr = new long[90];  // 90보다 작거나 같다
        // dp 활용을 위한 0,1 초기화
        arr[0] = arr[1] = 1;
        // N-2자리의 0으로 시작하는 수는 N-1자리의 이친수와 같다
        // dp[N] = dp[N-1]+dp[N-2]
        for (int i = 2; i < N; i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }
        sb.append(arr[N-1]);
        System.out.println(sb);
        br.close();
    }
}

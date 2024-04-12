package practice03;
/*
로프
 */
// 	27192	400
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class java14_2217 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        Integer[] rope = new Integer[N];
        for (int i = 0; i < N; i++) {
            rope[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(rope, Comparator.reverseOrder());

        int max = 0;
        for (int i = 0; i < N; i++) {
            // 로프 수 +1 해주며 다음 최소 중량과 곱함
            // 여러개 로프를 사용하여 제일 많이 들 수 있는 중량을 찾음
            max = Math.max(max, rope[i] * (i + 1));
        }
        sb.append(max);
        System.out.println(sb);
        br.close();
    }
}
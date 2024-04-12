package practice03;
/*
보물
 */
// 14292	128
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class java13_1026 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(A);

        Integer[] B = new Integer[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            B[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(B, Comparator.reverseOrder());

        /*
            B배열의 큰 수와 A배열의 작은 수를 곱하기 위하여
            각각 오름차순, 내림차순 정렬
         */
        
        int result = 0;
        for (int i = 0; i < N; i++) {
            result += (A[i] * B[i]);
        }
        sb.append(result);
        System.out.println(sb);
        br.close();
    }
}

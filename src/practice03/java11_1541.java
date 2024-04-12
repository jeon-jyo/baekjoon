package practice03;
/*
잃어버린 괄호
 */
// 14216	124
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class java11_1541 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        // 1. 뺄셈을 기준으로 먼저 나눈다.
        StringTokenizer st = new StringTokenizer(br.readLine(), "-");
        // 초기상태여부 확인값 설정
        int result = Integer.MAX_VALUE;
        while (st.hasMoreTokens()) {
            // 2. 더하기가 있으면 먼저 더해준다.
            // 최대한 큰 수를 빼주기 위하여 더하기 부터
            StringTokenizer str = new StringTokenizer(st.nextToken(), "+");
            int num = 0;
            while (str.hasMoreTokens()) {
                // num에는 +로 더한 숫자 or 뺄셈할 숫자가 담긴다.
                num += Integer.parseInt(str.nextToken());
            }

            if (result == Integer.MAX_VALUE) {
                result = num;
            } else {
                // 남은 뺄셈을 한다.
                result -= num;
            }
        }
        sb.append(result);
        System.out.println(sb);
        br.close();
    }
}

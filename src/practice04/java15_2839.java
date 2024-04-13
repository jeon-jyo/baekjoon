package practice04;
/*
설탕 배달
 */
// 	14268	136
import java.io.*;

public class java15_2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int result = 0;
        while (N > 0) {
            // 5kg으로 Nkg를 채움 - 제일 최소 개수
            if (N % 5 == 0) {
                result += N/5;
                break;
            }
            // 정확하게 Nkg이 될 수 없음
            if (N < 3) {
                result = -1;
                break;
            }
            // 3kg으로 계산
            N -= 3;
            result++;
        }
        sb.append(result);
        System.out.println(sb);
        br.close();
    }
}

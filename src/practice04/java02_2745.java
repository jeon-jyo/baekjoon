package practice04;
/*
진법 변환

B진법 수 N이 주어진다. 이 수를 10진법으로 바꿔 출력하는 프로그램을 작성하시오.

첫째 줄에 N과 B가 주어진다. (2 ≤ B ≤ 36)
첫째 줄에 B진법 수 N을 10진법으로 출력한다.
 */
// 	14256KB	124ms
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class java02_2745 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        String N = st.nextToken();
        int B = Integer.parseInt(st.nextToken());

        int tmp = 1;
        int result = 0;
        for (int i = N.length()-1; i >= 0; i--) {
            char c = N.charAt(i);
            if ('A' <= c && c <= 'Z') {
                result += (c-55) * tmp;
            } else {
                result += (c-48) * tmp;
            }
            tmp *= B;
        }
        System.out.println(result);
        br.close();
    }
}

/*
// 알파벳 범위 안의 문자라면 (A부터 시작이니까 65-10)55를 빼고 tmp와 곱한다
// 알파벳이 아니라면 (0은 48)48을 빼고  tmp와 곱한다
// 입력받은 진법B를 곱한다.
 */
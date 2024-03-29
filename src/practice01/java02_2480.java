package practice01;
/*
주사위 세개

1에서부터 6까지의 눈을 가진 3개의 주사위를 던져서 다음과 같은 규칙에 따라 상금을 받는 게임이 있다.

1. 같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다.
2. 같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다.
3. 모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.

첫째 줄에 3개의 눈이 빈칸을 사이에 두고 각각 주어진다.
 */
import java.io.*;
import java.util.StringTokenizer;

public class java02_2480 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        if(a == b && a == c) {
            sb.append(10000 + (a * 1000)).append('\n');
        } else if (a == b || a == c) {
            sb.append(1000 + (a * 100)).append('\n');
        } else if (b == c) {
            sb.append(1000 + (b * 100)).append('\n');
        } else {
            if (a >= b && a >= c) {
                sb.append(a * 100).append('\n');
            } else if (b >= c) {
                sb.append(b * 100).append('\n');
            } else {
                sb.append(c * 100).append('\n');
            }
        }
        System.out.println(sb);
        br.close();
    }
}

package practice02;
/*
제로
 */
// 	23860	252
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class java22_10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int K = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < K; i++) {
            int num = Integer.parseInt(br.readLine());
            if (!stack.isEmpty() && num == 0) {
                stack.pop();
            } else {
                stack.push(num);
            }
        }
        int cnt = 0;
        while (!stack.isEmpty()) {
            cnt += stack.pop();
        }
        sb.append(cnt);
        System.out.println(sb);
        br.close();
    }
}

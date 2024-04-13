package practice03;
/*
스택 수열
 */
// 27220	352
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class java15_1874 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        int last = 0;
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            if (last < num) {
                // peek() 이후 부터 다시 넣는게 아니라 마지막으로 넣은 숫자 이후 부터 넣는다
                for (int j = last+1; j <= num; j++) {
                    stack.push(j);
                    sb.append("+").append("\n");
                }
                last = num;
            // peek() 과 같지 않으면 NO
            } else if (!stack.isEmpty() && stack.peek() != num) {
                sb = new StringBuilder();
                sb.append("NO");
                break;
            }
            // pop()은 한 번만
            stack.pop();
            sb.append("-").append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}

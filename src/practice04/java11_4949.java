package practice04;
/*
균형잡힌 세상
 */
// 19260	228
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class java11_4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true) {
            Stack<Character> stack = new Stack<>();
            String str = br.readLine();
            if (str.equals(".")) break;
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (c == '(' || c == '[') {
                    stack.push(c);
                } else if (c == ')') {
                    // 스택이 비었거나 여는 괄호가 없을 경우 stack 에 하나 push 후 break
                    if (stack.isEmpty() || stack.peek() != '(') {
                        stack.push(c);
                        break;
                    }
                    stack.pop();
                } else if (c == ']') {
                    if (stack.isEmpty() || stack.peek() != '[') {
                        stack.push(c);
                        break;
                    }
                    stack.pop();
                }
            }
            if (stack.isEmpty()) {
                sb.append("yes").append("\n");
            } else {
                sb.append("no").append("\n");
            }
        }
        System.out.println(sb);
        br.close();
    }
}

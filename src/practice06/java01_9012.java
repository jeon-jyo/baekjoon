package practice06;
/*
괄호
...
한 쌍의 괄호 기호로 된 “( )” 문자열은 기본 VPS 이라고 부른다.
만일 x 가 VPS 라면 이것을 하나의 괄호에 넣은 새로운 문자열 “(x)”도 VPS 가 된다.

입력 데이터는 표준 입력을 사용한다. 입력은 T개의 테스트 데이터로 주어진다. 입력의 첫 번째 줄에는 입력 데이터의 수를 나타내는 정수 T가 주어진다.
각 테스트 데이터의 첫째 줄에는 괄호 문자열이 한 줄에 주어진다. 하나의 괄호 문자열의 길이는 2 이상 50 이하이다.

출력은 표준 출력을 사용한다. 만일 입력 괄호 문자열이 올바른 괄호 문자열(VPS)이면 “YES”, 아니면 “NO”를 한 줄에 하나씩 차례대로 출력해야 한다.
 */
/*
1. Stack을 활용하여 '(' 을 넣은 만큼 ')'를 빼면서 VPS인지 아닌지 판단
2. Stack에 남아있는 값들로 YES인지 NO인지 판단
 */
import java.io.*;
import java.util.Stack;

public class java01_9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < T; i++) {
            String s = br.readLine();
            String chk = "YES";
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == '(') {
                    stack.push(s.charAt(j));
                } else {
                    if (stack.empty()) {
                        chk = "NO";
                        break;
                    }
                    stack.pop();
                }
            }
            if (!stack.empty()) {
                chk = "NO";
            }
            bw.write(chk + "\n");
            stack.clear();
        }
        bw.flush();
        bw.close();
        br.close();
    }
}

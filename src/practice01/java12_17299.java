package practice01;
/*
오등큰수

Ai가 수열 A에서 등장한 횟수를 F(Ai)라고 했을 때,
Ai의 오등큰수는 오른쪽에 있으면서 수열 A에서 등장한 횟수가 F(Ai)보다 큰 수 중에서 가장 왼쪽에 있는 수를 의미한다.
그러한 수가 없는 경우에 오등큰수는 -1이다.
 */
// 	142316	1020
import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class java12_17299 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        int[] cnt = new int[1000001];
        int[] result = new int[N];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            arr[i] = num;
            cnt[num]++;
        }

        for (int i = 0; i < N; i++) {
            // 만약 cnt[arr[i]]가 스택 top에 들어 있는 값의 빈도보다 많을 경우
            while (!stack.isEmpty() && cnt[arr[stack.peek()]] < cnt[arr[i]]) {
                result[stack.pop()] = arr[i];
            }
            stack.push(i);
        }

        // stack에 남아 있는 값은 -1
        while (!stack.isEmpty()) {
            result[stack.pop()] = -1;
        }

        for (int i = 0; i < N; i++) {
            sb.append(result[i]).append(" ");
        }
        System.out.println(sb);
        br.close();
    }
}

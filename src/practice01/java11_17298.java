package practice01;
/*
오큰수

크기가 N인 수열 A = A1, A2, ..., AN이 있다. 수열의 각 원소 Ai에 대해서 오큰수 NGE(i)를 구하려고 한다.
Ai의 오큰수는 오른쪽에 있으면서 Ai보다 큰 수 중에서 가장 왼쪽에 있는 수를 의미한다. 그러한 수가 없는 경우에 오큰수는 -1이다.
 */
// 152704	1036
import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class java11_17298 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        int[] result = new int[N];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < N; i++) {
            int num = (Integer.parseInt(st.nextToken()));
            // 만약 num이 스택 top에 들어 있는 값보다 큰 경우
            while (!stack.isEmpty() && arr[stack.peek()] < num) {
                result[stack.pop()] = num;
            }
            arr[i] = num;
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

package practice09;
/*
통계학

1. 산술평균 : N개의 수들의 합을 N으로 나눈 값
2. 중앙값 : N개의 수들을 증가하는 순서로 나열했을 경우 그 중앙에 위치하는 값
3. 최빈값 : N개의 수들 중 가장 많이 나타나는 값
4. 범위 : N개의 수들 중 최댓값과 최솟값의 차이

첫째 줄에 수의 개수 N(1 ≤ N ≤ 500,000)이 주어진다. 단, N은 홀수이다. 그 다음 N개의 줄에는 정수들이 주어진다.
입력되는 정수의 절댓값은 4,000을 넘지 않는다.

첫째 줄에는 산술평균을 출력한다. 소수점 이하 첫째 자리에서 반올림한 값을 출력한다.
둘째 줄에는 중앙값을 출력한다.
셋째 줄에는 최빈값을 출력한다. 여러 개 있을 때에는 최빈값 중 두 번째로 작은 값을 출력한다.
넷째 줄에는 범위를 출력한다.
 */
// 	69880KB	708ms
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class java02_2108 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        Map<Integer, Integer> map = new HashMap<>();
        int mean = 0;   // 평균값
        int median = 0; // 중앙값
        int mode = 0;   // 최빈값
        int range = 0;  // 범위
        int sum = 0;
        int max = 0;
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            arr[i] = num;
            map.put(num,map.getOrDefault(num, 0)+1);
            sum += num;
            max = Math.max(max, map.get(num));
        }

        // 평균값
        mean = (int) Math.round((double)sum/N);

        // 중앙값
        Arrays.sort(arr);
        median = arr[N/2];

        // 최빈값
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (var num : map.entrySet()) {
            if (num.getValue() == max) {
                pq.add(num.getKey());
            }
        }
        if (pq.size() != 1) {
            pq.poll();
        }
        mode = pq.peek();

        // 범위
        range = arr[N-1] - arr[0];

        System.out.println(mean);
        System.out.println(median);
        System.out.println(mode);
        System.out.println(range);
        br.close();
    }
}

package practice07;
/*
카드 합체 놀이

아기 석환이는 자연수가 쓰여진 카드를 n장 갖고 있다. 처음에 i번 카드엔 ai가 쓰여있다. 카드 합체 놀이는 이 카드들을 합체하며 노는 놀이이다.
카드 합체는 다음과 같은 과정으로 이루어진다.

1. x번 카드와 y번 카드를 골라 그 두 장에 쓰여진 수를 더한 값을 계산한다. (x ≠ y)
2. 계산한 값을 x번 카드와 y번 카드 두 장 모두에 덮어 쓴다.

이 카드 합체를 총 m번 하면 놀이가 끝난다. m번의 합체를 모두 끝낸 뒤, n장의 카드에 쓰여있는 수를 모두 더한 값이 이 놀이의 점수가 된다.
이 점수를 가장 작게 만드는 것이 놀이의 목표이다.

첫 번째 줄에 카드의 개수를 나타내는 수 n(2 ≤ n ≤ 1,000)과 카드 합체를 몇 번 하는지를 나타내는 수 m(0 ≤ m ≤ 15×n)이 주어진다.
두 번째 줄에 맨 처음 카드의 상태를 나타내는 n개의 자연수 a1, a2, …, an이 공백으로 구분되어 주어진다. (1 ≤ ai ≤ 1,000,000)

첫 번째 줄에 만들 수 있는 가장 작은 점수를 출력한다.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class java04_15903 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine()," ");
        PriorityQueue<Long> pr = new PriorityQueue<>();
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        Long sum = 0L;
        st = new StringTokenizer(br.readLine()," ");
        for(int i = 0; i < N; i++) {
            pr.add(Long.parseLong((st.nextToken())));
        }

        for(int i = 0; i < M; i++) {
            Long x = pr.poll();
            Long y = pr.poll();
            pr.add(x+y);
            pr.add(x+y);
        }

        while (!pr.isEmpty()) {
            sum += pr.poll();
        }

        System.out.println(sum);
        br.close();
    }
}

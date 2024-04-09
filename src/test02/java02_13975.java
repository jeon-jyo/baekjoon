package test02;
/*
파일 합치기 3

소설가인 김대전은 소설을 여러 장(chapter)으로 나누어 쓰는데, 각 장은 각각 다른 파일에 저장하곤 한다.
소설의 모든 장을 쓰고 나서는 각 장이 쓰여진 파일을 합쳐서 최종적으로 소설의 완성본이 들어있는 한 개의 파일을 만든다.
이 과정에서 두 개의 파일을 합쳐서 하나의 임시파일을 만들고, 이 임시파일이나 원래의 파일을 계속 두 개씩 합쳐서 파일을 합쳐나가고,
최종적으로는 하나의 파일로 합친다. 두 개의 파일을 합칠 때 필요한 비용(시간 등)이 두 파일 크기의 합이라고 가정할 때,
최종적인 한 개의 파일을 완성하는데 필요한 비용의 총 합을 계산하시오.

프로그램은 표준 입력에서 입력 데이터를 받는다. 프로그램의 입력은 T개의 테스트 데이터로 이루어져 있는데, T는 입력의 맨 첫 줄에 주어진다.
각 테스트 데이터는 두 개의 행으로 주어지는데, 첫 행에는 소설을 구성하는 장의 수를 나타내는 양의 정수 K (3 ≤ K ≤ 1,000,000)가 주어진다.
두 번째 행에는 1장부터 K장까지 수록한 파일의 크기를 나타내는 양의 정수 K개가 주어진다. 파일의 크기는 10,000을 초과하지 않는다.

프로그램은 표준 출력에 출력한다. 각 테스트 데이터마다 정확히 한 행에 출력하는데, 모든 장을 합치는데 필요한 최소비용을 출력한다.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class java02_13975 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int T = Integer.parseInt(st.nextToken());
        for (int i = 0; i < T; i++) {
            int K = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine(), " ");
            PriorityQueue<Long> queue = new PriorityQueue<>();
            for (int j = 0; j < K; j++) {
                queue.add(Long.parseLong(st.nextToken()));
            }

            long cnt = 0;
            while (queue.size() != 1) {
                long min1 = queue.poll();
                long min2 = queue.poll();
                cnt += (min1+min2);
                queue.add(min1+min2);
            }
            System.out.println(cnt);
        }
        br.close();
    }
}

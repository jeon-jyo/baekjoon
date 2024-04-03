package practice06;
/*
풍선 터뜨리기

우선, 제일 처음에는 1번 풍선을 터뜨린다. 다음에는 풍선 안에 있는 종이를 꺼내어 그 종이에 적혀있는 값만큼 이동하여 다음 풍선을 터뜨린다.
양수가 적혀 있을 경우에는 오른쪽으로, 음수가 적혀 있을 때는 왼쪽으로 이동한다. 이동할 때에는 이미 터진 풍선은 빼고 이동한다.
 */
// 	14276KB	132ms
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class java03_2346 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        int idx = 0;
        int move = 0;
        List<int[]> list = new ArrayList<>();
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 1; i <= T; i++) {
            list.add(new int[] {i,Integer.parseInt(st.nextToken())});
        }
        for (int i = 0; i < T; i++) {
            sb.append(list.get(idx)[0]).append(" ");
            move = list.get(idx)[1];
            list.remove(idx);
            // 양수일 경우에는 삭제되고 나서 인덱스 순서의 변화가 생기기 때문에 --;
            if (move > 0) {
                move--;
            }
            if (list.isEmpty()) {
                break;
            }
            idx = (move + idx) % list.size();
            // 다시 끝에서부터 돌아와야 하기 때문에 현재 사이즈에서 -
            if(idx < 0) {
                idx = list.size() + idx;
            }
        }
        System.out.println(sb);
        br.close();
    }
}

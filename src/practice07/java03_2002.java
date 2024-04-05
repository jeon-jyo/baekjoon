package practice07;
/*
추월

대근이는 차가 터널에 들어가는 순서대로, 영식이는 차가 터널에서 나오는 순서대로 각각 차량 번호를 적어 두었다.
N개의 차량이 지나간 후, 대근이와 영식이는 자신들이 적어 둔 차량 번호의 목록을 보고,
터널 내부에서 반드시 추월을 했을 것으로 여겨지는 차들이 몇 대 있다는 것을 알게 되었다.
...

입력은 총 2N+1개의 줄로 이루어져 있다. 첫 줄에는 차의 대수 N(1 ≤ N ≤ 1,000)이 주어진다.
둘째 줄부터 N개의 줄에는 대근이가 적은 차량 번호 목록이 주어지고, N+2째 줄부터 N개의 줄에는 영식이가 적은 차량 번호 목록이 주어진다.
각 차량 번호는 6글자 이상 8글자 이하의 문자열로, 영어 대문자('A'-'Z')와 숫자('0'-'9')로만 이루어져 있다.

첫째 줄에 터널 내부에서 반드시 추월을 했을 것으로 여겨지는 차가 몇 대인지 출력한다.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class java03_2002 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<String> list = new ArrayList<String>();
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            list.add(str);
        }
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            // list의 첫번째 값과 같지 않으면 추월한값 +1 하고 삭제
            if (!list.get(0).equals(str)) {
                cnt++;
                list.remove(list.indexOf(str));
                continue;
            }
            // 같으면 현재 값을 삭제
            list.remove(0);
        }
        System.out.println(cnt);
    }
}

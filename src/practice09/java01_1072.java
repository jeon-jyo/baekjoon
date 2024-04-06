package practice09;
/*
게임

- 게임 횟수 : X
- 이긴 게임 : Y (Z%)
- Z는 형택이의 승률이고, 소수점은 버린다. 예를 들어, X=53, Y=47이라면, Z=88이다.
X와 Y가 주어졌을 때, 형택이가 게임을 최소 몇 번 더 해야 Z가 변하는지 구하는 프로그램을 작성하시오.

각 줄에 정수 X와 Y가 주어진다.
1 ≤ X ≤ 1,000,000,000
0 ≤ Y ≤ X

첫째 줄에 형택이가 게임을 최소 몇 판 더 해야하는지 출력한다. 만약 Z가 절대 변하지 않는다면 -1을 출력한다.
 */
// 	14236KB	128ms
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class java01_1072 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long X = Long.parseLong(st.nextToken());    // 게임 횟수
        long Y = Long.parseLong(st.nextToken());    // 이긴 게임
        int Z = (int)(Y*100/X);
        long answer = -1;
        if (Z >= 99) {
            System.out.println(-1);
        } else {
            long left = 0, right = X, mid = 0;
            int newZ;
            while (left <= right) {
                mid = (left+right)/2;
                newZ = (int)((Y+mid)*100/(X+mid));
                // 승률이 변한다면, while문 끝날 때 까지 최소 횟수 구하기
                if (Z != newZ) {
                    right = mid-1;
                    answer = mid;
                } else {
                    left = mid+1;
                }
            }
            System.out.println(answer);
        }
        br.close();
    }
}

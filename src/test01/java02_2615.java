package test01;
/*

 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class java02_2615 {
    static int num = 0;
    static int row = 0;
    static int col = 0;
    static boolean bool = false;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int[][] arr = new int[19][19];
        for (int i = 0; i < 19; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < 19; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                if (bool) break;
                if (arr[i][j] != 0) {
                    find(arr, i, j, 0, 0);
                }
            }
            if (bool) break;
        }
        if (!bool) System.out.println(0);
        br.close();
    }

    private static void find(int[][] arr, int x, int y, int cnt, int no) {
        if (bool) return;
        if (cnt == 4) {
            bool = true;
            System.out.println(num);
            System.out.println((row+1) + " " + (col+1));
            return;
        }
        if (x + 1 <= 19 && y + 1 <= 19 && x - 1 >= 1) {
            if (arr[x][y] == arr[x][y+1]) {
                if (no == 0 || no == 1) {
                    cnt++;
                    if (cnt == 1) {
                        num = arr[x][y];
                        row = x;
                        col = y;
                    }
                    find(arr, x, y+1, cnt, 1);
                }
            } else if (arr[x][y] == arr[x+1][y]) {
                if (no == 0 || no == 2) {
                    cnt++;
                    if (cnt == 1) {
                        num = arr[x][y];
                        row = x;
                        col = y;
                    }
                    find(arr, x+1, y, cnt, 2);
                }
            } else if (arr[x][y] == arr[x+1][y+1]) {
                if (no == 0 || no == 3) {
                    cnt++;
                    if (cnt == 1) {
                        num = arr[x][y];
                        row = x;
                        col = y;
                    }
                    find(arr, x+1, y+1, cnt, 3);
                }

            } else if (arr[x][y] == arr[x-1][y+1]) {
                if (no == 0 || no == 4) {
                    cnt++;
                    if (cnt == 1) {
                        num = arr[x][y];
                        row = x;
                        col = y;
                    }
                    find(arr, x-1, y+1, cnt, 4);
                }
            }
        }
    }
}

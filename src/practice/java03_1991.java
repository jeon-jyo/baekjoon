package practice;

import java.util.Scanner;

public class java03_1991 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        char[][] arr = new char[N][3];
        for (int i = 0; i < N; i++) {
            String str = sc.nextLine();
            arr[i][0] = str.charAt(0);
            arr[i][1] = str.charAt(2);
            arr[i][2] = str.charAt(4);
        }

        StringBuilder sb = new StringBuilder();
        // preorder
        for (int i = 0; i < N; i++) {
            sb.append(arr[i][0]);
            if (arr[i][2] == '.' && arr[i][1] != '.') {
                sb.append(arr[i][1]);
            }
        }
        sb.append("\n");

        // inorder
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            if (arr[i][1] == '.') {
                sb.append(arr[i][0]);
                for (int j = i-1; j > cnt; j--) {
                    sb.append(arr[j][0]);
                }
                cnt = i;
            } else if (arr[i][2] == '.') {
                sb.append(arr[i][1]);
                sb.append(arr[i][0]);
                for (int j = i-1; j >= cnt; j--) {
                    sb.append(arr[j][0]);
                }
                cnt = i;
            }
        }
        sb.append("\n");

        System.out.println(sb);
        sc.close();
    }
}

/*
Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        char[][] arr = new char[N][3];
        for (int i = 0; i < N; i++) {
            char n1 = sc.nextLine().charAt(0);
            char n2 = sc.nextLine().charAt(0);
            char n3 = sc.nextLine().charAt(0);
            System.out.println(n1 + " " +n2 + " " + n3);
        }
 */

/*
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        String[][] arr = new String[N][3];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(" ");
            arr[i][0] = st.nextToken();
            arr[i][1] = st.nextToken();
            arr[i][2] = st.nextToken();

        }

        System.out.println(Arrays.toString(arr));
 */
package practice04;
/*
끝말잇기

올바른 끝말잇기 기록은 각 단어의 마지막 글자가 다음 단어의 첫 글자이며, 단어가 중복되어서 나타나면 안 됩니다.

끝말잇기 기록이 주어지는데, 하나의 기록은 “?”로 가려진 채로 들어옵니다. “?”에 들어갈 수 있는 문자열들의 후보가 주어질 때,
올바른 끝말잇기 기록을 만드는 “?”에 들어갈 문자열을 출력하세요.

첫 줄에 끝말잇기 기록의 길이 N
둘째 줄부터 다음 N개의 줄에는 끝말잇기의 기록

다음 줄에 후보 단어의 개수 M
다음 M개의 줄에는 후보 단어
 */
// 14188KB	124ms
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class java03_28432 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<String> set = new HashSet<>();
        int N = Integer.parseInt(br.readLine());
        String[] arr = new String[N];
        int idx = -1;
        for (int i = 0; i < N; i++) {
            arr[i] = br.readLine();
            if (arr[i].equals("?")) {
                idx = i;
            } else {
                set.add(arr[i]);
            }
        }

        int M = Integer.parseInt(br.readLine());
        for (int i = 0; i < M; i++) {
            String word = br.readLine();
            if (N == 1) {
                System.out.println(word);
                break;
            }
            if (idx == 0) {
                if (arr[idx+1].charAt(0) == word.charAt(word.length()-1) && !set.contains(word)) {
                    System.out.println(word);
                    break;
                }
            } else if (idx == N-1) {
                if (arr[idx-1].charAt(arr[idx-1].length()-1) == word.charAt(0) && !set.contains(word)) {
                    System.out.println(word);
                    break;
                }
            } else {
                if (arr[idx+1].charAt(0) == word.charAt(word.length()-1) && arr[idx-1].charAt(arr[idx-1].length()-1) == word.charAt(0) && !set.contains(word)) {
                    System.out.println(word);
                    break;
                }
            }
        }
        br.close();
    }
}

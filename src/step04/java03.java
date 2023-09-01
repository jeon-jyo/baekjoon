package step04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class java03 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < N; i++) {
            list.add(Integer.parseInt(st.nextToken()));
        }

        for(int i = 0; i < list.size(); i++) {
            for(int j = 0; j < list.size()-1; j++) {
                if(list.get(j) > list.get(j+1)) {
                    int num = list.get(j);
                    list.set(j, list.get(j+1));
                    list.set(j+1, num);
                }
            }
        }
        System.out.println(list.get(0) + " " + list.get(list.size()-1));
        br.close();
    }
}

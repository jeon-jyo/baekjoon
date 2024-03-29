package practice02;
/*
상수

상수는 수를 다른 사람과 다르게 거꾸로 읽는다. 예를 들어, 734와 893을 칠판에 적었다면, 상수는 이 수를 437과 398로 읽는다.
따라서, 상수는 두 수중 큰 수인 437을 큰 수라고 말할 것이다.

두 수가 주어졌을 때, 상수의 대답을 출력하는 프로그램을 작성하시오.

첫째 줄에 상근이가 칠판에 적은 두 수 A와 B가 주어진다. 두 수는 같지 않은 세 자리 수이며, 0이 포함되어 있지 않다.
 */
import java.util.Scanner;

public class java03_2908 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = String.valueOf(new StringBuffer(sc.nextLine()).reverse()).split(" ");
        if(Integer.parseInt(arr[0]) > Integer.parseInt(arr[1])) {
            System.out.println(arr[0]);
        } else {
            System.out.println(arr[1]);
        }
        sc.close();
    }
}

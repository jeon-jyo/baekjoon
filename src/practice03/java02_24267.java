package practice03;
/*
알고리즘 수업 - 알고리즘의 수행 시간 6

MenOfPassion(A[], n) {
    sum <- 0;
    for i <- 1 to n - 2
        for j <- i + 1 to n - 1
            for k <- j + 1 to n
                sum <- sum + A[i] × A[j] × A[k]; # 코드1
    return sum;
}
 */
import java.util.Scanner;

public class java02_24267 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextInt();
        System.out.println((N*(N-1)*(N-2)) / 6);
        System.out.println(3);
        sc.close();
    }
}

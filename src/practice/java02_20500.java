package practice;

import java.util.Scanner;

public class java02_20500 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str =  "5".repeat(n);
        int d = Integer.parseInt(str);
        int chk = 40;
        int num = 0;
        for(int i = 0; i < n*n/2; i++){
            String binaryString = Integer.toBinaryString(i);
            int chk2 = Integer.parseInt(binaryString);
            if((d - chk * chk2) % 15 == 0){
                num++;
            }
        }
        System.out.println(num);
    }
}

package Ykyk010;

import java.util.Scanner;

public class Y07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numAry = new int[4];
        int hap = 0;

        for (int i = 0; i <= 3; i++) {
            System.out.print("숫자 : ");
            numAry[i] = sc.nextInt();
        }

        hap = numAry[0] + numAry[1] + numAry[2] + numAry[3];
        System.out.println("합계 ==> " + hap);

        sc.close();
    }
}

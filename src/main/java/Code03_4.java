import java.util.Scanner;

public class Code03_4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1, n2;
        double res1;

        System.out.print("첫 번째 숫자를 입력하세요: ");
        n1 = sc.nextInt();
        System.out.print("두 번째 숫자를 입력하세요: ");
        n2 = sc.nextInt();

        // 나눗셈 연산 (double 타입 사용)
        res1 = (double) n1 / n2;
        System.out.println(n1 + " / " + n2 + " = " + res1);

        // 덧셈 연산
        int res = n1 + n2;
        System.out.println(n1 + " + " + n2 + " = " + res);

        sc.close();
    }
}

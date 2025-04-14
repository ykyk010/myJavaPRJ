import java.util.Scanner;

public class B5523 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 라운드 수
        int aWins = 0;
        int bWins = 0;

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (a > b) {
                aWins++;
            } else if (b > a) {
                bWins++;
            }
            // 같을 경우 무승부이므로 아무 일도 하지 않음
        }

        System.out.println(aWins + " " + bWins);
    }
}

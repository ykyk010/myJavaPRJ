import java.util.Scanner;

public class Yk20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        if (m == 1 || m == 2) {
            System.out.println("뉴비");
        } else if (m <= n) {
            System.out.println("OLDBIE!");
        } else {
            System.out.println("TLE!");
        }
    }
}

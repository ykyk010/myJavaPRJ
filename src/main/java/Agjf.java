import java.util.Scanner;

public class Agjf {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String a = "*";
        String c = "*";

        System.out.print("최대별의 갯수 : ");
        int b = s.nextInt();

        for (int i = 1; i <= b; i++) {
            System.out.println(a);
            if (a.length() < b) {
                a = a + c;
            }
        }

        for (int i = b - 1; i >= 1; i--) {
            System.out.println(a.substring(0, i));
        }
    }
}


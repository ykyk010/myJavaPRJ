import java.util.Scanner;

public class Yk21 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String a = s.next();
        String b = s.next();

        String res = (a + b).toLowerCase().replaceAll(" ", "");
        System.out.println(res);

        s.close();
    }
}

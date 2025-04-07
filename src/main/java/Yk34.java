import java.util.Scanner;

public class Yk34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        scanner.close();

        String superPermutation = Yk34Permutation.findSuperPermutation(n);
        System.out.println("Super Permutation: " + superPermutation);
        System.out.println("Length: " + superPermutation.length());
    }
}

class Yk34Permutation {
    public static String findSuperPermutation(int n) {
        // 기저 사례: n=1일 때 초순열은 "1"
        if (n == 1) return "1";

        // 이전 단계(n-1)의 초순열을 먼저 구함
        String previousSuperPermutation = findSuperPermutation(n - 1);

        // 새로운 숫자를 추가하여 확장
        StringBuilder superPermutation = new StringBuilder(previousSuperPermutation);

        // n이 포함된 순열 추가 (순차적으로 숫자 추가)
        for (int i = 1; i <= n; i++) {
            String perm = generatePermutation(n, i);
            int overlap = findOverlap(superPermutation.toString(), perm);
            superPermutation.append(perm.substring(overlap));
        }

        return superPermutation.toString();
    }

    // n개의 숫자를 포함한 순열을 하나 생성
    private static String generatePermutation(int n, int fixed) {
        StringBuilder perm = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            if (i != fixed) perm.append(i);
        }
        perm.append(fixed);
        return perm.toString();
    }

    // 기존 초순열과 새로운 숫자의 겹치는 부분 찾기
    private static int findOverlap(String a, String b) {
        for (int i = 0; i < a.length(); i++) {
            if (b.startsWith(a.substring(i))) {
                return a.length() - i;
            }
        }
        return 0;
    }
}

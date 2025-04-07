import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Yk33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        scanner.close();

        String superPermutation = SuperPermutation.findSuperPermutation(n);
        System.out.println("Super Permutation: " + superPermutation);
        System.out.println("Length: " + superPermutation.length());
    }
}

// SuperPermutation 클래스를 Yk33과 별도로 분리
class SuperPermutation {
    public static String findSuperPermutation(int n) {
        List<String> permutations = new ArrayList<>();
        generatePermutations(n, new boolean[n], "", permutations);

        StringBuilder superPermutation = new StringBuilder(permutations.get(0));

        for (int i = 1; i < permutations.size(); i++) {
            String perm = permutations.get(i);
            int overlap = findOverlap(superPermutation.toString(), perm);
            superPermutation.append(perm.substring(overlap));
        }

        return superPermutation.toString();
    }

    private static void generatePermutations(int n, boolean[] used, String current, List<String> result) {
        if (current.length() == n) {
            result.add(current);
            return;
        }
        for (int i = 1; i <= n; i++) {
            if (!used[i - 1]) {
                used[i - 1] = true;
                generatePermutations(n, used, current + i, result);
                used[i - 1] = false;
            }
        }
    }

    private static int findOverlap(String a, String b) {
        for (int i = 0; i < a.length(); i++) {
            if (b.startsWith(a.substring(i))) {
                return a.length() - i;
            }
        }
        return 0;
    }
}
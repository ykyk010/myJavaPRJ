public class Yk13 {
    public static void main(String[] args) {
        String str = "   한글   ABCD  efgh ";
        String cutStr = "";
        String reStr = ""; //공백 제거를 위해 replaceAll 실행 결과 저장되는 변수
        boolean res;

        cutStr = str.trim();
        reStr = str.replaceAll("", "");
        res = str.isEmpty();
        boolean res2 = str.length() == 0;

        System.out.println(cutStr);
        System.out.println(reStr);
        System.out.println(res);
        System.out.println(res2);
    }
}

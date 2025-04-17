public class Kfkehf {
    public static void main(String[] args) {

        for (int i=1; i<=7 ; i++ ) {
           if (i<=4) {
               for (int j=1; j<=i ;j++ ) {
                   System.out.print("*");

               }
           } else {
               for (int j=1; j<=8 -i ;j++ ) {
                   System.out.print("*");
               }
           }
           System.out.println();
        }
    }
}

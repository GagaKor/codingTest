import java.util.Scanner;

public class lvl3_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n >= 1 && n <= 1000) {
            String a = "*";
            for (int i = 0; i < n; i++) {
                for (int j = (n - 1) - i; j > 0; j--) {
                    System.out.print(" ");
                }
                System.out.println(a);
                a += "*";
            }
        }
    }
}

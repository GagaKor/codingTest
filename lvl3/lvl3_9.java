import java.util.Scanner;

public class lvl3_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String a = "*";
        for (int i = 0; i < n; i++) {
            System.out.println(a);
            a+="*";
        }
    }
}

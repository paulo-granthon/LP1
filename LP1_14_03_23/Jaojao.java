package LP1_14_03_23;
import java.util.Scanner;

public class Jaojao {
    public static void Main (String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = ((sc.nextInt() % 100) + 100) % 100;
        int m = ((sc.nextInt() % 100) + 100) % 100;

        sc.close();

        System.out.println(n + " " + m);
        System.out.println(n + m);

    }
}

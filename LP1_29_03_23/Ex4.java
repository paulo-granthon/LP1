package LP1_29_03_23;
import java.util.Scanner;
public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o número inicial: ");
        int prev = sc.nextInt();
        System.out.println("Insira a razão: ");
        int raz = sc.nextInt();
        int n = 10;
		int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = prev * raz;
            prev = numbers[i];
            System.out.println("O " + (i + 1) + "º é " + numbers[i]);
        }
        sc.close();
	}
}
import java.util.Scanner;
public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o número inicial: ");
        int init = sc.nextInt();
        System.out.println("Insira a razão: ");
        int raz = sc.nextInt();
        int n = 10;
		int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = init + (i * raz);
            System.out.println("O " + (i + 1) + "º é " + numbers[i]);
        }
        sc.close();
	}
}
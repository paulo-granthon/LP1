import java.util.Scanner;
public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 10;
		int[] numbers = new int[n];
        int smaller = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            System.out.println("Insira o " + (i + 1) + "º número: ");
            numbers[i] = sc.nextInt();
            if (numbers[i] < smaller) smaller = numbers[i];
        }
        sc.close();
        System.out.println("O menor número é " + smaller);
	}
}
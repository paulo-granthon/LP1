package LP1_29_03_23;
import java.util.Scanner;
public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 10;
		int[] numbers = new int[n];
        int biggest = Integer.MIN_VALUE;
        int biggest_index = -1;
        for (int i = 0; i < n; i++) {
            System.out.println("Insira o " + (i + 1) + "º número: ");
            numbers[i] = sc.nextInt();
            if (numbers[i] > biggest) {
                biggest = numbers[i];
                biggest_index = i;
            }
        }
        sc.close();
        System.out.println("O maior número é " + biggest + " e seu índice é " + biggest_index);
	}
}
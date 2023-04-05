package LP1_29_03_23;
import java.util.Scanner;
public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 10;
		int[] numbers = new int[n];
        int smaller = Integer.MAX_VALUE;
        int biggest = Integer.MIN_VALUE;
        int smaller_index = -1;
        int biggest_index = -1;
        for (int i = 0; i < n; i++) {
            System.out.println("Insira o " + (i + 1) + "º número: ");
            numbers[i] = sc.nextInt();
            if (numbers[i] < smaller) {
                smaller = numbers[i];
                smaller_index = i;
            }
            if (numbers[i] > biggest) {
                biggest = numbers[i];
                biggest_index = i;
            }
        }
        sc.close();
        System.out.println("O menor número é " + smaller + " e seu índice é " + smaller_index);
        System.out.println("O maior número é " + biggest + " e seu índice é " + biggest_index);
	}
}
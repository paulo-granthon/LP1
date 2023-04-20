package LP1_29_03_23;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
public class Ex5 {
    public static void main(String[] args) {
        int n = 10;
		int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = ThreadLocalRandom.current().nextInt(0, 100);
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o número: ");    
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (num == numbers[i]) {
                System.out.println("O número " + num + " está no índice " + i + " na array\n" + numbers);
            } else {
                // System.out.println("O número " + num + " está no índice " + i + " na array\n" + numbers);
            }
        }
        sc.close();
	}
}
// https://docs.google.com/spreadsheets/d/1eQSLCbuXcVTmkT7b4MCg_thQHrnkjT1wtnMDeEhPFBI/edit#gid=449727251
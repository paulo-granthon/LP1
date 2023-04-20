package LP1_29_03_23;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
public class Ex5 {
    public static void main(String[] args) {
        int n = 10;
		int[] numbers = new int[n];
        String numbers_str = "{";
        for (int i = 0; i < n; i++) {
            numbers[i] = ThreadLocalRandom.current().nextInt(0, 100);
            numbers_str += numbers[i] + (i < n-1 ? ", " : "}"); 
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o número: ");    
        int num = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < n; i++) {
<<<<<<< HEAD
            int num = sc.nextInt();
            if (num == numbers[i]) {
                System.out.println("O número " + num + " está no índice " + i + " na array\n" + numbers);
            } else {
                // System.out.println("O número " + num + " está no índice " + i + " na array\n" + numbers);
            }
=======
            if (num != numbers[i]) continue;
            System.out.println("O número " + num + " está no índice " + i + " na array " + numbers_str);
            found = true;
>>>>>>> ad27abf682c241d087a5b4c466bb5ebc17fcaadb
        }
        if (!found) System.out.println("O número " + num + " não está na array " + numbers_str);
        sc.close();
	}
}
// https://docs.google.com/spreadsheets/d/1eQSLCbuXcVTmkT7b4MCg_thQHrnkjT1wtnMDeEhPFBI/edit#gid=449727251
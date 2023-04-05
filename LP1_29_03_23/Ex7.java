package LP1_29_03_23;
import java.util.Scanner;
public class Ex7 {
    public static void main (String[] args) {
        char[][] board = new char[3][3];
        while (true) {
            Scanner sc = new Scanner(System.in);
            int x = Integer.MAX_VALUE;
            while (x < 1 || x > 3) {
                System.out.println("Insira a posição horizontal (1 ~ 3): ");
                x = sc.nextInt();
            }
            int y = Integer.MAX_VALUE;
            while (y < 1 || y > 3) {
                System.out.println("Insira a posição vertical (1 ~ 3): ");
                y = sc.nextInt();
            }
            char value = '\0';
            while (value != 'x' && value != 'o') {
                System.out.println("Insira o valor da posição (x / o): ");
                value = sc.next().charAt(0);
            }
            board[x - 1][y - 1] = value;
            sc.close();
        }
    }
}

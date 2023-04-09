package LP1_29_03_23;
import java.util.Scanner;
public class Ex7 {
    public static void main (String[] args) {
        int s = 3;
        char[][] board = new char[s][s];
        try (Scanner sc = new Scanner(System.in)) {
            while (true) {
                for (int _x = 0; _x < s; _x++) {
                    for (int _y = 0; _y < s; _y++) {
                        char c = board[_x][_y];
                        System.out.print("|" + ((c == 'x') ? "x" : (c == 'o') ? "o" : "_") + "|");
                    }
                    System.out.print("\n");
                }
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
                    System.out.println("Insira o valor (x / o): ");
                    value = sc.next().charAt(0);
                }
                board[x - 1][y - 1] = value;
            }
        }
    }
}

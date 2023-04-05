package LP1_02_03_23.EvenOdd;
import java.util.Random;
import java.util.Scanner;

class EvenOdd {
  
  public static void main(String[] args) {
    int numero = ((new Random().nextInt() % 101) + 101) % 101;
    Scanner sc = new Scanner(System.in);

    while (true) {
      if (adivinhar(numero, sc)) {
        break;
      }
    }

    System.out.println("Parabéns, acertou :D");

  }

  static boolean adivinhar (int numero, Scanner sc) {
    System.out.println("Adivinhe o número (0 ~ 100)");
    int tentativa = sc.nextInt();
    if (tentativa == numero) return true;
    if (tentativa < numero) {
      System.out.println("Mais");
    } else {
      System.out.println("Menos");
    }
    return false;
  }
}

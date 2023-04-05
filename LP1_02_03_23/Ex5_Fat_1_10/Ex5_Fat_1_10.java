package LP1_02_03_23.Ex5_Fat_1_10;
// Printa todos os fatorias de 1 a 10
public class Ex5_Fat_1_10 {
    public static void main (String[] args) {
        int num = 1;
        for (int i = 1; i < 11; i++) {
            num = num * i;
            System.out.println(num);
        }
    }
}

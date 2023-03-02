// Multiplos de 3 entre 1 e 100
public class Mults3_1_100 {

    public void main (String[] args) {
        for (int i = 1; i < 100; i++) {
            int m = i * 3;
            if (m > 100) break;
            System.out.println(m);
        }
    }
}
// Soma de todos os numeros entre 1 e 1000
public class Sum1_1000 {

    public static void main (String[] args) {
        int sum = 0;
        for (int i = 1; i < 1001; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
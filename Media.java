import java.util.Scanner;

public class Media {

    int num_notas;
    double[] notas;
    int cur_index;

    public Media (int n) {
        this.num_notas = n;
    }

    public void add (double nota) {
        if (this.notas == null) this.notas = new double[this.num_notas];
        this.notas[this.cur_index] = nota;
        this.cur_index += 1;
    }

    public double aritmetica () {
        double sum = 0;
        for (int i = 0; i < this.num_notas; i++) {
            sum += this.notas[i];
        }
        return sum / this.num_notas;
    }
    public double ponderada () {
        return (this.notas[0] * 0.2 + this.notas[1] * 0.3 + this.notas[2] * 0.5) / this.num_notas;
    }

    public static void main (String[] args) {

        // System.out.println("São quantas notas?");
        // Media media = new Media(sc.nextDouble());
        Media media = new Media(3);

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < media.num_notas; i++) {
            System.out.println("insira a " + (i + 1) + "º nota");
            media.add(sc.nextDouble());
        }

        System.out.println("Qual cálculo deseja efetuar?\nMédia Aritmética: 1\nMédia Ponderada: 2");
        if (sc.nextDouble() == 1) {
            System.out.println("A média é " + media.aritmetica());
        } else {
            System.out.println("A média é " + String.format("%.2f", media.ponderada()));
        }

        sc.close();

    }

}
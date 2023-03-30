import java.util.Scanner;

public class _Ex5 {
    public static void main (String[] args) {

        a();
        b();
        c();
        d();
        e();

    }

    public static void a () {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int bobo = sc.nextInt();

        sc.close();

        String resp = "S";

        for (int i = 2; i < n; i++) {
            if (n > bobo) resp = "N";
        }

        System.out.println(resp);
    }

    public static void b () {
        Scanner sc = new Scanner(System.in);

        int[] entrada = new int[] { sc.nextInt(), sc.nextInt() };
        sc.close();

        int a = entrada[0];
        int b = entrada[1];

        System.out.printf("%.2f", a / b);
    }

    public static void c () {
        Scanner sc = new Scanner(System.in);

        int[] x = new int[] { sc.nextInt(), sc.nextInt(), sc.nextInt() };
        sc.close();

        int a = x[0];
        int b = x[1];
        int c = x[2];

        if (a + b == c || a == b + c || a == b || a == c || b == c) {
            System.out.println("S");
        } else {
            System.out.println("N");
        }

    }

    public static void d () {
        Scanner sc = new Scanner(System.in);

        int[] entrada = new int[] { sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt() };
        sc.close();

        int ca = entrada[0];
        int ba = entrada[1];
        int pa = entrada[2];
        int cr = entrada[0];
        int br = entrada[1];
        int pr = entrada[2];

        int resposta = 0;

        if (cr > ca) {
            resposta += cr - ca;
        }
        if (br > ba) {
            resposta += br - ba;
        }
        if (pr > pa) {
            resposta += pr - pa;
        }

        System.out.println(resposta);
    }

    public static void e () {
        Scanner sc = new Scanner(System.in);

        int[] entrada = new int[] { sc.nextInt(), sc.nextInt() };
        sc.close();

        while (entrada[0] != 0) {
            int altura = entrada[0];
            int comprimento = entrada[1];

            int xs = sc.nextInt();

            int quantidade = altura - xs;
            int anterior = xs;

            for (int x = 0; x < xs; x++) {
                if (x < anterior) {
                    quantidade += anterior - x;
                }
                anterior = x;
            }

            System.out.println(quantidade);

            entrada = new int[] { sc.nextInt(), sc.nextInt() };

        }
    }
}
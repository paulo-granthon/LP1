import java.lang.Math;

public class Conta {
    String titular;
    int numero;
    String agencia;
    double saldo;
    String abertura;

    public double saca (double qt) {
        return Math.min(saldo, qt);
    }

    public void deposita (double qt) {
        saldo += qt;
    }

    public double calculaRendimento () {
        return saldo * 1.1;
    }
}
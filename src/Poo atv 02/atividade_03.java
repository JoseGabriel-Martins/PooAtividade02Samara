public class atividade_03 {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria(12345, 1000.0);

        conta1.depositar(500.0);
        conta1.sacar(200.0);
        conta1.sacar(2000.0); // teste de saque maior que o saldo

        System.out.println("Saldo final: " + conta1.getSaldo());
    }
}

class ContaBancaria {
    private int numeroConta;
    private double saldo;

    public ContaBancaria(int numeroConta, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente para saque de " + valor);
        }
    }

    public double getSaldo() {
        return saldo;
    }
}

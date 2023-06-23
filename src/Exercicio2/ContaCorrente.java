package Exercicio2;

public class ContaCorrente extends ContaBancaria implements Tributavel{

    private double limite;
    private static double taxaTributo = 0.1;

    public ContaCorrente(String nomeCliente, int numConta, double saldo, double limite) {
        super(nomeCliente, numConta, saldo);
        this.limite = limite;
    }

    public double getLimite() {

        return limite;
    }

    public double calcularTributo () {
        return getSaldo() * taxaTributo;
    }

    @Override
    public void sacar(double valor) {
        if (this.getSaldo() + limite - valor < 0) {
            System.out.println("-----|Limite excedido.|-----");
        } else {
            this.setSaldo(this.getSaldo() - valor);
            System.out.println("-----|Limite liberado|-----");
        }
    }

    @Override
    public double calcularTributos() {
        return 0;
    }
}

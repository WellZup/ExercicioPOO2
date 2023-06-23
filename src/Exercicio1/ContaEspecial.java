package Exercicio1;

public class ContaEspecial extends ContaBancaria{

    private double limite;
    public ContaEspecial(String nomeCliente, int numConta, double saldo, double limite) {
        super(nomeCliente, numConta, saldo);
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
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
}

package Exercicio2;

public  class ContaBancaria {
    private String nomeCliente;
    public int numConta;

    private double saldo;

    public ContaBancaria(String nomeCliente, int numConta, double saldo) {
        this.nomeCliente = nomeCliente;
        this.numConta = numConta;
        this.saldo = saldo;
    }

    //Métodos
    public void sacar (double valor) {

        if (this.getSaldo() >= valor) {
            this.setSaldo(this.getSaldo() - valor);
            System.out.println("-----|Saque realizado com sucesso, na conta de " + this.nomeCliente +"|-----");
        } else {
            System.out.println("-----|Saldo insuficiente!|-----");
        }

    }

    public void depositar (double valor) {

        this.setSaldo(this.getSaldo() + valor);
        System.out.println("-----|Deposito realizado com sucesso, na conta de " + this.nomeCliente +"|-----");

    }

    public void mostraSaldo () {
        System.out.println("-----|Saldo atual: R$" + saldo + "|-----");
    }

    public void mostrarDados() {
        System.out.println("-----|Nome do cliente: " + nomeCliente + "|-----");
        System.out.println("-----|Número da conta: " + numConta + "|-----");
        System.out.println("-----|Saldo: R$ " + saldo + "|-----");
    }

    //Métodos Especiais


    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}

package Exercicio1;

import java.util.Calendar;

public class ContaPoupanca extends ContaBancaria{


    private final int diaRendimento;

    public ContaPoupanca(String nomeCliente, int numConta, double saldo, int diaRendimento) {
        super(nomeCliente, numConta, saldo, diaRendimento);
        this.diaRendimento = diaRendimento;

    }


    //Métodos
    public void calcularNovoSaldo (double taxaRendimento) {

        if (diaRendimento == Calendar.getInstance().get(Calendar.DAY_OF_MONTH)) {
            double rendimento = getSaldo() * taxaRendimento;
            depositar(rendimento);
            System.out.println("-----|Saldo rendimento: R$ " + diaRendimento + "|-----");
        }


    }


}

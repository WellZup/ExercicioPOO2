package Exercicio2;

import java.util.Calendar;

public class ContaPoupanca extends ContaBancaria {


    private int diaRendimento;

    public ContaPoupanca(String nomeCliente, int numConta, double saldo) {
        super(nomeCliente, numConta, saldo);

    }


    //Métodos
    public void calcularNovoSaldo (double taxaRendimento) {

        if (diaRendimento == Calendar.getInstance().get(Calendar.DAY_OF_MONTH)) {
            double rendimento = getSaldo() * taxaRendimento;
            depositar(rendimento);
        }


    }

}

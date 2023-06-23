package Exercicio1;

public class Teste {
    public static void main(String[] args) {


        //Criar contas
        ContaBancaria cliente1 = new ContaBancaria("José Corvo", 123, 1000);
        ContaPoupanca cliente2 = new ContaPoupanca("Stella Artois", 321, 2000, 10);
        ContaEspecial cliente3 = new ContaEspecial("El Jimador", 456, 3000, 500);

        //Sacar
        cliente1.sacar(500);
        System.out.println("-----|-------------------------------|");
        cliente2.sacar(250);
        System.out.println("-----|-------------------------------|");
        cliente3.sacar(1000);
        System.out.println("-----|-------------------------------|");

        //Depositar
        cliente1.depositar(100);
        System.out.println("-----|-------------------------------|");
        cliente2.depositar(1000);
        System.out.println("-----|-------------------------------|");
        cliente3.depositar(10);

        //Novo saldo
        cliente2.calcularNovoSaldo(0.5);
        System.out.println("-----|"+ cliente2.numConta +"-------------------------------|" );

        //Dados dos clientes

        cliente1.mostrarDados();
        System.out.println("-----|-------------------------------|");
        cliente2.mostrarDados();
        System.out.println("-----|-------------------------------|");
        cliente3.mostrarDados();
        System.out.println("-----|-------------------------------|");








    }
}

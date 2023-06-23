package Exercicio2;

public class Teste {
    public static void main(String[] args) {


        //Criar contas
        ContaBancaria cliente1 = new ContaBancaria("José Corvo", 123, 1000);
        ContaPoupanca cliente2 = new ContaPoupanca("Stella Artois", 321, 2000);
        ContaCorrente cliente3 = new ContaCorrente("El Jimador", 456, 3000, 500);


        //Seguro de vida
        SeguroDeVida seguroDeVida = new SeguroDeVida();


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
        System.out.println("-----|-------------------------------|");

        //Rendimentos


        //Tributos

        double tributoCCorrente = cliente3.calcularTributo();
        double tributoSeguroDeVida = seguroDeVida.calcularTributos();

        //Dados dos clientes

        cliente1.mostrarDados();
        System.out.println("-----|-------------------------------|");
        cliente2.mostrarDados();
        System.out.println("-----|-------------------------------|");
        cliente3.mostrarDados();
        System.out.println("-----|-------------------------------|");

        System.out.println("-----|Tributos da conta corrente: R$ " + tributoCCorrente  + ". Do cliente: " +
                cliente3.getNomeCliente() +"|-----");
        System.out.println("-----|-------------------------------|");
        System.out.println("-----|Tributos do seguro de vida: R$ " + tributoSeguroDeVida + "|-----");
    }


}

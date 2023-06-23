package Exercicio2;

public class SeguroDeVida implements Tributavel {
    private static final double taxaTributo = 42.0;

     public double calcularTributos() {
        return taxaTributo;
    }
}

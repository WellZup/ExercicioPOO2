package Exercicio4;

public class UrsoDoCanada extends Mamifero {
    public UrsoDoCanada(String nome, double comprimento, String cor, double velocidade) {
        super(nome, comprimento, 4, cor, velocidade);
        setAlimento("mel");
    }
}
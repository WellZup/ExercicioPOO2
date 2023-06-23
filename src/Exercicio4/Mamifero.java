package Exercicio4;

public class Mamifero extends Animal {
    private String alimento;

    public Mamifero(String nome, double comprimento, int numPatas, String cor, double velocidade) {
        super(nome, comprimento, numPatas, cor, "terra", velocidade);
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

}
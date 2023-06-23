package Exercicio4;

public class Peixe extends Animal {
    private String caracteristicas;

    public Peixe(String nome, double comprimento, String cor, double velocidade) {
        super(nome, comprimento, 0, cor, "mar", velocidade);
        this.caracteristicas = "barbatanas e cauda";
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }
}

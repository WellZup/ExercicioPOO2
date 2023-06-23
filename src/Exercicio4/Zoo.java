package Exercicio4;

public class Zoo {
    public static void main(String[] args) {
        Animal camelo = new Animal("Camelo", 2.0, 4, "marrom", "terra", 2.0);
        Peixe tubarao = new Peixe("Tubarão", 3.0, "cinzento", 1.5);
        UrsoDoCanada urso = new UrsoDoCanada("Urso-do-Canadá", 1.5, "castanho", 0.5);
        Animal iguana = new Animal("Iguana", 0.5, 4, "verde", "terra", 0.2);
        Animal leao = new Animal("Leão", 1.0, 4, "amarelo", "terra", 3.0);
        Mamifero micoLeaoDourado = new Mamifero("Mico-leão-dourado", 0.3, 4, "laranja", 0.3);

        System.out.println("Lista de animais do jardim zoológico:");
        System.out.println("- " + camelo.getNome() + ": " + camelo.getCor() + ", " + camelo.getComprimento() + " m, "
                + camelo.getNumPatas() + " patas, " + camelo.getAmbiente() + ", " + camelo.getVelocidade() + " m/s");
        System.out.println("- " + tubarao.getNome() + ": " + tubarao.getCor() + ", " + tubarao.getComprimento() + " m, "
                + tubarao.getNumPatas() + " patas, " + tubarao.getAmbiente() + ", " + tubarao.getVelocidade() + " m/s, " + tubarao.getCaracteristicas());
        System.out.println("- " + urso.getNome() + ": " + urso.getCor() + ", " + urso.getComprimento() + " m, "
                + urso.getNumPatas() + " patas, " + urso.getAmbiente() + ", " + urso.getVelocidade() + " m/s, "
                + "alimentação preferida: " + urso.getAlimento());
        System.out.println("- " + iguana.getNome() + ": " + iguana.getCor() + ", " + iguana.getComprimento() + " m, "
                + iguana.getNumPatas() + " patas, " + iguana.getAmbiente() + ", " + iguana.getVelocidade() + " m/s");
        System.out.println("- " + leao.getNome() + ": " + leao.getCor() + ", " + leao.getComprimento() + " m, "
                + leao.getNumPatas() + " patas, " + leao.getAmbiente() + ", " + leao.getVelocidade() + " m/s");
        System.out.println("- " + micoLeaoDourado.getNome() + ": " + micoLeaoDourado.getCor() + ", "
                + micoLeaoDourado.getComprimento() + " m, " + micoLeaoDourado.getNumPatas() + " patas, "
                + micoLeaoDourado.getAmbiente() + ", " + micoLeaoDourado.getVelocidade() + " m/s");
    }
}

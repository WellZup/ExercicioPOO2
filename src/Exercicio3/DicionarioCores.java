package Exercicio3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DicionarioCores {
    public static void main(String[] args) {
        Map<String, List<String>> objetosCores = new HashMap<>();

        // Adicionando objetos e suas respectivas cores ao dicionário
        objetosCores.put("bola", new ArrayList<>());
        objetosCores.get("bola").add("azul");
        objetosCores.put("boneca", new ArrayList<>());
        objetosCores.get("boneca").add("amarela");
        objetosCores.put("dado", new ArrayList<>());
        objetosCores.get("dado").add("rosa");

        // Imprimindo as chaves e seus valores
        for (String objeto : objetosCores.keySet()) {
            List<String> cores = objetosCores.get(objeto);
            System.out.println(objeto + " -> " + cores.get(0));
        }
    }
}
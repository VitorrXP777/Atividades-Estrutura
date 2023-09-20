package torresDeHanoi;

import java.util.Stack;

public class TorreHanoi {
    private Stack<Disco> pilha;

    public TorreHanoi() {
        pilha = new Stack<>();
    }

    public void empilhar(Disco disco) {
        pilha.push(disco);
    }

    public Disco desempilhar() {
        if (!pilha.isEmpty()) {
            return pilha.pop();
        } else {
            return null;
        }
    }

    public void imprimirTorre() {
        for (Disco disco : pilha) {
            System.out.println("Disco de tamanho " + disco.getTamanho());
        }
    }
}

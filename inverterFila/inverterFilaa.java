package inverterFila;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class inverterFilaa {
    public static Queue<Integer> inverterFila(Queue<Integer> fila) {
        Queue<Integer> F2 = new LinkedList<>();
        Stack<Integer> pilhaAuxiliar = new Stack<>();

        // Passo 1: Esvazie F1 e empilhe elementos na pilha auxiliar
        while (!fila.isEmpty()) {
            pilhaAuxiliar.push(fila.poll());
        }

        // Passo 2: Desempilhe elementos da pilha auxiliar e empilhe em F2
        while (!pilhaAuxiliar.isEmpty()) {
            F2.add(pilhaAuxiliar.pop());
        }

        return F2;
    }

    public static void main(String[] args) {
        Queue<Integer> F1 = new LinkedList<>();
        F1.add(1);
        F1.add(2);
        F1.add(3);

        Queue<Integer> F2 = inverterFila(F1);

        System.out.println("Fila original F1: " + F1);
        System.out.println("Fila invertida F2: " + F2);
    }
}


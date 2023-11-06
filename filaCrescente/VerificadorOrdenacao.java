package filaCrescente;

import java.util.Queue;

public class VerificadorOrdenacao {
    public static boolean estaOrdenadoCrescente(Queue<Integer> fila) {
        if (fila.isEmpty()) {
            return true; // Uma fila vazia é considerada ordenada.
        }

        int elementoAnterior = fila.poll();

        while (!fila.isEmpty()) {
            int elementoAtual = fila.poll();
            if (elementoAnterior > elementoAtual) {
                return false; // Elemento fora de ordem, a fila não está ordenada.
            }
            elementoAnterior = elementoAtual;
        }

        return true; // Todos os elementos estão em ordem crescente.
    }
}


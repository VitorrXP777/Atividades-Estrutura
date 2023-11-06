package filaCrescente;

import java.util.LinkedList;
import java.util.Queue;

public class main {
    public static void Main(String[] args) {
        Queue<Integer> fila1 = new LinkedList<>();
        fila1.add(1);
        fila1.add(2);
        fila1.add(3);

        Queue<Integer> fila2 = new LinkedList<>();
        fila2.add(4);
        fila2.add(2);
        fila2.add(6);

        boolean ordenado1 = VerificadorOrdenacao.estaOrdenadoCrescente(fila1);
        boolean ordenado2 = VerificadorOrdenacao.estaOrdenadoCrescente(fila2);

        System.out.println("Fila 1 está ordenada? " + ordenado1);
        System.out.println("Fila 2 está ordenada? " + ordenado2);
    }
}


package operacoesDaPilha;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class Pilha<T> {
    private ArrayList<T> elementos;
    private int capacidade;

    public Pilha(int capacidade) {
        this.capacidade = capacidade;
        this.elementos = new ArrayList<>(capacidade);
    }

    public void create() {
        elementos.clear();
    }

    public boolean isEmpty() {
        return elementos.isEmpty();
    }

    public boolean isFull() {
        return elementos.size() == capacidade;
    }

    public void push(T elemento) {
        if (isFull()) {
            throw new IllegalStateException("A pilha está cheia");
        }
        elementos.add(elemento);
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        int index = elementos.size() - 1;
        T elemento = elementos.remove(index);
        return elemento;
    }

    public T top() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return elementos.get(elementos.size() - 1);
    }
}

//Operações da pilha//
//create :  Limpa a pilha, removendo todos os elementos.//
//isEmpty : Verifica se a pilha está vazia//
//isFull : Verifica se a pilha está cheia com base na capacidade definida.//
//push : Insere um elemento no topo da pilha.//
//pop : Remove o elemento no topo da pilha e o retorna.//
//top : Retorna o elemento no topo da pilha sem removê-lo.//

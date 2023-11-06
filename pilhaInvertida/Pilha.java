package pilhaInvertida;

import java.util.EmptyStackException;
import java.util.Stack;

public class Pilha<T> {
    private Stack<T> elementos = new Stack<>();

    public void create() {
        elementos.clear();
    }

    public boolean isEmpty() {
        return elementos.isEmpty();
    }

    public boolean isFull() {
        return false;
    }

    public void push(T elemento) {
        elementos.push(elemento);
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();

        }
        return elementos.pop();
    }

    public T top() {
        if (isEmpty()) {
            throw new EmptyStackException();

        }
        return elementos.peek();
    }

    public void inverter() {
        Stack<T> pilhaInvertida = new Stack<>();
        
        while (!elementos.isEmpty()) {
            T elemento = elementos.pop();
            pilhaInvertida.push(elemento);
        }
        
        elementos = pilhaInvertida;
    }

    @Override
    public String toString() {
        return elementos.toString();
    }
}


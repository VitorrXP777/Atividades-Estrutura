package editorDeTexto;

import java.util.Stack;

public class EditorDeTexto {
    private Stack<Character> pilha = new Stack<>();

    public void digitar(char caractere) {
        pilha.push(caractere);
    }

    public void apagar() {
        if (!pilha.isEmpty()) {
            pilha.pop();
        }
    }

    public void apagarTudo() {
        pilha.clear();
    }

    public void backspace() {
        if (!pilha.isEmpty()) {
            pilha.pop();
        }
    }

    public String obterTexto() {
        StringBuilder texto = new StringBuilder();
        for (char caractere : pilha) {
            texto.append(caractere);
        }
        return texto.toString();
    }
}



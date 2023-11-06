package equacaoMatematica;

import java.util.Stack;

public class VerificadorParenteses {
    public static boolean verificaEquacao(String equacao) {
        Stack<Character> pilha = new Stack<>();
        int abertos = 0;
        int fechados = 0;

        for (char caractere : equacao.toCharArray()) {
            if (caractere == '(') {
                pilha.push(caractere);
                abertos++;
            } else if (caractere == ')') {
                fechados++;
                if (pilha.isEmpty() || pilha.pop() != '(') {
                    return false;
                }
            }
        }

        return pilha.isEmpty() && abertos == fechados;
    }
}


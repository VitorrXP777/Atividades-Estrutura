package notacaoPosfixa;
import java.util.Stack;

public class AvaliadorPosfixa {
    public static int avaliarPosfixa(String expressao) {
        Stack<Integer> pilha = new Stack<>();
        
        for (char c : expressao.toCharArray()) {
            if (Character.isDigit(c)) {
                pilha.push(Character.getNumericValue(c));
            } else {
                int operando2 = pilha.pop();
                int operando1 = pilha.pop();
                int resultado;
                switch (c) {
                    case '+':
                        resultado = operando1 + operando2;
                        break;
                    case '-':
                        resultado = operando1 - operando2;
                        break;
                    case '*':
                        resultado = operando1 * operando2;
                        break;
                    case '/':
                        resultado = operando1 / operando2;
                        break;
                    default:
                        throw new IllegalArgumentException("Operador inválido: " + c);
                }
                pilha.push(resultado);
            }
        }
        
        if (pilha.size() != 1) {
            throw new IllegalArgumentException("Expressão inválida");
        }
        
        return pilha.pop();
    }
}

package notacaoPosfixa;

public class main {
    public static void Main(String[] args) {
        String expressao = "23*5+"; // Exemplo de expressão posfixa
        int resultado = AvaliadorPosfixa.avaliarPosfixa(expressao);
        System.out.println("Resultado: " + resultado);
    }
}


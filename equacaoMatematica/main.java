package equacaoMatematica;

public class main {
    public static void Main(String[] args) {
        String equacao1 = "((x + y) - (a + b))"; // Exemplo de equação bem formada
        String equacao2 = "((x + y) - (a + b)"; // Exemplo de equação mal formada

        boolean resultado1 = VerificadorParenteses.verificaEquacao(equacao1);
        System.out.println("Resultado da equação 1: " + resultado1);

        boolean resultado2 = VerificadorParenteses.verificaEquacao(equacao2);
        System.out.println("Resultado da equação 2: " + resultado2);
    }
}


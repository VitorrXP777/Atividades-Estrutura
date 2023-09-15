package tiposDeDados;

public class Main {
    public static void main(String[] args) {
        // Criando pontos
        Ponto ponto1 = new Ponto(1.0, 2.0);
        Ponto ponto2 = new Ponto(3.0, 4.0);

        // Criando uma reta com os pontos
        Reta reta = new Reta(ponto1, ponto2);

        // Criando um polinômio de grau 2
        PolinomioGrau2 polinomio = new PolinomioGrau2(1.0, -2.0, 1.0);

        // Imprimindo informações
        System.out.println("Ponto 1: " + ponto1);
        System.out.println("Ponto 2: " + ponto2);
        System.out.println("Reta: " + reta);
        System.out.println("Polinômio: " + polinomio);

        // Calculando o valor do polinômio para x=2
        double x = 2.0;
        double valorPolinomio = polinomio.calcularValor(x);
        System.out.println("Valor do Polinômio para x=" + x + ": " + valorPolinomio);
    }
}

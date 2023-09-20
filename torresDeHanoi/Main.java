//Quando quiser alterar o número de discos que será usado na operação e só mexer no valor de N!

package torresDeHanoi;

public class Main {
    public static void torresDeHanoi(int n, TorreHanoi origem, TorreHanoi auxiliar, TorreHanoi destino) {
        if (n == 1) {
            Disco discoMovido = origem.desempilhar();
            destino.empilhar(discoMovido);
            System.out.println("Mova o disco " + discoMovido + " da torre " + origem + " para a torre " + destino);
        } else {
            torresDeHanoi(n - 1, origem, destino, auxiliar);
            Disco discoMovido = origem.desempilhar();
            destino.empilhar(discoMovido);
            System.out.println("Mova o disco " + discoMovido + " da torre " + origem + " para a torre " + destino);
            torresDeHanoi(n - 1, auxiliar, origem, destino);
        }
    }

    public static void main(String[] args) {
        int n = 3; // Número de discos

        TorreHanoi torreA = new TorreHanoi();
        TorreHanoi torreB = new TorreHanoi();
        TorreHanoi torreC = new TorreHanoi();

        // Empilhar os discos na torre de origem (torreA)
        for (int i = n; i >= 1; i--) {
            Disco disco = new Disco(i);
            torreA.empilhar(disco);
        }

        System.out.println("Estado inicial das Torres:");
        System.out.println("Torre A:");
        torreA.imprimirTorre();
        System.out.println("Torre B:");
        torreB.imprimirTorre();
        System.out.println("Torre C:");
        torreC.imprimirTorre();

        System.out.println("\nPassos para resolver as Torres de Hanoi:");
        torresDeHanoi(n, torreA, torreB, torreC);

        System.out.println("\nEstado final das Torres:");
        System.out.println("Torre A:");
        torreA.imprimirTorre();
        System.out.println("Torre B:");
        torreB.imprimirTorre();
        System.out.println("Torre C:");
        torreC.imprimirTorre();
    }
}

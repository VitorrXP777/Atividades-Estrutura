package pilhaInvertida;

public class main {
    public static void Main(String[] args) {
        Pilha<Integer> pilha = new Pilha<>();

        pilha.push(1);
        pilha.push(2);
        pilha.push(3);

        System.out.println("Pilha original: " + pilha);

        pilha.inverter();

        System.out.println("Pilha invertida: " + pilha);
    }
}


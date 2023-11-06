package verificacaoDePilhas;

import java.util.Stack;

public class Pilha<T> {
    private Stack<T> elementos = new Stack<>();

    // Outros métodos da classe...

    public boolean saoIguais(Pilha<T> outraPilha) {
        if (this.elementos.size() != outraPilha.elementos.size()) {
            return false;
        }

        for (int i = 0; i < this.elementos.size(); i++) {
            T elementoPilha1 = this.elementos.get(i);
            T elementoPilha2 = outraPilha.elementos.get(i);

            if (!elementoPilha1.equals(elementoPilha2)) {
                return false;
            }
        }

        return true;
    }
}

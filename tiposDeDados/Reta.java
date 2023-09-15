package tiposDeDados;

public class Reta {
    private Ponto ponto1;
    private Ponto ponto2;

    public Reta(Ponto ponto1, Ponto ponto2) {
        this.ponto1 = ponto1;
        this.ponto2 = ponto2;
    }

    public Ponto getPonto1() {
        return ponto1;
    }

    public Ponto getPonto2() {
        return ponto2;
    }

    @Override
    public String toString() {
        return "Reta de " + ponto1 + " para " + ponto2;
    }
}
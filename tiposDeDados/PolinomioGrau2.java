package tiposDeDados;

public class PolinomioGrau2 {
    private double a;
    private double b;
    private double c;

    public PolinomioGrau2(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double calcularValor(double x) {
        return (a * x * x) + (b * x) + c;
    }

    @Override
    public String toString() {
        return a + "x^2 + " + b + "x + " + c;
    }
}

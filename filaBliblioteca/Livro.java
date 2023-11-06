package filaBliblioteca;
import java.util.LinkedList;
import java.util.Queue;

public class Livro {
    private String nome;
    private boolean disponivel;
    private Queue<String> filaEspera;

    public Livro(String nome) {
        this.nome = nome;
        this.disponivel = true;
        this.filaEspera = new LinkedList<>();
    }

    public String getNome() {
        return nome;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public Queue<String> getFilaEspera() {
        return filaEspera;
    }
}

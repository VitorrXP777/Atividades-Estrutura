package agendaDeEndereco;

public class Contato {
    private String nome;
    private String telefone;
    private Endereco endereco;

    public Contato(String nome, String telefone, Endereco endereco) {
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\n" +
                "Telefone: " + telefone + "\n" +
                endereco.toString() + "\n";
    }
}
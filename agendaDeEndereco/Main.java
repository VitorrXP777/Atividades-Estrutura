package agendaDeEndereco;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Agenda minhaAgenda = new Agenda();

        Endereco endereco1 = new Endereco("Rua A", "Cidade A", "Estado A", "12345-678");
        Contato contato1 = new Contato("Vitor Ricardo", "123456789", endereco1);

        Endereco endereco2 = new Endereco("Rua B", "Cidade B", "Estado B", "98765-432");
        Contato contato2 = new Contato("Francisco Eric", "987654321", endereco2);

        minhaAgenda.adicionarContato(contato1);
        minhaAgenda.adicionarContato(contato2);

        minhaAgenda.listarContatos();
    }
}

class Agenda {
    private List<Contato> contatos;

    public Agenda() {
        contatos = new ArrayList<>();
    }

    public void adicionarContato(Contato contato) {
        contatos.add(contato);
    }

    public void listarContatos() {
        System.out.println("Lista de Contatos:");
        for (Contato contato : contatos) {
            System.out.println(contato.toString());
        }
    }
}
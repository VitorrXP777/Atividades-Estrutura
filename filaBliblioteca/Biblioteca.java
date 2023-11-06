package filaBliblioteca;
import java.util.HashMap;
import java.util.Map;

public class Biblioteca {
    private Map<String, Livro> acervo = new HashMap<>();

    public void cadastrarLivro(String nomeLivro) {
        Livro livro = new Livro(nomeLivro);
        acervo.put(nomeLivro, livro);
    }

    public void retirarLivro(String nomeLivro, String nomePessoa) {
        Livro livro = acervo.get(nomeLivro);

        if (livro == null) {
            System.out.println("Livro não encontrado na biblioteca.");
            return;
        }

        if (livro.isDisponivel()) {
            livro.setDisponivel(false);
            System.out.println(nomePessoa + " retirou o livro " + nomeLivro);
        } else {
            livro.getFilaEspera().offer(nomePessoa);
            System.out.println(nomePessoa + " entrou na fila de espera para o livro " + nomeLivro);
        }

        verificarFilaEspera(nomeLivro);
    }

    private void verificarFilaEspera(String nomeLivro) {
        Livro livro = acervo.get(nomeLivro);

        if (!livro.getFilaEspera().isEmpty() && livro.isDisponivel()) {
            String proximoInteressado = livro.getFilaEspera().poll();
            livro.setDisponivel(false);
            System.out.println(proximoInteressado + " retirou o livro " + nomeLivro);
        }
    }

    public void listarLivros() {
        System.out.println("Acervo da biblioteca:");
        for (Map.Entry<String, Livro> entry : acervo.entrySet()) {
            System.out.print("Livro: " + entry.getKey());
            if (entry.getValue().isDisponivel()) {
                System.out.println(" (Disponível)");
            } else {
                System.out.println(" (Indisponível)");
            }
        }
    }
}


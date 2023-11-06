package editorDeTexto;

public class main {
    public static void Main(String[] args) {
        EditorDeTexto editor = new EditorDeTexto();

        editor.digitar('H');
        editor.digitar('e');
        editor.digitar('l');
        editor.digitar('l');
        editor.digitar('o');
        System.out.println("Texto digitado: " + editor.obterTexto());

        editor.apagar();
        System.out.println("Após apagar: " + editor.obterTexto());

        editor.backspace();
        System.out.println("Após backspace: " + editor.obterTexto());

        editor.apagarTudo();
        System.out.println("Após apagar tudo: " + editor.obterTexto());
    }
}


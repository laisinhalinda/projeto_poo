import java.util.ArrayList;

public class Agenda {
     private ArrayList<Contato> contatos = new ArrayList<>();

    public void armazenarContato(Contato contato) {
        this.contatos.add(contato);
    }

    public void removerContato(Contato contato) {
        this.contatos.remove(contato);
    }

    public int encontrarContato(String nome) {
        for (int i = 0; i < contatos.size(); i++) {
            if (contatos.get(i).get_nome().equals(nome)) {  //get(i) pega o contato na posiçao i e get_nome() pega o nome do contato
                return i;
            }
        }
        return -1; // Retorna -1 se o contato não for encontrado
    }

    public void imprimirContatos() {
        for (Contato contato : contatos) { // para cada contato na lista de contatos
            contato.imprimeInformacoes();
            System.out.println("");
        }
        System.out.println("======FIM======");
    }

    public void imprimeContato(int posicao){
        this.contatos.get(posicao).imprimeInformacoes();
    }
}

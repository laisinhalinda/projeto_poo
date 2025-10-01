public class AtividadeAgenda {
    public static void main(String[] args) {
        //contatos instanciados 
        Contato contato1 = new Contato("Biruta", "birutinhadasilva@gmail.com", "123456789");
        Contato contato2 = new Contato("Xaulin", "xaulinmatadordeporco@gmail.com", "987654321");
        Contato contato3 = new Contato("Super-MAN","supermendingo@gmail.com","456789123");
        
        //agenda instanciada
        Agenda agenda = new Agenda();

        //armazenando contatos na agenda
        agenda.armazenarContato(contato1);
        agenda.armazenarContato(contato2);
        agenda.armazenarContato(contato3);
        
        //imprimindo contatos da agenda
        agenda.imprimirContatos();
        
        //removendo contato da agenda
        agenda.removerContato(contato1);
        
        //imprimindo contatos da agenda completa novamente
        agenda.imprimirContatos();

        //instanciando novo contato
        Contato contato4 = new Contato("Zezinho", "zezinhodapamonha@gmail.com", "321654987");

        //armazenando novo contato na agenda
        agenda.armazenarContato(contato4);

        //Encontrando contato pelo nome 
        agenda.encontrarContato("Zezinho");

        //imprimir as informações do contato na posição 1
        agenda.imprimeContato(1);

        //imprimindo a lista completa de contatos
        agenda.imprimirContatos();
    }
}

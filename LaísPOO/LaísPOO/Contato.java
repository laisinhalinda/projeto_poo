public class Contato {
    private String _nome, _email, _telefone;

    public Contato(String nome, String email, String telefone) {
        this._nome = nome;
        this._email = email;
        this._telefone = telefone;
    }

    public String get_nome() {
        return _nome;
    }

    public void set_nome(String _nome) {
        this._nome = _nome;
    }

    public String get_email() {
        return _email;
    }

    public void set_email(String _email) {
        this._email = _email;
    }

        public String get_telefone() {
        return _telefone;
    }

    public void set_telefone(String _telefone) {
        this._telefone = _telefone;
    }       

    public void imprimeInformacoes() {
        System.out.println("Nome: " + _nome);
        System.out.println("Email: " + _email);
        System.out.println("Telefone: " + _telefone);
    }

}
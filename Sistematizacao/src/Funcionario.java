
public class Funcionario {
    private String id;
    private String nome;
    private String alergias;
    private String condicaoMedica;
    private String telefone;
    private String email;
    private ContatoEmergencia contatoEmergencia;

    
    public Funcionario(String id, String nome, String alergias, String condicaoMedica, String telefone, String email, ContatoEmergencia contatoEmergencia) {
        this.id = id;
        this.nome = nome;
        this.alergias = alergias;
        this.condicaoMedica = condicaoMedica;
        this.telefone = telefone;
        this.email = email;
        this.contatoEmergencia = contatoEmergencia;
    }

    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public String getCondicaoMedica() {
        return condicaoMedica;
    }

    public void setCondicaoMedica(String condicaoMedica) {
        this.condicaoMedica = condicaoMedica;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ContatoEmergencia getContatoEmergencia() {
        return contatoEmergencia;
    }

    public void setContatoEmergencia(ContatoEmergencia contatoEmergencia) {
        this.contatoEmergencia = contatoEmergencia;
    }

    @Override
    public String toString() {
        return "ID: " + id + "\nNome: " + nome + "\nAlergias: " + alergias + "\nCondição Médica: " + condicaoMedica + 
               "\nTelefone: " + telefone + "\nEmail: " + email + "\nContato de Emergência: " + contatoEmergencia;
    }
}

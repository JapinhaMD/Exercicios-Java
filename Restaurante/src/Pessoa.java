public class Pessoa {
    private String nome;
    private String nomeMeio;
    private String sobrenome;

    public Pessoa(String nome, String nomeMeio, String sobrenome) {
        this.nome = nome;
        this.nomeMeio = nomeMeio;
        this.sobrenome = sobrenome;
    }

    // Getters e Setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getNomeMeio() { return nomeMeio; }
    public void setNomeMeio(String nomeMeio) { this.nomeMeio = nomeMeio; }

    public String getSobrenome() { return sobrenome; }
    public void setSobrenome(String sobrenome) { this.sobrenome = sobrenome; }

    // Método de regra de negócio
    public String getNomeCompleto() {
        return nome + " " + nomeMeio + " " + sobrenome;
    }
}
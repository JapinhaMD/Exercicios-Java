public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria; // Atributo interno
    private int vitorias;
    private int derrotas;
    private int empates;

    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso); // Ao usar o SET, ele já calcula a categoria automaticamente
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    // --- GETTERS E SETTERS ---

    public float getPeso() { return peso; }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria(); // Toda vez que mudar o peso, atualiza a categoria!
    }

    public String getCategoria() { return categoria; }

    // Mudamos para PRIVATE pois ninguém de fora define a categoria, o sistema calcula sozinho
    private void setCategoria() {
        if (this.peso < 52.2) {
            this.categoria = "Inválido (Muito leve)";
        } else if (this.peso <= 70.3) {
            this.categoria = "Pena";
        } else if (this.peso <= 83.9) {
            this.categoria = "Médio";
        } else if (this.peso <= 120.2) {
            this.categoria = "Pesado";
        } else {
            this.categoria = "Inválido (Muito pesado)";
        }
    }

    // Os demais métodos (nome, nacionalidade, etc) continuam iguais...
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getNacionalidade() { return nacionalidade; }
    public void setNacionalidade(String nacionalidade) { this.nacionalidade = nacionalidade; }
    public int getIdade() { return idade; }
    public void setIdade(int idade) { this.idade = idade; }
    public float getAltura() { return altura; }
    public void setAltura(float altura) { this.altura = altura; }
    public int getVitorias() { return vitorias; }
    public void setVitorias(int vitorias) { this.vitorias = vitorias; }
    public int getDerrotas() { return derrotas; }
    public void setDerrotas(int derrotas) { this.derrotas = derrotas; }
    public int getEmpates() { return empates; }
    public void setEmpates(int empates) { this.empates = empates; }

    public void apresentar() {
        System.out.println("------------------------------ ");
        System.out.println("LUTADOR: " + this.getNome());
        System.out.println("ORIGEM: " + this.getNacionalidade());
        System.out.println("IDADE: " + this.getIdade() + " anos");
        System.out.println("ALTURA: " + this.getAltura() + "m");
        System.out.println("PESO: " + this.getPeso() + "kg");
        System.out.println("CATEGORIA: " + this.getCategoria());
        System.out.println("VITÓRIAS: " + this.getVitorias());
        System.out.println("DERROTAS: " + this.getDerrotas());
        System.out.println("EMPATES: " + this.getEmpates());
        System.out.println("------------------------------ ");
    }

    public void ganharLuta() {
        this.setVitorias(this.getVitorias() + 1);
    }

    public void perderLuta() {
        this.setDerrotas(this.getDerrotas() + 1);
    }

    public void empatarLuta() {
        this.setEmpates(this.getEmpates() + 1);
    }
}
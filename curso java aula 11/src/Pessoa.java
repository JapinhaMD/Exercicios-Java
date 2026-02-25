// Classes abstratas são classes que não podem ser instanciadas, ou seja, não podem criar objetos diretamente
//Elas servem como base para outras classes, que podem herdar seus atributos e métodos.

public abstract class Pessoa {
    protected String nome;
    protected int idade;
    protected String sexo;

    public Pessoa (String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    public void fazerAniversario() {
        this.idade++;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void mostrarDados() {
        System.out.println("-----------------------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Sexo: " + this.sexo);
    }
}

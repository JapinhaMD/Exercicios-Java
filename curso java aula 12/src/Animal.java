public abstract class Animal {
    protected int peso;
    protected int idade;
    protected int membros;

    public Animal(int peso, int idade, int membros) {
        this.peso = peso;
        this.idade = idade;
        this.membros = membros;
    }

    public int getPeso() {
        return peso;
    }
    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMembros() {
        return membros;
    }

    public void setMembros(int membros) {
        this.membros = membros;
    }

   public void locomover() {
        System.out.println("Animal se locomovendo");
    }

    public void alimentar() {
        System.out.println("Animal se alimentando");
    }

    public void emitirSom() {
        System.out.println("Animal emitindo som");
    }



}

public class Reptil extends Animal {
    private String corEscama;

    public Reptil(int peso, int idade, int membros, String corEscama) {
        super(peso, idade, membros);
        this.corEscama = corEscama;
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    @Override
    public void locomover() {
        System.out.println("Réptil se locomovendo");
    }

    @Override
    public void alimentar() {
        System.out.println("Réptil se alimentando");
    }

    //@Override
    //public void emitirSom() {
    //    System.out.println("grrrr grrr grrr");
    //}

}

public class Mamifero extends Animal{
    private String corPelo;

    public Mamifero(int peso, int idade, int membros, String corPelo) {
        super(peso, idade, membros);
        this.corPelo = corPelo;
    }

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

    @Override
    public void locomover() {
        System.out.println("Mamífero se locomovendo");
    }

    @Override
    public void alimentar() {
        System.out.println("Mamífero se alimentando");
    }

    @Override
    public void emitirSom() {
        System.out.println("auuuu auuuu");
    }
}

public class Peixe extends  Animal{
    private String corEscama;

    public Peixe(int peso, int idade, int membros, String corEscama) {
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
        System.out.println("Peixe se locomovendo");
    }

    @Override
    public void alimentar() {
        System.out.println("Peixe se alimentando");
    }

    @Override
    public void emitirSom() {
        System.out.println("blu blu blu");
    }

    public void soltarBolha() {
        System.out.println("Peixe soltando bolha");
    }

}

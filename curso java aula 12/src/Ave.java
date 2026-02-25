public class Ave extends Animal{
    private String corPena;

    public Ave(int peso, int idade, int membros, String corPena) {
        super(peso, idade, membros);
        this.corPena = corPena;
    }

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }

    @Override
    public void locomover() {
        System.out.println("Ave se locomovendo");
    }

    @Override
    public void alimentar() {
        System.out.println("Ave se alimentando");
    }

    @Override
    public void emitirSom() {
        System.out.println("ihhh ihhh ihhhh");
    }

    public void fazerNinho() {
        System.out.println("Ave fazendo ninho");
    }



}

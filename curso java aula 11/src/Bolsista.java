public class Bolsista extends Aluno{
    private float bolsa;

    public Bolsista(String nome, int idade, String sexo, int matricula, String curso, float bolsa) {
        super(nome, idade, sexo, matricula, curso);
        this.bolsa = bolsa;
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }

    @Override
    public void pagarMensalidade(){
        System.out.println("Pagando mensalidade do bolsista " + this.getNome() + " com bolsa de " + this.bolsa);
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Bolsa: " + this.bolsa);
        //System.out.println("-----------------------------");
    }

}

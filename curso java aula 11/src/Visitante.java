public class Visitante extends Pessoa{
        public Visitante(String nome, int idade, String sexo) {
            super(nome, idade, sexo);
        }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
       // System.out.println("-----------------------------");
    }
}

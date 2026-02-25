public class Tecnico extends  Aluno{
    private String registroProfissional;

    public Tecnico(String nome, int idade, String sexo, int matricula, String curso, String registroProfissional) {
        super(nome, idade, sexo, matricula, curso);
        this.registroProfissional = registroProfissional;
    }

    public String getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(String registroProfissional) {
        this.registroProfissional = registroProfissional;
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Registro Profissional: " + this.registroProfissional);
        //System.out.println("-----------------------------");
    }


}

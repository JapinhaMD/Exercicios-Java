public class Aluno extends Pessoa{
    private int matricula;
    private String curso;

    public void pagarMensalidade(){
        System.out.println("Pagando mensalidade do aluno " + this.getNome());
    }

     public Aluno(String nome, int idade, String sexo, int matricula, String curso) {
         super(nome, idade, sexo);
         this.matricula = matricula;
         this.curso = curso;
     }

     public int getMatricula() {
         return matricula;
     }

     public void setMatricula(int matricula) {
         this.matricula = matricula;
     }

     public String getCurso() {
         return curso;
     }

     public void setCurso(String curso) {
         this.curso = curso;
     }

     @Override
        public void mostrarDados() {
            super.mostrarDados();
            System.out.println("Matricula: " + this.matricula);
            System.out.println("Curso: " + this.curso);
           // System.out.println("-----------------------------");
        }
}

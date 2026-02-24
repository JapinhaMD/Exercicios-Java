//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Joao", 25, "Masculino");
        p1.mostrarDados();

        Aluno a1 = new Aluno("Maria", 20, "Feminino", 1234, "Computacao");
        a1.mostrarDados();

        Funcionario f1 = new Funcionario("Pedro", 30, "Masculino", "Java", true);
        f1.mostrarDados();

        Professor prof1 = new Professor("Ana", 40, "Feminino", "Matematica", 5000.0f);
        prof1.mostrarDados();




    }
}
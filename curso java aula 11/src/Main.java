//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Visitante v1 = new Visitante("João", 22, "Masculino");
        v1.mostrarDados();

        Professor V2 = new Professor("Maria", 35, "Feminino", "Matemática", 5000.0f);
        V2.mostrarDados();

        Aluno V3 = new Aluno("Pedro", 18, "Masculino", 1234, "Computação");
        V3.mostrarDados();

        Bolsista V4 = new Bolsista("Ana", 20, "Feminino", 5678, "Engenharia", 1000.0f);
        V4.mostrarDados();

        Tecnico V5 = new Tecnico("Carlos", 28, "Masculino", 4321, "Administração", "Técnico em Informática");
        V5.mostrarDados();

    }
}
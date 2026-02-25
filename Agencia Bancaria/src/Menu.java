import java.util.Scanner;

public class Menu {
    private Scanner scanner = new Scanner(System.in);
    // Agora o Menu possui uma instância de Operacao para lidar com a lógica
    private Operacao operacao = new Operacao();

    public void exibirMenuPrincipal() {
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n========================================");
            System.out.println("       SISTEMA BANCÁRIO - JAPA         ");
            System.out.println("========================================");
            System.out.println(" 1. Abrir Conta");
            System.out.println(" 2. Deletar Conta");
            System.out.println(" 3. Transferir");
            System.out.println(" 4. Sacar");
            System.out.println(" 5. Depositar");
            System.out.println(" 6. Listar Contas");
            System.out.println(" 0. Sair");
            System.out.println("----------------------------------------");
            System.out.print("Escolha uma opção: ");

            try {
                opcao = Integer.parseInt(scanner.nextLine());
                // Delegamos a execução para a classe Operacao
                operacao.processarOpcao(opcao);
            } catch (NumberFormatException e) {
                System.out.println("\n[ERRO] Digite um número válido!");
            }
        }
    }
}
import java.util.List;
import java.util.Scanner;

public class GerenciadorContas {
    private List<Conta> contas;
    private Scanner scanner;

    public GerenciadorContas(List<Conta> contas, Scanner scanner) {
        this.contas = contas;
        this.scanner = scanner;
    }

    public void abrirConta() {
        System.out.println("\n--- Cadastro de Nova Conta ---");
        System.out.print("Agência: ");
        String agencia = scanner.nextLine();
        System.out.print("Número: ");
        String numero = scanner.nextLine();

        if (encontrarConta(numero) != null) {
            System.out.println("[ERRO] Número já existe!");
            return;
        }

        System.out.print("Titular: ");
        String titular = scanner.nextLine();
        contas.add(new Conta(agencia, numero, titular));
        System.out.println("[SUCESSO] Conta criada!");
    }

    public void deletarConta() {
        System.out.print("Número da conta para deletar: ");
        Conta conta = encontrarConta(scanner.nextLine());
        if (conta != null) {
            contas.remove(conta);
            System.out.println("[SUCESSO] Conta removida!");
        } else {
            System.out.println("[ERRO] Conta não encontrada.");
        }
    }

    private Conta encontrarConta(String numero) {
        for (Conta c : contas) {
            if (c.getNumero().equals(numero)) return c;
        }
        return null;
    }
}
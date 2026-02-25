import java.util.List;
import java.util.Scanner;

public class MovimentacaoContas {
    private List<Conta> contas;
    private Scanner scanner;

    public MovimentacaoContas(List<Conta> contas, Scanner scanner) {
        this.contas = contas;
        this.scanner = scanner;
    }

    public void realizarSaque() {
        Conta conta = solicitarConta("Número da conta para saque: ");
        if (conta != null) {
            System.out.print("Valor: R$ ");
            try {
                conta.sacar(Double.parseDouble(scanner.nextLine()));
            } catch (NumberFormatException e) { System.out.println("[ERRO] Valor inválido."); }
        }
    }

    public void realizarDeposito() {
        Conta conta = solicitarConta("Número da conta para depósito: ");
        if (conta != null) {
            System.out.print("Valor: R$ ");
            try {
                conta.depositar(Double.parseDouble(scanner.nextLine()));
            } catch (NumberFormatException e) { System.out.println("[ERRO] Valor inválido."); }
        }
    }

    public void realizarTransferencia() {
        System.out.println("--- Transferência ---");
        Conta origem = solicitarConta("Número da SUA conta: ");
        if (origem == null) return;
        Conta destino = solicitarConta("Número da conta de DESTINO: ");
        if (destino == null) return;

        System.out.print("Valor: R$ ");
        try {
            double valor = Double.parseDouble(scanner.nextLine());
            if (origem.sacar(valor)) destino.depositar(valor);
        } catch (NumberFormatException e) { System.out.println("[ERRO] Valor inválido."); }
    }

    private Conta solicitarConta(String msg) {
        System.out.print(msg);
        String num = scanner.nextLine();
        for (Conta c : contas) { if (c.getNumero().equals(num)) return c; }
        System.out.println("[ERRO] Conta não encontrada.");
        return null;
    }
}
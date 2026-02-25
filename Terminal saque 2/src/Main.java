import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        boolean continuar = true;

        while (continuar) {
            Menu.exibirBoasVindas();

            try {
                BigDecimal valorSaque = scanner.nextBigDecimal();

                // Critério de parada
                if (valorSaque.compareTo(BigDecimal.ZERO) == 0) {
                    continuar = false;
                    Menu.exibirFinalizacao();
                    continue;
                }

                if (valorSaque.compareTo(BigDecimal.ZERO) < 0) {
                    System.out.println(" Erro: O valor deve ser positivo.");
                    continue;
                }

                Dinheiro caixa = new Dinheiro(valorSaque);
                caixa.calcularDistribuicaoComEstoque();

            } catch (Exception e) {
                Menu.exibirValorInvalido();
                scanner.nextLine(); // Limpa o buffer do scanner
            }
        }
        scanner.close();
    }
}
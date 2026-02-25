import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        Menu.exibirBoasVindas();

        try {
            BigDecimal valorSaque = scanner.nextBigDecimal();

            Menu.exibirResultado(valorSaque.doubleValue());

            Dinheiro dinheiro = new Dinheiro(valorSaque);
            dinheiro.calcularDistribuicao();

            Menu.exibirDespedida();

        } catch (Exception e) {
            Menu.exibirErroValorInvalido();
        } finally {
            scanner.close();
        }
    }
}
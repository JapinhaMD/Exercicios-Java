import java.math.BigDecimal;

public class Dinheiro {
    private BigDecimal valor;

    // Notas e moedas disponíveis
    private static final BigDecimal[] notas = {
            new BigDecimal("200.00"), new BigDecimal("100.00"), new BigDecimal("50.00"),
            new BigDecimal("20.00"), new BigDecimal("10.00"), new BigDecimal("5.00"),
            new BigDecimal("2.00"), new BigDecimal("1.00"), new BigDecimal("0.50"),
            new BigDecimal("0.25"), new BigDecimal("0.10"), new BigDecimal("0.05"),
            new BigDecimal("0.01")
    };

    public Dinheiro(BigDecimal valor) {
        this.valor = valor;
    }

    public void calcularDistribuicao() {
        BigDecimal restante = this.valor;

        System.out.println("Distribuição para o valor: R$ " + this.valor);

        for (BigDecimal total : notas) {
            // Divide o valor pela nota e pega apenas a parte inteira
            BigDecimal[] resultadoEDivisa = restante.divideAndRemainder(total);
            int quantidade = resultadoEDivisa[0].intValue();
            restante = resultadoEDivisa[1];

            if (quantidade > 0) {
                String tipo = total.compareTo(BigDecimal.ONE) >= 0 ? "nota(s)" : "moeda(s)";
                System.out.printf("%d %s de R$ %.2f%n", quantidade, tipo, total);
            }
        }
    }
}

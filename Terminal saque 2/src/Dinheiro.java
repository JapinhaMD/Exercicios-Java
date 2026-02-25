import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.Map;

public class Dinheiro {
    private BigDecimal valorSaque;

    //  Variável para acumular o total de todos os saques realizados
    private static BigDecimal totalSacadoAcumulado = BigDecimal.ZERO;

    private static final Map<BigDecimal, Integer> estoqueCofre = new LinkedHashMap<>();

    static {
        estoqueCofre.put(new BigDecimal("200.00"), 2);
        estoqueCofre.put(new BigDecimal("100.00"), 2);
        estoqueCofre.put(new BigDecimal("50.00"), 4);
        estoqueCofre.put(new BigDecimal("20.00"), 4);
        estoqueCofre.put(new BigDecimal("10.00"), 4);
        estoqueCofre.put(new BigDecimal("5.00"), 10);
        estoqueCofre.put(new BigDecimal("2.00"), 10);
        estoqueCofre.put(new BigDecimal("1.00"), 10);
        estoqueCofre.put(new BigDecimal("0.50"), 50);
        estoqueCofre.put(new BigDecimal("0.25"), 50);
        estoqueCofre.put(new BigDecimal("0.10"), 50);
        estoqueCofre.put(new BigDecimal("0.05"), 50);
        estoqueCofre.put(new BigDecimal("0.01"), 50);
    }

    public Dinheiro(BigDecimal valor) {
        this.valorSaque = valor;
    }

    public void calcularDistribuicaoComEstoque() {
        BigDecimal restante = this.valorSaque;
        Map<BigDecimal, Integer> saqueRealizado = new LinkedHashMap<>();

        for (Map.Entry<BigDecimal, Integer> entrada : estoqueCofre.entrySet()) {
            BigDecimal valorEspecie = entrada.getKey();
            int quantidadeDisponivel = entrada.getValue();

            int necessarias = restante.divideToIntegralValue(valorEspecie).intValue();
            int aEntregar = Math.min(necessarias, quantidadeDisponivel);

            if (aEntregar > 0) {
                saqueRealizado.put(valorEspecie, aEntregar);
                restante = restante.subtract(valorEspecie.multiply(new BigDecimal(aEntregar)));
            }
        }

        if (restante.compareTo(BigDecimal.ZERO) > 0) {
            System.out.println("\n Não há notas/moedas suficientes para este valor.");
            System.out.println("Faltou entregar: R$ " + restante);
        } else {
            confirmarSaqueEAtualizarEstoque(saqueRealizado);
        }
    }

    private void confirmarSaqueEAtualizarEstoque(Map<BigDecimal, Integer> saqueRealizado) {
        System.out.println("\n SAQUE EFETUADO COM SUCESSO:");

        // Variável local para somar o valor DESTE saque específico
        BigDecimal valorDesteSaque = BigDecimal.ZERO;

        for (Map.Entry<BigDecimal, Integer> entry : saqueRealizado.entrySet()) {
            BigDecimal especie = entry.getKey();
            Integer qtd = entry.getValue();

            // Atualiza o estoque
            estoqueCofre.put(especie, estoqueCofre.get(especie) - qtd);

            // Soma ao valor total DESTE saque (especie * qtd)
            valorDesteSaque = valorDesteSaque.add(especie.multiply(new BigDecimal(qtd)));

            String rotulo = especie.compareTo(BigDecimal.valueOf(2)) >= 0 ? "cédula(s)" : "moeda(s)";
            System.out.printf("- %d %s de R$ %.2f%n", qtd, rotulo, especie);
        }

        totalSacadoAcumulado = totalSacadoAcumulado.add(valorDesteSaque);

        System.out.println("-----------------------------------");
        System.out.printf("VALOR DESTE SAQUE: R$ %.2f%n", valorDesteSaque);
        System.out.printf("TOTAL SAQUE (HISTÓRICO): R$ %.2f%n", totalSacadoAcumulado);
    }
}
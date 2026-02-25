import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.Map;

public class Dinheiro {
    private BigDecimal valorSaque;

    // Valor e quantidade de cada nota/moeda
    private static final Map<BigDecimal, Integer> estoqueCofre = new LinkedHashMap<>();

    static {
        estoqueCofre.put(new BigDecimal("200.00"), 2); //400
        estoqueCofre.put(new BigDecimal("100.00"), 2); //200
        estoqueCofre.put(new BigDecimal("50.00"), 4);  //200
        estoqueCofre.put(new BigDecimal("20.00"), 4);  //80
        estoqueCofre.put(new BigDecimal("10.00"), 4);  //40
        estoqueCofre.put(new BigDecimal("5.00"), 10);  //50
        estoqueCofre.put(new BigDecimal("2.00"), 10);  //20
        estoqueCofre.put(new BigDecimal("1.00"), 10);  //10
        estoqueCofre.put(new BigDecimal("0.50"), 50);  //25
        estoqueCofre.put(new BigDecimal("0.25"), 50);  //12.50
        estoqueCofre.put(new BigDecimal("0.10"), 50);  //5
        estoqueCofre.put(new BigDecimal("0.05"), 50);  //2.50
        estoqueCofre.put(new BigDecimal("0.01"), 50);  //0.50
        //TOTAL = 1045,5
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

            // Calcula quantas notas/moedas desse valor cabem no restante
            int necessarias = restante.divideToIntegralValue(valorEspecie).intValue();

            // Pega o que for menor: o que eu preciso ou o que eu tenho no estoque OBS: O Math min n dxa pegar mais doq tem disponivel
            int aEntregar = Math.min(necessarias, quantidadeDisponivel);

            if (aEntregar > 0) {
                saqueRealizado.put(valorEspecie, aEntregar);
                restante = restante.subtract(valorEspecie.multiply(new BigDecimal(aEntregar)));
            }
        }

        // Validação
        if (restante.compareTo(BigDecimal.ZERO) > 0) {
            System.out.println("\n Não tem notas/moedas suficientes para este valor.");
            System.out.println("Saldo faltante que o caixa não conseguiu suprir: R$ " + restante);
        } else {
            confirmarSaqueEAtualizarEstoque(saqueRealizado);
        }
    }

    private void confirmarSaqueEAtualizarEstoque(Map<BigDecimal, Integer> saqueRealizado) {
        System.out.println("\n✅ SAQUE EFETUADO COM SUCESSO:");

        saqueRealizado.forEach((especie, qtd) -> {
            // Atualiza o estoque global subtraindo o que saiu
            estoqueCofre.put(especie, estoqueCofre.get(especie) - qtd);


            // Define o rótulo correto para notas ou moedas
            String rotulo = especie.compareTo(BigDecimal.valueOf(2)) >= 0 ? "cédula(s)" : "moeda(s)";
            System.out.printf("- %d %s de R$ %.2f%n", qtd, rotulo, especie);
        });
    }
}
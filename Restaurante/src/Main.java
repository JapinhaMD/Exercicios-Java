import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in).useLocale(Locale.US);
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        List<Comida> listaDePedidos = new ArrayList<>();

        System.out.println("--- Cadastro de Cliente ---");
        System.out.print("Primeiro nome teste: ");
        String nome = leitor.nextLine();
        System.out.print("Nome do meio: ");
        String nomeMeio = leitor.nextLine();
        System.out.print("Sobrenome: ");
        String sobrenome = leitor.nextLine();

        Pessoa pessoa = new Pessoa(nome, nomeMeio, sobrenome);

        String continuar = "s";
        while (continuar.equalsIgnoreCase("s")) {
            System.out.println("\n--- Adicionar Item ao Pedido ---");
            System.out.print("O que você deseja comer? ");
            String nomeComida = leitor.nextLine();

            System.out.print("Qual o preço unitário? ");
            BigDecimal preco = leitor.nextBigDecimal();

            System.out.print("Quantas unidades? ");
            Integer qtd = leitor.nextInt();
            leitor.nextLine(); // Limpa o buffer

            listaDePedidos.add(new Comida(nomeComida, preco, qtd));

            System.out.print("Deseja adicionar mais algum item? (s/n): ");
            continuar = leitor.nextLine();
        }

        System.out.println("\n===============================");
        System.out.println("RESUMO FINAL DO PEDIDO");
        System.out.println("Cliente: " + pessoa.getNomeCompleto());
        System.out.println("-------------------------------");

        BigDecimal valorTotalGeral = BigDecimal.ZERO;

        for (Comida item : listaDePedidos) {
            // Usando GETTERS aqui:
            BigDecimal totalItem = item.getValor().multiply(new BigDecimal(item.getQuantidade()));
            valorTotalGeral = valorTotalGeral.add(totalItem);

            System.out.printf("- %s (%d un.): %s\n",
                    item.getNome(), item.getQuantidade(), nf.format(totalItem));
        }

        System.out.println("-------------------------------");
        System.out.println("VALOR TOTAL DA COMPRA: " + nf.format(valorTotalGeral));
        System.out.println("===============================");

        leitor.close();
    }
}
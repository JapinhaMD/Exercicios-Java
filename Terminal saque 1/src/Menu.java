public class Menu {

    // Constantes de formatação
    private static final String linha = "------------------------------------------";
    private static final String logo = "     TERMINAL DE SAQUE     ";

    public static void exibirBoasVindas() {
        System.out.println(linha);
        System.out.println(logo);
        System.out.println(linha);
        System.out.print("Digite o valor para saque: R$ ");
    }

    public static void exibirResultado(double valor) {
        System.out.println("\n" + linha);
        System.out.printf("Processando saque de: R$ %.2f%n", valor);
        System.out.println("Notas e moedas liberadas:");
        System.out.println(linha);
    }

    public static void exibirErroValorInvalido() {
        System.out.println("\n❌ ERRO: Por favor, insira um valor numérico válido (use ponto para decimais).");
    }

    public static void exibirDespedida() {
        System.out.println(linha);
        System.out.println("Saque finalizado com sucesso");
        System.out.println("Obrigado por utilizar o banco do JAPA");
    }
}
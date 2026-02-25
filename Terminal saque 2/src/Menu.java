public class Menu {
    private static final String linha = "==========================================";

    public static void exibirBoasVindas() {
        System.out.println("\n" + linha);
        System.out.println("          TERMINAL DE SAQUE          ");
        System.out.println(linha);
        System.out.print("Digite o valor do saque: (0 PARA SAIR) ");
    }

    public static void exibirErroEstoque() {
        System.out.println("Infelizmente não temos cédulas disponíveis para este valor exato");
        System.out.println("Tente um valor menor ou múltiplo das notas comuns");
    }

    public static void exibirValorInvalido() {
        System.out.println("\n ERRO: Valor inválido! Use apenas números e '.' para centavos");
    }

    public static void exibirFinalizacao() {
        System.out.println("\nEncerrando sistema... Obrigado!");
        System.out.println(linha);
    }

    public static void erroNegativo() {
        System.out.println(" Erro: O valor deve ser positivo.");

    }
}
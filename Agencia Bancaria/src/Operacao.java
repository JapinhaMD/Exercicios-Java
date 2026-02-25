import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Operacao {
    private List<Conta> contas = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);
    private GerenciadorContas gerenciador = new GerenciadorContas(contas, scanner);
    private MovimentacaoContas movimentacao = new MovimentacaoContas(contas, scanner);

    public void processarOpcao(int escolha) {
        // Transforma o número digitado no Enum correspondente
        Opcao opcao = Opcao.deInt(escolha);

        switch (opcao) {
            case ABRIR_CONTA -> gerenciador.abrirConta();
            case DELETAR_CONTA -> gerenciador.deletarConta();
            case TRANSFERIR -> movimentacao.realizarTransferencia();
            case SACAR -> movimentacao.realizarSaque();
            case DEPOSITAR -> movimentacao.realizarDeposito();
            case LISTAR -> listarContas();
            case SAIR -> System.out.println("Encerrando sistema... Até logo!");
            case INVALIDA -> System.out.println("[ERRO] Opção inválida!");
        }
    }
    private void listarContas() {
        if (contas.isEmpty()) System.out.println("Lista vazia.");
        else contas.forEach(System.out::println);
    }
}
public enum Opcao{
    SAIR(0),
    ABRIR_CONTA(1),
    DELETAR_CONTA(2),
    TRANSFERIR(3),
    SACAR(4),
    DEPOSITAR(5),
    LISTAR(6),
    INVALIDA(-1);

    private final int valor;

    Opcao(int valor) {
        this.valor = valor;
    }

    public static Opcao deInt(int i) {
        for (Opcao opcao : values()) {
            if (opcao.valor == i) return opcao;
        }
        return INVALIDA;
    }
}
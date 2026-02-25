public enum StatusConta {
    ATIVA(1),
    BLOQUEADA(2),
    ENCERRADA(3);

    private final int codigo;

    StatusConta(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }


}


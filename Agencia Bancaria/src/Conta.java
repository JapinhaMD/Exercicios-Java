public class Conta {
    private String agencia;
    private String numero;
    private String titular;
    private double saldo;
    private StatusConta status;

    public Conta(String agencia, String numero, String titular) {
        this.agencia = agencia;
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0.0;
        this.status = StatusConta.ATIVA;
    }

    public String getNumero() { return numero; }
    public double getSaldo() { return saldo; }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            if (this.status == StatusConta.BLOQUEADA && this.saldo > 0) {
                this.status = StatusConta.ATIVA;
            }
            System.out.println("[SUCESSO] R$ " + valor + " depositados. Saldo: R$ " + this.saldo);
        } else {
            System.out.println("[ERRO] Valor deve ser maior que zero.");
        }
    }

    public boolean sacar(double valor) {
        if (this.status == StatusConta.BLOQUEADA) {
            System.out.println("[ERRO] Conta BLOQUEADA.");
            return false;
        }
        if (valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
            if (this.saldo == 0) this.status = StatusConta.BLOQUEADA;
            System.out.println("[SUCESSO] Saque realizado. Saldo: R$ " + this.saldo);
            return true;
        }
        System.out.println("[ERRO] Saldo insuficiente.");
        return false;
    }

    @Override
    public String toString() {
        return "Conta: " + numero + " | Titular: " + titular + " | Saldo: R$ " + saldo + " | Status: " + status;
    }
}
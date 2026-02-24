public class Conta {
    private Integer numConta;
    private String tipo;
    private String dono;
    private Float saldo;
    private Boolean status;

    public Conta(Integer numConta, String tipo, String dono, Boolean status) {
        this.numConta = numConta;
        this.tipo = tipo;
        this.dono = dono;
        this.status = status;
    }

    public Integer getNumConta() { return numConta; }
    public void setNumConta(Integer numConta) { this.numConta = numConta; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public String getDono() { return dono; }
    public void setDono(String dono) { this.dono = dono; }

    public Float getSaldo() { return saldo; }
    public void setSaldo(Float saldo) { this.saldo = saldo; }

    public Boolean getStatus() { return status; }
    public void setStatus(Boolean status) { this.status = status; }

    public void criarConta(String t) {
        this.setTipo(t);
        this.setStatus(true);
        if (t.equals("corrente")) {
            this.setSaldo(0f);
        } else if (t.equals("poupanca")) {
            this.setSaldo(0f);
        }
    }

    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("Conta com dinheiro");
        } else if (this.getSaldo() < 0) {
            System.out.println("Conta em débito");
        } else {
            this.setStatus(false);
        }
    }

    public void depositar(Float v) {
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() + v);
        } else {
            System.out.println("Conta não está aberta");
        }
    }

    public void sacar(Float v) {
        if (this.getStatus()) {
            if (this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
            } else {
                System.out.println("Saldo insuficiente");
            }
        } else {
            System.out.println("Conta não está aberta");
        }
    }

    public void pagarMensal() {
        Float v = 0f;
        if (this.getTipo().equals("corrente")) {
            v = 20f;
        } else if (this.getTipo().equals("poupanca")) {
            v = 50f;
        }

        if (this.getStatus()) {
            if (this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
            } else {
                System.out.println("Saldo insuficiente para pagar a mensalidade");
            }
        } else {
            System.out.println("Conta não está aberta");
        }
    }

    public void infos() {
        System.out.println("------------------------------ ");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + (this.getStatus() ? "Aberta" : "Fechada"));
        System.out.println("------------------------------ ");
    }

}

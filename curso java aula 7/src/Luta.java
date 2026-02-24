public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    public Luta (Lutador desafiado,Lutador desafiante,int rounds,boolean aprovada){
        this.desafiado = desafiado;
        this.desafiante = desafiante;
        this.rounds = rounds;
        this.aprovada = aprovada;
    }

    public void marcarLuta(Lutador l1, Lutador l2) {
        if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        } else {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }

        public void lutar() {
            if (this.aprovada) {
                System.out.println("### DESAFIADO ###");
                this.desafiado.apresentar();
                System.out.println("### DESAFIANTE ###");
                this.desafiante.apresentar();

                int vencedor = (int) (Math.random() * 3); // 0, 1 ou 2
                switch (vencedor) {
                    case 0: // Empate
                        System.out.println("Empate!");
                        this.desafiado.empatarLuta();
                        this.desafiante.empatarLuta();
                        break;
                    case 1: // Desafiado vence
                        System.out.println("Vitória do " + this.desafiado.getNome());
                        this.desafiado.ganharLuta();
                        this.desafiante.perderLuta();
                        break;
                    case 2: // Desafiante vence
                        System.out.println("Vitória do " + this.desafiante.getNome());
                        this.desafiado.perderLuta();
                        this.desafiante.ganharLuta();
                        break;
                }
            } else {
                System.out.println("A luta não pode acontecer.");
            }
        }
}

public abstract class Lobo {
    protected String nome;
    protected String raca;


    public Lobo(String nome, String raca) {
        this.nome = nome;
        this.raca = raca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public void reagir(String frase) {
        if (frase.equals("Olá")) {
            System.out.println("Auuu auuuu");
        } else if (frase.equals("Vai apanhar")) {
            System.out.println("Rosnar");
        } else {
            System.out.println("Ignorar");
        }
    }

        public void reagir(int hora) {
            if (hora < 12) {
                System.out.println("Abanar o rabo");
            } else if (hora >= 18) {
                System.out.println("Rosnar");
            } else {
                System.out.println("Ignorar");
            }
        }

        public void reagir(Boolean dono) {
            if (dono == true) {
                System.out.println("Abanar o rabo");
            } else {
                System.out.println("Rosnar");
            }

        }
}

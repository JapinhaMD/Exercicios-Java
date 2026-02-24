public class ControleRemoto {
        private int volume;
        private boolean ligado;
        private boolean tocando;

        public ControleRemoto() {
            this.volume = 50;
            this.ligado = false;
            this.tocando = false;
        }

        public void ligar() {
            this.ligado = true;
        }

        public void desligar() {
            this.ligado = false;
        }

        public void abrirMenu() {
            System.out.println("----- MENU -----");
            System.out.println("Ligado: " + (this.ligado ? "Sim" : "Não"));
            System.out.println("Tocando: " + (this.tocando ? "Sim" : "Não"));
            System.out.print("Volume: " + volume);
            System.out.println();
        }

        public void fecharMenu() {
            System.out.println("Fechando menu...");
        }

        public void maisVolume(int volume) {
            if (this.ligado) {
                this.volume += volume;
                if (this.volume > 100) {
                    this.volume = 100;
                }
            }
        }

        public void menosVolume() {
            if (this.ligado) {
                this.volume -= 5;
                if (this.volume < 0) {
                    this.volume = 0;
                }
            }
        }

        public void ligarMudo() {
            if (this.ligado && this.volume > 0) {
                this.volume = 0;
            }
        }

        public void desligarMudo() {
            if (this.ligado && this.volume == 0) {
                this.volume = 50; // Voltar para um volume padrão
            }
        }

        public void play() {
            if (this.ligado && !this.tocando) {
                this.tocando = true;
            }
        }

        public void pause() {
            if (this.ligado && this.tocando) {
                this.tocando = false;
            }
        }

        public int getVolume() {return this.volume;}
        public void setVolume (int volume) {this.volume = volume;}
}

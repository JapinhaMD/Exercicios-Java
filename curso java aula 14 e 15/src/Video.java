public class Video {
    private String titulo;
    private String avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;

    public Video(String titulo) {
        this.titulo = titulo;
        this.avaliacao = "Sem avaliação";
        this.views = 0;
        this.curtidas = 0;
        this.reproduzindo = false;
    }


    public void play() {
        if (!reproduzindo) {
            reproduzindo = true;
            System.out.println("Reproduzindo: " + titulo);
        } else {
            System.out.println("O vídeo já está sendo reproduzido.");
        }
    }

    public void pause() {
        if (reproduzindo) {
            reproduzindo = false;
            System.out.println("Vídeo pausado: " + titulo);
        } else {
            System.out.println("O vídeo já está pausado.");
        }
    }

    public void like() {
        curtidas++;
        System.out.println("Você curtiu: " + titulo);
    }

        public void avaliar(String novaAvaliacao) {
            this.avaliacao = novaAvaliacao;
            System.out.println("Avaliação atualizada para: " + novaAvaliacao);
        }

public String getTitulo() {
    return titulo;
}

public String setTitulo(String titulo) {
    this.titulo = titulo;
    return titulo;
}


public String getAvaliacao() {
    return avaliacao;
}

public String setAvaliacao(String avaliacao) {
    this.avaliacao = avaliacao;
    return avaliacao;
}

public int getViews() {
    return views;
}

public int setViews(int views) {
    this.views = views;
    return views;
}

public int getCurtidas() {
    return curtidas;
}

public int setCurtidas(int curtidas) {
    this.curtidas = curtidas;
    return curtidas;
}



}

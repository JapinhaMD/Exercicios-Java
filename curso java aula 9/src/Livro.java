public class Livro implements Publicacao {
    @Override
    public void abrir() {
        this.aberto = true;
    }

    @Override
    public void fechar() {
        this.aberto = false;
    }

    @Override
    public void folhear(int p) {
        this.paginaAtual = p;
    }

    @Override
    public void avancarPag() {
        this.paginaAtual++;
    }

    @Override
    public void voltarPag() {
        this.paginaAtual--;
    }

    private String titulo;
    private String autor;
    private int totalPaginas;
    private int paginaAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String titulo, String autor, int totalPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totalPaginas = totalPaginas;
        this.leitor = leitor;
        this.aberto = false;
        this.paginaAtual = 0;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotalPaginas() {
        return totalPaginas;
    }
    public void setTotalPaginas(int totalPaginas) {
        this.totalPaginas = totalPaginas;
    }

    public int getPaginaAtual() {
        return paginaAtual;
    }
    public void setPaginaAtual(int paginaAtual) {
        this.paginaAtual = paginaAtual;
    }

    public boolean isAberto() {
        return this.aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }
    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    public void detalhes() {
        System.out.println("----------------------------------");
        System.out.println("Livro: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Total de páginas: " + this.totalPaginas);
        System.out.println("Página atual: " + this.paginaAtual);
        System.out.println("Aberto: " + (this.aberto ? "Sim" : "Não"));
        System.out.println("Leitor: " + this.leitor.getNome());
    }
}

public class Main {
    public static void main(String[] args) {

        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa("Joao", 25, "M");
        p[1] = new Pessoa("Maria", 30, "F");

        // Agora passando os objetos Pessoa corretamente para os Livros
        l[0] = new Livro("Procurando Nemo", "Joao Victor", 300, p[0]);
        l[1] = new Livro("Peixonauta", "Maria Clara", 250, p[1]);
        l[2] = new Livro("Chapeuzinho Vermelho", "Pedro Lucas", 200, p[0]);

        l[0].abrir();
        l[0].folhear(50);

        // Chamada direta, pois o método detalhes() já tem System.out.println
        l[0].detalhes();
        l[1].detalhes();
        l[2].detalhes();
    }
}
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // O Locale.US garante que o Scanner aceite o ponto (.) em vez de vírgula para floats
        Scanner leitor = new Scanner(System.in).useLocale(Locale.US);

        boolean continuar = true;
        int contador = 0;

        List<Lutador> listaDeLutador = new ArrayList<>();

        while (continuar) {
            contador++;

            System.out.println("\n--- CADASTRAR LUTADOR " + contador + " ---");

            System.out.print("NOME: ");
            String nome1 = leitor.nextLine();

            System.out.print("NACIONALIDADE: ");
            String pais1 = leitor.nextLine();

            System.out.print("IDADE: ");
            int idade1 = leitor.nextInt();

            System.out.print("ALTURA: ");
            float altura1 = leitor.nextFloat();

            System.out.print("PESO: ");
            float peso1 = leitor.nextFloat();

            System.out.print("VITORIAS: ");
            int vitoria1 = leitor.nextInt();

            System.out.print("DERROTAS: ");
            int derrota1 = leitor.nextInt();

            System.out.print("EMPATES: ");
            int empate1 = leitor.nextInt();

            // AJUSTE AQUI: Não precisamos mais do método getCategoria na Main.
            // O objeto Lutador já calcula a categoria internamente quando recebe o peso!
            Lutador lutador = new Lutador(nome1, pais1, idade1, altura1, peso1, vitoria1, derrota1, empate1);

            listaDeLutador.add(lutador);

            System.out.println("-----------------------------------------");
            System.out.print("Deseja continuar cadastrando? (1-Sim / 2-Nao): ");
            int resposta = leitor.nextInt();

            // Limpeza de buffer obrigatória após nextInt() antes do próximo nextLine()
            leitor.nextLine();

            if (resposta == 2) {
                continuar = false;
            }
        }

        System.out.println("\n======= LISTA DE LUTADORES CADASTRADOS =======");

        // Percorre a lista e chama o método apresentar de cada lutador
        for (Lutador l : listaDeLutador) {
            l.apresentar();
        }


        boolean aprovada = true;

        Lutador l1 = listaDeLutador.get(0);
        Lutador l2 = listaDeLutador.get(1);

        if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
            System.out.println("Luta aprovada!");
            aprovada = true;
        } else {
            System.out.println("Luta não aprovada.");
            aprovada = false;
        }

        Luta luta = new Luta(l1, l2,5, aprovada);
        luta.lutar();



        System.out.println("\n======= STATUS APOS LUTA =======");

        // Percorre a lista e chama o método apresentar de cada lutador
        for (Lutador l : listaDeLutador) {
            l.apresentar();
        }

        System.out.println("Encerrando o programa...");
        leitor.close();
    }
}
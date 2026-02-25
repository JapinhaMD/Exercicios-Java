//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Mamifero dog = new Mamifero(10, 5, 4, "Marrom");
        dog.locomover();
        dog.alimentar();
        dog.emitirSom();
        System.out.println("------------------------------");

        Ave gaviota = new Ave(2, 3, 2, "Branca");
        gaviota.locomover();
        gaviota.alimentar();
        gaviota.emitirSom();
        System.out.println("------------------------------");

        Peixe tilapia = new Peixe(1, 1, 0, "Prata");
        tilapia.locomover();
        tilapia.alimentar();
        tilapia.emitirSom();
        System.out.println("------------------------------");

        Reptil dinossauro = new Reptil(1000, 100, 4, "Verde");
        dinossauro.locomover();
        dinossauro.alimentar();
        dinossauro.emitirSom();
        System.out.println("------------------------------");

    }
}
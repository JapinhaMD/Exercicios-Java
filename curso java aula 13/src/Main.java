public class Main {
    public static void main(String[] args) {

        Cachorro dog = new Cachorro("Rex", "Labrador");
        dog.reagir(false);
        dog.reagir(8);
        dog.reagir("Olá");

        // Foi utilizado o mesmo método reagir, porem com assinaturas diferentes, ou seja, com tipos de parâmetros diferentes
        // Isso é um exemplo de polimorfismo, onde o mesmo método pode se comportar de maneiras diferentes dependendo dos parâmetros passados

    }
}
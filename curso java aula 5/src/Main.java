
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in).useLocale(Locale.US);
        NumberFormat nf = NumberFormat.getCurrencyInstance();

        System.out.println("--- Informe o seu nome ---");
        String nome1 = leitor.nextLine();

        System.out.println("--- Informe o numero da conta ---");
        Integer num1 = leitor.nextInt();
        leitor.nextLine(); // Limpa o buffer

        System.out.println("--- Informe o tipo da conta ---");
        String tipo1 = leitor.nextLine();

        System.out.println("--- Quanto deseja depositar? ---");
        Float deposito1 = leitor.nextFloat();


        Conta c1 = new Conta(num1, tipo1, nome1, true);
        c1.criarConta(tipo1);
        c1.depositar(deposito1);
        c1.pagarMensal();
        c1.infos();

        /*Conta c1 = new Conta(1234, "corrente", "Joao",true );
        c1.criarConta("corrente");
        Float saldo1 =  c1.getSaldo();
        System.out.println("Saldo atual: " + saldo1);
        c1.depositar(500.0f);
        saldo1 =  c1.getSaldo();
        System.out.println("Saldo atual: " + saldo1);
        c1.sacar(100.0f);
        saldo1 =  c1.getSaldo();
        System.out.println("Saldo atual: " + saldo1);
        c1.pagarMensal();
        c1.infos();

        Conta c2 = new Conta(5678, "poupanca", "Maria",true );
        c2.criarConta("poupanca");
        Float saldo2 =  c2.getSaldo();
        System.out.println("Saldo atual: " + saldo2);
        c2.depositar(1000.0f);
        saldo2 =  c2.getSaldo();
        System.out.println("Saldo atual: " + saldo2);
        c2.sacar(200.0f);
        saldo2 =  c2.getSaldo();
        System.out.println("Saldo atual: " + saldo2);
        c2.pagarMensal();
        c2.infos();*/

    }
}
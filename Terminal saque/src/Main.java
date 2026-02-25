//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

        public class Main {
            public static void main(String[] args) {
                Scanner leitor = new Scanner(System.in).useLocale(Locale.US);

                System.out.print("Qual o valor do saque? ");
                BigDecimal valorInformado = leitor.nextBigDecimal();


                String[] nomes = {"nota de R$200,00", "nota de R$100,00", "nota de R$50,00",
                        "nota de R$20,00", "nota de R$10,00", "nota de R$5,00",
                        "nota de R$2,00", "moeda de R$1,00", "moeda de R$0,50",
                        "moeda de R$0,25", "moeda de R$0,10", "moeda de R$0,05", "moeda de R$0,01"};

                System.out.println("Retorno esperado:");


                //Contador para ver quantas notas ou moedas sao necessarias para o valor informado
                // Zerar o contador antes de cada loop para evitar que o valor do contador acumule
                int count= 0;

                while (valorInformado.compareTo(BigDecimal.valueOf(200)) >= 0) {
                    valorInformado = valorInformado.subtract(BigDecimal.valueOf(200));
                    count++;
                }
                if (count > 0) {
                    System.out.println(count + " " + nomes[0]);








        }}




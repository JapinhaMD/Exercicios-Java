import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in).useLocale(Locale.US);
        NumberFormat nf = NumberFormat.getCurrencyInstance();

        ControleRemoto c1 = new ControleRemoto();
        c1.ligar();
        System.out.println("--- Indique o volume padrao---");
       // int padrao = leitor.nextInt();
        c1.setVolume(50);
        //c1.menosVolume();
        System.out.println("--- Valor para aumentar o volume---");
        int volume = leitor.nextInt();
        c1.maisVolume(volume);
        c1.abrirMenu();

    }
}
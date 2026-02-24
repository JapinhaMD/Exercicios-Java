//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Caneta c1 = new Caneta("BIC", 0.5f);
        // c1.modelo = "BIC"; NAO FUNCIONA POIS O ATRIBUTO MODELO É PRIVADO
        //c1.setModelo("IC"); //OBS: SE UTILIZAR O CONSTRUTOR E EM BAIXO UTILIZAR O SETTER, O VALOR DO ATRIBUTO MODELO VAI SER ALTERADO PARA "IC"
        //c1.setPonta(0.5f);  //OBS: SE UTILIZAR O CONSTRUTOR E EM BAIXO UTILIZAR O SETTER, O VALOR DO ATRIBUTO PONTA VAI SER ALTERADO PARA 0.5f
        c1.status();
        }
    }

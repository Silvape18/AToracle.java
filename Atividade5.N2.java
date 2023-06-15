//Atividade do Sinal
import java.util.Scanner;

public class Atividade5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a cor atual do sinal de trânsito (Vermelho, Verde ou Amarelo): ");
        String currentColor = teclado.nextLine();

        String nextColor;

        if (currentColor.equalsIgnoreCase("vermelho")) {
            nextColor = "Verde";
        } else if (currentColor.equalsIgnoreCase("verde")) {
            nextColor = "Amarelo";
        } else if (currentColor.equalsIgnoreCase("amarelo")) {
            nextColor = "Vermelho";
        } else {
            System.out.println("Cor inválida! Por favor, digite Vermelho, Verde ou Amarelo.");
            return;
        }

        System.out.println("A próxima cor do sinal de trânsito é: " + nextColor);
    }
}

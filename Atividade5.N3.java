//Atividade5 n 3
//sinal com switch

import java.util.Scanner;

public class Atividade5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a cor atual do sinal de trânsito (Vermelho, Verde ou Amarelo): ");
        String Cor = teclado.nextLine();

        String nextCoor;

        switch (Cor.toLowerCase()) {
            case "vermelho":
                nextCoor = "Verde";
                break;
            case "verde":
                nextCoor = "Amarelo";
                break;
            case "amarelo":
                nextCoor = "Vermelho";
                break;
            default:
                System.out.println("Cor inválida! Por favor, digite Vermelho, Verde ou Amarelo.");
                return;
        }

        System.out.println("A próxima cor do sinal de trânsito é: " + nextCoor);
    }
}

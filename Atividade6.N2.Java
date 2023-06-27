//Atividade6.n2

import java.util.Scanner;

public class Atividade5{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero1 = teclado.nextInt();

        System.out.println("Múltiplos de " + numero1 + " de 1 a 12:");

        for (int i = 1; i <= 12; i++) {
            int resultado = numero1 * i;
            System.out.println(numero1 + " x " + i + " = " + resultado);
        }

        
    }
}  

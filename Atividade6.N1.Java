
//atividade6.n1

import java.util.Scanner;

public class Atividade6{ 
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int Pin = 123456;
        int pinN;

         System.out.println("Digite o codigo pin: ");
        pinN = teclado.nextInt();

     while(pinN != Pin){
        System.out.println("Pin incorreto, Digite novamente: ");
        pinN = teclado.nextInt();

     } if(pinN == Pin){
        System.out.println("Pin Correto!");
     }
      


    }
}
   
   

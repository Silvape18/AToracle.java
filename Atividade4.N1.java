//Ativida4 n1; conversor de Fahrenheit para Celsius

import java.util.Scanner;

public class Atividade4{
     public static void main(String[] args) throws Exception{

         Scanner teclado = new Scanner(System.in);

            double temperaturaF;
            int temperaturac;

            System.out.println("Digite a temperatura que você quer converter: ");
            temperaturaF = teclado.nextDouble();

            temperaturac = (int) Math.round(temperaturaF-32)*5/9;

            System.out.println("A temperatura Fahrenheit para Celsius é: " + temperaturac);


     }

    }

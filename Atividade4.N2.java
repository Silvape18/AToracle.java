//atividade de calcular a hipotenusa

import java.util.Scanner;

public class Atividade4{
     public static void main(String[] args) throws Exception{

         Scanner teclado = new Scanner(System.in);


         System.out.println("Digite o valor do primeiro lado: ");
                         double lado1 = teclado.nextDouble();
            System.out.print("Digite o valor do segundo lado: ");
                double lado2 = teclado.nextDouble();

                double hipotenusa = calcularHipotenusa(lado1, lado2);

                 System.out.println("A hipotenusa do triângulo é: " + hipotenusa);

    }

        public static double calcularHipotenusa(double lado1, double lado2){
        double hipotenusa = Math.sqrt(Math.pow(lado1, 2) + Math.pow(lado2, 2));
        return hipotenusa;
    }
}       
       
       
            


// atividade do dados

import java.util.Random;

public class Atividade4 {
    
   
public static void main(String[] args) {
        
       
        Random rand = new Random();
        
       
        int dado1 = rand.nextInt(6) + 1; 
        
       
        int dado2 = rand.nextInt(6) + 1; 
        
        int soma = dado1 + dado2;
        
        System.out.println("Giro 1: " + dado1);
        System.out.println("Giro 2: " + dado2);
        System.out.println("A soma dos Giros são: " + soma);
    }
}

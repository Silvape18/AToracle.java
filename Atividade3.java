
//esse meu codigo coleta dados de um candidato e aplica para bolsa de uma faculdade, a operação que eu usei aqui foi valor da mensalidade/numerodefamiliares


import java.util.Scanner;

public class Atividade3{
     public static void main(String[] args) throws Exception{

         Scanner teclado = new Scanner(System.in);
    
            String nome;
            int idade;
            Double idadeT;
            String oqserei;
            String CidN;
            String CidD;
            String QualT;
            int Nf;
            double mensalidade = 1.500;
            double mensalidadeD;
            

             System.out.println("Digite seu nome: ");
             nome= teclado.nextLine();

             System.out.println("Digite sua idade atual: ");
                idade = teclado.nextInt();

             
             System.out.println("Qual sua cidade natal: ");
                CidN = teclado.nextLine();
                CidN = teclado.nextLine();

              System.out.println("Digite a idade que você tera em 2025: ");
             idadeT = teclado.nextDouble();

             System.out.println("Qual sua cidade de destino: ");
              CidD = teclado.nextLine();
               CidD = teclado.nextLine();


             System.out.println("O que você trabalha atualmente: ");
             QualT = teclado.nextLine();

       
              System.out.println("O que você pretende ser em 2025: ");
             oqserei = teclado.nextLine();
             System.out.println("Qual numero de pessoas em sua casa: ");
                Nf = teclado.nextInt();


              System.out.println("=====================================");
             System.out.println("              PROCESSANDO            ");
             System.out.println("=====================================");

             System.out.println("Olá, você é o "+ nome +" é você possui "+ idade +" anos de idade.\n No ano de ingresso(2025) você tera "+ idadeT +" anos de idade." );
             System.out.println("Em 2025 você prentende ser um "+ oqserei+".");

        
        System.out.println("Sua cidade natal é: "+  CidN + " e sua cidade de destino é "+ CidD+".");

        if(QualT == "Sim"){
            System.out.println("Você trabalha atualmente.");
        } else{
            System.out.println("Você não trabalha atualmente.");

       } 
        mensalidadeD = mensalidade/Nf;

       System.out.println("O seu desconto de acordo com numero de pessoas na sua casa é: " + mensalidadeD);






            





     }

    }

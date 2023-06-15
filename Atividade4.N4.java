//Atividade do nome:

import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um nome: ");
        String fullName = scanner.nextLine();

        String[] names = fullName.split(" ");
        String firstName = names[0];
        String lastName = names[names.length - 1];
             char firstInitial = firstName.charAt(0);
         System.out.println(lastName + ", " + firstInitial);
    }
}

    

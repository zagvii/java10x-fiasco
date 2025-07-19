package Condicoes;

import java.util.Scanner;

public class ScannerUsuario {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Abrindo o scanner para receber dados do usuário (System.in vs System.out)

        System.out.println("Digite o nome do animatronic: ");
        String nomeAnimatronic = input.nextLine(); // Tipo string

        System.out.println("Digite a idade do animatronic: ");
        int idadeAnimatronic = input.nextInt(); // Tipo int

        System.out.println("-----------------------------------------------");
        System.out.println("Nome do animatronic: " + nomeAnimatronic);
        System.out.println("Idade do animatronic: " + idadeAnimatronic);

        if (idadeAnimatronic <= 18) {
            System.out.println("Esse animatronic é maior de idade");
        } else {
            System.out.println("Esse animatronic é muito novo");
        }

        input.close(); // Fechando o scanner
    }
}

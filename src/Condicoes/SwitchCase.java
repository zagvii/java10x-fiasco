package Condicoes;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Escolha um animatronic: ");
        System.out.println("1 - Freddy");
        System.out.println("2 - Bonnie");
        System.out.println("3 - Chica");

        int animatronicEscolhido = input.nextInt();

        switch (animatronicEscolhido) {
            case 1:
                System.out.println("Você escolheu o animatronic: Freddy");
                break;
            case 2:
                System.out.println("Você escolheu o animatronic: Bonnie");
                break;
            case 3:
                System.out.println("Você escolheu o animatronic: Chica");
                break;
            default:
                System.out.println("Você escolheu um número não válido");
                break;
        }

        input.close();

    }
}

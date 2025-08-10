package NivelBasico.Desafios;

import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Scanner;

// Cadastro de Animatronics

public class SegundoDesafio {
    public static void main(String[] args) {

        // Inicializando dados
        Scanner input = new Scanner(System.in);
        ArrayList<String[]> animatronics = new ArrayList<>();
        int selectedOption = 0;

        do {
            selectedOption = showMenu();
            System.out.println("");
            treatSelectedOption(selectedOption, animatronics);
        } while (selectedOption != 3);

    }

    public static int showMenu () {
        // Menu
        System.out.println("-------------------*-------------------");
        System.out.println("Menu - Cadastro de Animatronic");
        System.out.println("1 - Cadastrar Novo Animatronic");
        System.out.println("2 - Listar Animatronics");
        System.out.println("3 - Sair do Menu");
        System.out.print("Selecione uma opção: ");

        int[] options = {1, 2, 3};

        Scanner input = new Scanner(System.in);
        int selectedOption = input.nextInt();

        while (!inArrayInt(options, selectedOption)) {
            System.out.println("Opção inválida!");
            System.out.print("Por favor, digite novamente: ");
            selectedOption = input.nextInt();
        }

        return selectedOption;
    }

    public static void  treatSelectedOption(int selectedOption, ArrayList<String[]> animatronics) {
        Scanner input = new Scanner(System.in);
        String[] optionsString = {"sim", "nao"};

        switch (selectedOption) {
            case 1:
                System.out.println("-------------------*-------------------");
                System.out.println("Digite os dados do novo animatronic: ");

                System.out.print("Nome: ");
                String newAnimatronicName = input.next();

                System.out.print("Idade: ");
                String newAnimatronicAge = input.next();

                System.out.print("Já apareceu nos filmes? ");
                String newAnimatronicInMovie = input.next();

                while (!inArrayString(optionsString, newAnimatronicInMovie)) {
                    System.out.println("Opção inválida!");
                    System.out.print("Por favor, digite 'sim' ou 'nao': ");
                    newAnimatronicInMovie = input.next();
                }

                animatronics.add(new String[]{newAnimatronicName, newAnimatronicAge, newAnimatronicInMovie});
                System.out.println("Animatronic criado com sucesso!");
                System.out.println("-------------------*-------------------\n");
                break;
            case 2:
                if (!animatronics.isEmpty()) {
                    System.out.println("-------------------*-------------------");
                    for (String animatronic[] : animatronics) {
                        System.out.println("Dados do animatronic: ");
                        System.out.println("Nome: " + animatronic[0]);
                        System.out.println("Idade: " + animatronic[1]);
                        System.out.println("Já apareceu nos filmes? " + animatronic[2]);
                    }
                    System.out.println("-------------------*-------------------\n");
                } else {
                    System.out.println("-------------------*-------------------\n");
                    System.out.println("Não existem animatronics cadastrados!");
                    System.out.println("-------------------*-------------------\n");
                }
                break;
            case 3:
                System.out.println("bye bye");
                break;
        }
    }

    public static boolean inArrayInt(int[] array, int search) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == search) {
                return true;
            }
        }
        return false;
    }

    public static boolean inArrayString(String[] array, String search) {
        search = search.toLowerCase();
        search = search.trim(); // remove espaços no início e fim
        search = search.replaceAll("\\s+", ""); // remove todos os espaços (até no meio, se quiser)
        search = Normalizer.normalize(search, Normalizer.Form.NFD); // separa os acentos
        search = search.replaceAll("[\\p{InCombiningDiacriticalMarks}]", ""); // remove acentos

        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(search)) {
                return true;
            }
        }
        return false;
    }
}

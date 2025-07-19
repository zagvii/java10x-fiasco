package Desafios;

public class PrimeiroDesafio {
    public static void main(String[] args) {
        String nomeAmigo1 = "Kuromi";
        int idadeAmigo1 = 14;
        String nomeMissaoAmigo1 = "Plantar cenouras";
        char nivelMissaoAmigo1 = 'A';
        String conclusaoMissaoAmigo1 = "Não concluído";

        String nomeAmigo2 = "Cinnamon Roll";
        int idadeAmigo2 = 13;
        String nomeMissaoAmigo2 = "Cozinhar bolinhos";
        char nivelMissaoAmigo2 = 'C';
        String conclusaoMissaoAmigo2 = "Não concluído";

        String nomeAmigo3 = "My Melody";
        int idadeAmigo3 = 20;
        String nomeMissaoAmigo3 = "Criar festivar de musica";
        char nivelMissaoAmigo3 = 'E';
        String conclusaoMissaoAmigo3 = "Não concluído";

        if (idadeAmigo1 < 15 && (nivelMissaoAmigo1 == 'C' || nivelMissaoAmigo1 == 'D')) {
            conclusaoMissaoAmigo1 = "Concluído";
        } else if (idadeAmigo1 > 15) {
            conclusaoMissaoAmigo1 = "Concluído";
        }

        System.out.println("Status da Missão do Amigo 1: " + conclusaoMissaoAmigo1);

        if (idadeAmigo2 < 15 && (nivelMissaoAmigo2 == 'C' || nivelMissaoAmigo2 == 'D')) {
            conclusaoMissaoAmigo2 = "Concluído";
        } else if (idadeAmigo2 > 15) {
            conclusaoMissaoAmigo2 = "Concluído";
        }

        System.out.println("Status da Missão do Amigo 2: " + conclusaoMissaoAmigo2);

        if (idadeAmigo3 < 15 && (nivelMissaoAmigo3 == 'C' || nivelMissaoAmigo3 == 'D')) {
            conclusaoMissaoAmigo3 = "Concluído";
        } else if (idadeAmigo3 > 15) {
            conclusaoMissaoAmigo3 = "Concluído";
        }

        System.out.println("Status da Missão do Amigo 2: " + conclusaoMissaoAmigo3);
    }
}

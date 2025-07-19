package NivelBasico.Condicoes;

public class IfElse {
    public static void main(String[] args) {

        String nome = "Freddy";
        int idade = 13;
        boolean famoso = false;
        short numeroJogos = 15;

        if (numeroJogos > 10 && idade > 15) {
            System.out.println(nome + " está pronto para virar famoso");
        } else if (numeroJogos > 10 && idade <= 15) {
            System.out.println(nome + " está pronto para virar mini famoso");
        } else {
            System.out.println(nome + " ainda não é famoso");
        }
    }
}

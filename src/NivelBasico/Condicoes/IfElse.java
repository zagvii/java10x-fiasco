package NivelBasico.Condicoes;

public class IfElse {
    public static void main(String[] args) {

        String nome = "Kuromi";
        int idade = 13;
        boolean famoso = false;
        short numeroAmigos = 15;

        if (numeroAmigos > 10 && idade > 15) {
            System.out.println(nome + " está pronta para virar famosa");
        } else if (numeroAmigos > 10 && idade <= 15) {
            System.out.println(nome + " está pronta para virar mini famosa");
        } else {
            System.out.println(nome + " ainda não é famosa");
        }
    }
}

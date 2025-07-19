package NivelBasico.Condicoes;

public class LacosDeRepeticao {
    public static void main(String[] args) {

        int numeroJogos = 1;
        int numeroMaxJogos = 10;

//        while(numeroJogos < numeroMaxJogos){
//            numeroJogos++;
//            System.out.println(numeroJogos + " - O animatronic apareceu no novo jogo");
//        }

        for (; numeroJogos <= numeroMaxJogos; numeroJogos++) {
            System.out.println(numeroJogos + " - O animatronic apareceu no novo jogo");
        }
    }
}
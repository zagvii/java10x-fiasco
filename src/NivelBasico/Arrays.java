package NivelBasico;

public class Arrays {
    public static void main(String[] args) {

        String[] animatronicsNomes = new String[3]; // Nao sao flexiveis, tem tamanho fixo
        animatronicsNomes[0] = "Freddy";
        animatronicsNomes[1] = "Bonnie";
        animatronicsNomes[2] = "Chica"; // Inicializa todas as posicoes como null

        // animatronicsNomes = new String[4]; // Ao redeclarar a array, ele vai sobreecrever toda a array, usa o mesmo espaco de memoria mas o garbage collector vai deletar os dados que existiam antes

        int[] idade = new int[3]; // Inicializa todas as posicoes como 0
        boolean[] verdadeOuFalse = new boolean[3]; // Inicializa todas as posicoes como false
        double[] flutuante = new double[3]; // Inicializa todas as posicoes como 0.0

        String nomeAnimatronic1 = "Foxy"; // Aqui cada um deles ocupa um espaco diferente na memoria, cada um tem uma referencia diferente
        String nomeAnimatronic2 = "Mangle"; // Ja na array, a array inteira tem só uma referencia e o mesmo espaco de memoria é dividido pela quantidade informada

        /*for (String animatronic : animatronicsNomes) {
            System.out.println(animatronic);
        }*/

        /*System.out.println("---------------------------------------");

        for (int i = 0; i < animatronics.length; i++) {
            System.out.println(animatronics[i]);
        }*/

        // MATRIZ - Array de arrays - Arrays de referencias

        String[][] animatronics = new String[3][3];
        animatronics[0][0] = "FNAF 1";
        animatronics[0][1] = "Freddy";
        animatronics[0][2] = "Bonnie";

        animatronics[1][0] = "FNAF 2";
        animatronics[1][1] = "Mangle";
        animatronics[1][2] = "Puppet";

        animatronics[2][0] = "FNAF - Sister Location";
        animatronics[2][1] = "Baby";
        animatronics[2][2] = "Ballora";

        for (String[] animatronic : animatronics) {
            System.out.print("Nome do jogo: " + animatronic[0]);
            for (int i = 1; i < animatronic.length; i++) {
                System.out.print(" - Animatronic " + i + ": " + animatronic[i]);
            }
            System.out.println("");
        }
    }
}

package NivelBasico;

public class Arrays {
    public static void main(String[] args) {

        String[] animatronics = new String[3]; // Nao sao flexiveis, tem tamanho fixo
        animatronics[0] = "Freddy";
        animatronics[1] = "Bonnie";
        animatronics[2] = "Chica"; // Inicializa todas as posicoes como null

        // animatronics = new String[4]; // Ao redeclarar a array, ele vai sobreecrever toda a array, usa o mesmo espaco de memoria mas o garbage collector vai deletar os dados que existiam antes

        int[] idade = new int[3]; // Inicializa todas as posicoes como 0
        boolean[] verdadeOuFalse = new boolean[3]; // Inicializa todas as posicoes como false
        double[] flutuante = new double[3]; // Inicializa todas as posicoes como 0.0

        String nomeAnimatronic1 = "Foxy"; // Aqui cada um deles ocupa um espaco diferente na memoria, cada um tem uma referencia diferente
        String nomeAnimatronic2 = "Mangle"; // Ja na array, a array inteira tem só uma referencia e o mesmo espaco de memoria é dividido pela quantidade informada

        for (String animatronic : animatronics) {
            System.out.println(animatronic);
        }

        /*System.out.println("---------------------------------------");

        for (int i = 0; i < animatronics.length; i++) {
            System.out.println(animatronics[i]);
        }*/

    }
}

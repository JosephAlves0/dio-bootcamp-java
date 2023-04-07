import java.util.Random;

public class Ex3_NumerosAleatorios {
    public static void main(String[] args) {

        Random random = new Random();
        int[] numAleatorios = new int[20];

        for (int i = 0; i < numAleatorios.length; i++) {

            numAleatorios[i] = random.nextInt(100);
        }

        System.out.println("Números Aleatórios ");
        for (int numero : numAleatorios) {
            System.out.print(numero + " ");
        }

        System.out.println("\nSucessores dos Números Aleatórios ");
        for (int numero : numAleatorios) {
            System.out.print((numero + 1) + " ");
        }
    }
}

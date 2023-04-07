import java.util.Random;

public class Ex4_ArrayMultidimendional {
    public static void main(String[] args) {
        Random random = new Random();

        int[][] M = new int[4][4];

        for (int l = 0; l < 4; l++){
            for (int c = 0; c < 4; c++){
                M[l][c] = random.nextInt(100);
            }
        }

        for (int[] linha: M ) {
            for (int coluna: linha ) {
                System.out.print(coluna + " ");
            }
            System.out.println();
        }

        /*for (int l = 0; l < 4; l++){
            for (int c = 0; c < 4; c++){
                System.out.print(M[l][c] + " ");
            }
            System.out.print("\n");
        }*/
    }
}

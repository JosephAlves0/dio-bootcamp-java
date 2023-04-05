import java.util.Scanner;

public class Ex2_Consoantes {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] vetor = new String[6];
        String[] consoantes = new String[6];
        int qtdConsoantes = 0;

        for (int i = 0; i < vetor.length; i++){
            System.out.println("Digite um caracter: ");
            String letra = scan.next();
            vetor[i] = letra;
            if ( !(letra.equalsIgnoreCase("a") ||
                    letra.equalsIgnoreCase("e") ||
                    letra.equalsIgnoreCase("i") ||
                    letra.equalsIgnoreCase("o") ||
                    letra.equalsIgnoreCase("u")) ){
                consoantes[qtdConsoantes] = letra;
                qtdConsoantes++;
            }
        }

        System.out.println("Qtd consoantes: " + qtdConsoantes);
        for (String consoante : consoantes){
            System.out.println(consoante);
        }

    }
}

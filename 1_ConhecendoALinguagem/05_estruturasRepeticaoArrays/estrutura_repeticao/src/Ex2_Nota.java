import java.util.Scanner;

public class Ex2_Nota {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double nota;

        do {
            System.out.println("Digite a nota");
            nota = scan.nextDouble();

            if(nota < 0 || nota > 10){
                System.out.println("Nota inválida");
            } else {
                System.out.println("Nota digitada: " + nota);
            }
        }while (nota < 0 || nota > 10);
    }
}
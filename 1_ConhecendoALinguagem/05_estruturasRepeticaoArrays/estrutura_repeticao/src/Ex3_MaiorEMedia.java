import java.util.Scanner;

public class Ex3_MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero;
        int maior = 0;
        double media = 0;
        int soma = 0;


        for (int i = 0; i < 5; i ++){
            System.out.println("Digite um número: ");
            numero = scan.nextInt();
            if(i == 0){
                maior = numero;
            } else {
                if(numero > maior){
                    maior = numero;
                }
            }
            soma += numero;
        }
        System.out.println("O maior número é: " + maior);
        System.out.println("A média é: " + (soma/5));
    }
}

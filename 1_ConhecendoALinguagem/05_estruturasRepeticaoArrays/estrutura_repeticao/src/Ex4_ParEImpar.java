import java.util.Scanner;

public class Ex4_ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int qtd;
        int par = 0;
        int impar = 0;
        int num;
        System.out.println("Quantos números deseja digitar: ");
        qtd = scan.nextInt();

        for (int i = 0; i < qtd; i++){
            System.out.println("Digite o número: ");
            num = scan.nextInt();
            if(num % 2 == 0){
                par++;
            } else {
                impar++;
            }
        }

        System.out.println("Qtd pares: " + par + "\nQtd ímpar: " + impar);
    }
}

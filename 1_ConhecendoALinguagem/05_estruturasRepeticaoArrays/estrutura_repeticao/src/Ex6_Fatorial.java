import java.util.Scanner;

public class Ex6_Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com o fatorial: ");
        int fat = scan.nextInt();
        int resultado = 1;

        for(int i = fat; i > 1; i--){
            resultado = resultado * i;
        }

        System.out.println("Fatorial: " + resultado);
    }
}

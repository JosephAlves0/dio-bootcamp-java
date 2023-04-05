import java.util.Scanner;

public class Ex5_Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o número que deseja a tabuada: ");
        int num = scan.nextInt();

        for (int i = 0; i < 11; i++){
            System.out.println(num + " x " + i + " = " + (num * i));
        }

    }
}

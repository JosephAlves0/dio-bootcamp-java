import java.util.Scanner;

public class Ex1_NomeEIdade {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String nome;
        double idade;

        while (true){
            System.out.println("Digite o nome: ");
            nome = scanner.next();
            if(nome.equals("0")){
                break;
            }
            System.out.println("Digite a Idade: ");
            idade = scanner.nextInt();
        }

        System.out.println("Continua aqui...");

    }
}
public class Main {
    public static void main(String[] args) {

        //Calculadora
        System.out.println("Exercício Calculadora");
        Calculadora.soma(10, 5);
        Calculadora.subtracao(10, 5);
        Calculadora.multiplicacao(10, 5);
        Calculadora.divisao(10, 5);

        //Mensagem
        System.out.println("\nExercício Mensagem");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(1);

        //Empréstimo
        System.out.println("\nExercício Empréstimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);
    }
}
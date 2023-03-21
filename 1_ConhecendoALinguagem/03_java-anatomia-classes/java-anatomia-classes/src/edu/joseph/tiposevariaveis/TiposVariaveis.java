package edu.joseph.tiposevariaveis;
public class TiposVariaveis {
    public static void main(String[] args) {
        double salarioMinimo = 2500;
        double salario = 2500.33;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        int numero = 1;
        numero = 2;

        System.out.print(numero);

        final double VALOR_DE_PI = 3.14; //final torna a variável uma constante.
    }
}

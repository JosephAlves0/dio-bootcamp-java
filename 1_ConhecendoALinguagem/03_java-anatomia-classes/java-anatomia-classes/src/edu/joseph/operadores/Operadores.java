package edu.joseph.operadores;
public class Operadores {
    public static void main(String[] args) {
        //String nomeCompleto = "LINGUAGEM" + "JAVA";
        //System.out.println(nomeCompleto);

        /*String concatenacao = "?";
        System.out.println(concatenacao);
        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);
        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao);
        concatenacao = 1+"1"+1+"1";
        System.out.println(concatenacao);
        concatenacao = "1"+1+1+1;
        System.out.println(concatenacao);
        concatenacao = "1"+(1+1+1);
        System.out.println(concatenacao);*/

        /*int numero = 5;
        numero = -numero;
        //System.out.println(- numero);
        System.out.println(numero);
        numero = numero * -1;
        System.out.println(numero);*/

        /*int numero = 5;
        //numero++;
        System.out.println(++numero);
        System.out.println(numero);

        System.out.println(numero--);
        System.out.println(numero);
        System.out.println(--numero);
        System.out.println(numero);*/

        /*boolean variavel = true;
        System.out.println(!variavel);
        System.out.println(variavel);
        variavel = !variavel;
        System.out.println(variavel);*/

        /*int a = 5, b = 6;
        String resultado = a==b ? "Verdadeiro" : "Falso";
        //if(a==b){
        //    resultado = "Verdadeiro";
        //} else {
        //    resultado = "Falso";
        //}
        System.out.println(resultado);*/

        /*int numero1 = 1, numero2 = 2;
        boolean simNao = numero1 == numero2;
        System.out.println(simNao);
        simNao = numero1 != numero2;
        System.out.println(simNao);
        simNao = numero1 > numero2;
        System.out.println(simNao);
        simNao = numero1 < numero2;
        System.out.println(simNao);

        String nomeUm = "Bento";
        String nomeDois = new String("Bento");
        System.out.println(nomeUm == nomeDois);
        System.out.println("equals " + nomeUm.equals(nomeDois));*/

        boolean condicao1 = true;
        boolean condicao2 = true;
        if(condicao1 && condicao2){
            System.out.println("As duas condições são verdadeiras");
        }
        if(condicao1 || condicao2){
            System.out.println("Uma das condições é verdadeira");
        }
        System.out.println("Fim");
    }
}

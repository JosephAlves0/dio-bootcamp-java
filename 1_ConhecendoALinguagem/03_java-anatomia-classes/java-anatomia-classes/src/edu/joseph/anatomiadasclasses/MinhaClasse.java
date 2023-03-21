package edu.joseph.anatomiadasclasses;

public class MinhaClasse {

    public static void main(String[] args) {

        //System.out.print("Olá turma, sejam bem-vindos");
        //int ano = 2021;
        //ano = 2022;
        //final String BR = "Brasil"; //final indica é a variável é imutável
        //BR = "Brazil";

        String meuNome = "Bento";
        int anoFabricacao = 2022;
        boolean verdadeira = false;
        anoFabricacao = 2018;

        String primeiroNome = "Bento";
        String segundoNome = "Aaa";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);

    }

    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
    }
}

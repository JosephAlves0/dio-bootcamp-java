public class Main {
    public static void main(String[] args) {

        ListaEncadeada<String> minhaListaEncateada = new ListaEncadeada<>();

        minhaListaEncateada.add("teste1");
        minhaListaEncateada.add("teste2");
        minhaListaEncateada.add("teste3");
        minhaListaEncateada.add("teste4");

        System.out.println(minhaListaEncateada.get(0));
        System.out.println(minhaListaEncateada.get(1));
        System.out.println(minhaListaEncateada.get(2));
        System.out.println(minhaListaEncateada.get(3));

        System.out.println(minhaListaEncateada);

        System.out.println(minhaListaEncateada.remove(1));
        System.out.println(minhaListaEncateada);

    }
}
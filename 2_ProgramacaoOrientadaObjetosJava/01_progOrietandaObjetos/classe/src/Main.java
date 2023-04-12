public class Main {
    public static void main(String[] args) {

        Carro carro1 = new Carro("vermelho", "ferrari", 45 );
        System.out.println("Valor total para enxer o tanque do " + carro1.modelo + " R$: " + carro1.totalValorTanque(5.10));

        Carro carro2 = new Carro("preto", "mercedes", 55);
        System.out.println("Valor total para enxer o tanque do " + carro2.modelo + " R$: " + carro2.totalValorTanque(5.10));

        Carro carro3 = new Carro();
        carro3.setCor("laranja");
        carro3.setModelo("mclaren");
        carro3.setCapacidadeTanque(60);
        System.out.println("Valor total para enxer o tanque do " + carro3.modelo + " R$: " + carro3.totalValorTanque(5.10));

    }
}
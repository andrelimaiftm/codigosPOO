public class Principal {
    public static void main(String[] args) {
             
        Carro meuCarro;
        meuCarro = new Carro();
        meuCarro.fabricante = "Fiat";
        meuCarro.modelo = "Palio";
        meuCarro.anoFabricacao = 2011;
        meuCarro.cor = "Vermelha";

        Carro seuCarro = new Carro();
        seuCarro.fabricante = "Honda";
        seuCarro.modelo = "Civic";
        seuCarro.anoFabricacao = 2009;
        seuCarro.cor = "Preto";

       /* System.out.println("Meu carro");
        System.out.println("---------------------------");
        System.out.println("Modelo: " +meuCarro.modelo);
        System.out.println("Ano: " + meuCarro.anoFabricacao);

        System.out.println("Seu carro");
        System.out.println("---------------------------");
        System.out.println("Modelo: " + seuCarro.modelo);
        System.out.println("Ano: " + seuCarro.anoFabricacao);*/

        System.out.println("Carro: " + meuCarro.modelo);
        System.out.println(meuCarro.pegaCor());
        meuCarro.ligar();

        System.out.println();

        System.out.println("Carro: " + seuCarro.modelo);
        System.out.println(seuCarro.pegaCor());
        seuCarro.ligar();

        seuCarro.alterarModelo("Corolla");
        System.out.println(seuCarro.modelo);

    }
    
}

public class TestaArrayCarros {

    public static void main(String[] args) {
        Carro[] carros = new Carro[5];

        Carro c1 = new Carro();
        c1.modelo = "Prios";

        carros[0] = new Carro();
        carros[0].anoFabricacao = 2011;
        carros[1] = c1;
    }
    
}

public class Principal2 {

    public static void main(String[] args) {
        Proprietario dono1 = new Proprietario();
        dono1.nome = "João da Silva";
        dono1.cpf = "000.000.000-00";
        dono1.idade = 25;
        dono1.logradouro = "Rua 26, 200";
        dono1.bairro = "Centro";
        dono1.cidade = "Ituiutaba";

        Proprietario dono2 = new Proprietario();
        dono2.nome = "Manoel dos Santos";
        

        //System.out.println("Nome: " + dono1.nome);
        //System.out.println("Idade: " + dono1.idade);

        Carro meuCarro = new Carro();
        meuCarro.fabricante = "Fiat";
        meuCarro.modelo = "Palio";
        meuCarro.anoFabricacao = 2011;
        meuCarro.cor = "Vermelha";
        meuCarro.dono = dono1;

        Carro seuCarro = new Carro();
        seuCarro.fabricante = "Honda";
        seuCarro.modelo = "Civic";
        seuCarro.anoFabricacao = 2009;
        seuCarro.cor = "Preto";
        seuCarro.dono = dono2;

        System.out.println("Antes da mudança do nome");
        System.out.println(meuCarro.dono.nome);
        System.out.println(seuCarro.dono.nome);
        System.out.println(dono1.nome);
        System.out.println(dono2.nome);

        dono2.nome = "Maria Joaquina";
        System.out.println();

        System.out.println("Despois da mudança");
        System.out.println(meuCarro.dono.nome);
        System.out.println(seuCarro.dono.nome);
        System.out.println(dono1.nome);
        System.out.println(dono2.nome);


    }

    
    
}

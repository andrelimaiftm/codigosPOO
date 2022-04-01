public class Carro {

    //atributo(sao as propriedades da classe)
    String fabricante;
    String modelo;
    String cor;
    int anoFabricacao;
    float valorDeMercado;
    boolean biconbustivel;

    Proprietario dono;

    String pegaCor(){
        return cor;
    }

    void alterarModelo(String modelo){
        this.modelo = modelo;
    }

    //métodos são as ações do objeto
    void ligar(){
        if(modelo != null){
            System.out.println("Ligando o carro");
        }
    }
    
    
}

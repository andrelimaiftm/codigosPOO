public class Paciente {

    double peso;
    double altura;

    /*double calculaIndiceDeMassaCorporal(){
        double imc = peso / (altura * altura);
        return imc;
    }*/

    IMC calculaIndiceDeMassaCorporal(){
        IMC imc = new IMC();
        double indice = peso / (altura *altura);
        imc.indice = indice;

        if(indice < 18.5){
            imc.abaixoDoPesoIdeal = true;
        }else if(indice < 25){
            imc.pesoIdeal = true;
        }else{
            imc.obeso = true;

            if(indice < 30){
                imc.grauObesidade = "acima do peso";
            }else if(indice < 35){
                imc.grauObesidade = "Grau I";
            }else if (indice < 40){
                imc.grauObesidade = "Grau II";
            }else{
                imc.grauObesidade = "Grau III";
            }
        }

        return imc;

    }
    
}

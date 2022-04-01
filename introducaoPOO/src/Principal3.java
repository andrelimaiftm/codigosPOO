public class Principal3 {
    public static void main(String[] args) {
        Paciente p = new Paciente();
        p.peso = 70.5;
        p.altura = 1.75;
        IMC imcCalculado = p.calculaIndiceDeMassaCorporal();

        System.out.println("IMC do paciente: " + imcCalculado.indice);
        System.out.println("Abaixo do peso idel: " + imcCalculado.abaixoDoPesoIdeal);
        System.out.println("Peso ideal: " + imcCalculado.pesoIdeal);
        System.out.println("Obeso: " + imcCalculado.obeso);
        System.out.println("Grau de obesidade: " + imcCalculado.grauObesidade);
    }
}

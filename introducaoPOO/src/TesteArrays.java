import java.util.Scanner;

public class TesteArrays {

    public static void main(String[] args) {
        
        //int[] notas;
        //notas = new int[5];
        
        int[] notas = new int[5];
        /*notas[0] = 10;
        notas[1] = 5;
        notas[2] = 8;
        notas[3] = 9;
        notas[4] = 7;*/

        Scanner entrada = new Scanner(System.in);

        float media = 0;
        int soma = 0;

        System.out.println("Digite as notas");
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Nota[" + i + "] = " );
            notas[i] = entrada.nextInt();
            //soma = soma + notas[i];
            soma += notas[i];
        }
        
        media = (float) soma/notas.length;       

        System.out.println("Nota do primeiro aluno: " + notas[0]);

        System.out.println("Tamanho do array: " + notas.length);

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Posicao[" + i + "] = " + notas[i]);
        }
        System.out.println("A Media das notas é " + media);

        entrada.close();


    }
    
}

import java.util.Scanner;

public class ExemploContinue {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        int valor = entrada.nextInt();

        for(int i = 0; i <= valor; i++){
            if(!(i % 2 == 0)){
                continue;
            }
            System.out.println(i);            
        }

        entrada.close();
        
    }

    

    
    
}

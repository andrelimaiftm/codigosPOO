import java.util.Scanner;

public class EstruturaFor {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ultimo numero: ");
        int numeroFinal = entrada.nextInt();
       //for(iniciacao;   condição;     incremento )
        for (int i = 0; i <= numeroFinal; i++) {
            System.out.println(i);            
        }
        entrada.close();
    }
    
}

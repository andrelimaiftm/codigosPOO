import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        
       // Scanner e = new Scanner(System.in);

        Pessoa p1 = new Pessoa("Moniele");

        Pessoa p2 = new Pessoa("Sebastião", 30);

        System.out.println("Nome: \"" + p1.nome +"\" tem " + p1.idade +" anos");
        System.out.println("Nome: \"" + p2.nome +"\" tem " + p2.idade +" anos");
    }
}

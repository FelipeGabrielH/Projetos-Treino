import java.util.Scanner;

public class Bhaskara{
    public static void main(String args []){
        Scanner in = new Scanner(System.in);
        
        System.out.println("Digite o primeiro número: ");
        double a =in.nextDouble();
        
        System.out.println("Digite o segundo número: ");
        double b = in.nextDouble();
        
        System.out.println("Digite o terceiro número: ");
        double c = in.nextDouble();
        
        double delta = (Math.pow (b, 2)) - (4 * a * c);
        double deltaFinal =(Math.sqrt(delta));
        double bhaskaraa = (-b + deltaFinal);
        double bhaskarab = (-b - deltaFinal);
        
        System.out.println("Primeira Raiz: " +bhaskaraa / (2*a) );
        System.out.println("Segunda Raiz: " +bhaskarab / (2*a) );
    }
}
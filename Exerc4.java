import java.util.Scanner;

public class Exerc4{
    public static void main(String args []){
        Scanner in = new Scanner (System.in);
        
        double n1;
        double n2;
        double resto;
        
        System.out.println("Digite um numero: ");
        n1 = in.nextDouble();
        
        System.out.println("Digite outro numero: ");
        n2 = in.nextDouble();
        
        resto = n1 % n2;
        
        System.out.print(resto);
        
    }
}
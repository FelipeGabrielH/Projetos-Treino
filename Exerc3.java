import java.util.Scanner;
public class Exerc3{
    public static void main(String args []){
        Scanner in = new Scanner(System.in);
        
        double n1;
        double n2;
        double calculo;
        
        System.out.println("Digite o 1º número: ");
        n1 = in.nextDouble();
        
        System.out.println("Digite o 2º número: ");
        n2 = in.nextDouble();
        
        calculo = n1 * Math.pow(n2,3);
        
        System.out.println("O resultado é: "+calculo);
    }
}
import java.util.Scanner;
public class Exerc7{
    public static void main (String args []){
        Scanner in = new Scanner(System.in);
        
        double numero;
        double conta;
        
        System.out.println("Digite um número");
        numero = in.nextDouble();
        
        conta = numero % 2;
        
        if (conta == 0 && numero > 0){
            System.out.println("O número é positivo e par");   
        }else if (conta == 0 && numero < 0){
            System.out.println("O número é negativo e par");
        }else if(conta != 0 && numero > 0){
            System.out.println("O número é positivo e impar");
        }else if (conta != 0 && numero < 0){
            System.out.println("O número é negativo e impar");
        }else{
            System.out.println("O Número é neutro");
        }

        
    }
}
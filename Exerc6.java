import java.util.Scanner;

public class Exerc6{
    public static void main(String args[]){
        Scanner in = new Scanner (System.in);
        
        double reais;
        double peuro;
        double pdollar;
        double conta;
        
        System.out.println("Digite o valor de reais");
        reais = in.nextDouble();
        
        peuro = reais / 5.43;
        pdollar =reais / 4.99;
        
        System.out.println("Euro " +peuro);
        System.out.println("Dollar " +pdollar);
    }
}
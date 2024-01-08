import java.util.Scanner;

public class Impares{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        
        int i, numero;
        
        System.out.println("Digite o número");
        numero = in.nextInt();
        
        for(i=1;i<=numero;i =i+2){
            System.out.println(i);
        }
    }
}
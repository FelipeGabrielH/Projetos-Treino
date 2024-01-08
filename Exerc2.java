import java.util.Scanner;
public class Exerc2{
    public static void main(String args []){
        Scanner in = new Scanner (System.in);
        
        int num1;
        int num2;
        int antecessor;
        int sucessor;
        
        System.out.println("Digite o numero que voce quer o antecessor:");
        num1 = in.nextInt();
        
        System.out.println("Digite o numero que voce quer o sucessor:");
        num2 = in.nextInt();
        
        antecessor = num1 - 1;
        sucessor = num2 + 1;
        
        System.out.println("Antecessor :"+antecessor);
        System.out.println("Sucessor: "+sucessor);
    
    }
}

import java.util.Scanner;

public class ParImparInc2{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        
        int i, num1;
        
        System.out.println("Digite um número");
        num1 = in.nextInt();
        System.out.println(" ");
        System.out.println("=======IMPARES======");
        System.out.println(" ");
        
        for(i=1; i<=num1; i = i+2){
            System.out.println(i+"-Impar");
        }
        System.out.println("=======PARES======");
        System.out.println(" ");
        for(i=2; i<=num1; i = i+2){
            System.out.println(i+"-Par");
        }
        System.out.println(" ");
        System.out.println("======================");
    }
}
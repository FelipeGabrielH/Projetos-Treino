import java.util.Scanner;

public class Exerc1{
    public static void main(String args []){
        Scanner in = new Scanner (System.in);
        
        String primeiroNome;
        String segundoNome;
        String terceiroNome;
        
        System.out.println("Digite seu primeiro nome: ");
        primeiroNome = in.next(); in.nextLine();
        
        System.out.println("Digite seu segundo nome: ");
        segundoNome = in.next(); in.nextLine();
        
        System.out.println("Digite seu terceiro nome: ");
        terceiroNome = in.next(); in.nextLine();
        
        System.out.println("********* Nome Completo ********");
        System.out.println(primeiroNome);
        System.out.println(segundoNome);
        System.out.println(terceiroNome);
        System.out.println("----------------------------------");
        
    }
}
   
        
        
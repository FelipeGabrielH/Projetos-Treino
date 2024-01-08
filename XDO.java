import java.util.Scanner;
public class XDO{
    public static void main(String [] argas){
        Scanner in = new Scanner(System.in);
        
        int i, numero, soma;
        
        i = 1;
        soma = 0;
        
        do{
            System.out.println("Digite um número: ");
            numero = in.nextInt();
            
            soma = soma + numero;
            i++;
        }while(i<=5);
            System.out.println("A soma dos números digitados é: " +soma);
    }
}
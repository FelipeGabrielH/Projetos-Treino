import java.util.Scanner;

public class XDO2{
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        
        int i, numero, soma;
        
        soma = 0;
        
        for (i=1; i<=5; i++){
            System.out.println("Digite um número: ");
            
            numero = in.nextInt();
            soma = soma + numero;
        }
        System.out.println("A soma dos números digitados é:" +soma);
    }
}
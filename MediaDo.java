import java.util.Scanner;

public class MediaDo{
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        
        int i, numero, soma;
        double media;
        
        soma = 0;
        
        for(i=1; i<=5; i++){
            System.out.println("Digite um número:");
            numero = in.nextInt();
            soma = soma + numero;
        }
        
        media = soma/5.0;
        
        System.out.println("A média dos números digitados é: "+media);
    }
}
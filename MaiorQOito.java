import java.util.Scanner;

public class MaiorQOito{
    public static void main(String args []){
        Scanner in = new Scanner(System.in);
        
        int i, numero, quantidade;
        
        quantidade = 0;
        
        for(i=1; i<=5; i++){
            System.out.println("Digite 5 números");
            numero = in.nextInt();
            
            if(numero > 8){
                quantidade++;
            }
        }
        System.out.println("Quantidade dos números maiores que 8 é: " +quantidade);
    }
}
import java.util.Scanner;

public class ParesComFor{
    public static void main(String args []){
        Scanner in = new Scanner(System.in);
        
        int i, numero, quantidade;
        
        quantidade = 0;
        
        for(i=1; i<=10; i++){
            System.out.println("Digite 10 números");
            numero = in.nextInt();
            
            if(numero % 2 == 0){
                quantidade++;
            }
        }
        System.out.println("Os números pares são " +quantidade);
    }
}
import java.util.Scanner;
public class CaixaMercado{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        
        int i, qtdProd;
        double precProd, precoTotal;
        
        System.out.println("Digite a quantidade de produtos");
        qtdProd = in.nextInt();
        
        precoTotal = 0;
        
        for(i=1; i<=qtdProd; i++){
            System.out.println("Digite o preço dos produtos" +i+ ":");
            precProd = in.nextDouble();
            
            precoTotal += precProd;
        }
        System.out.print("O preço total é: "+ precoTotal); 
    }
}
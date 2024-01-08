import java.util.Scanner;

public class palhas{
    public static void main(String args []){
        Scanner in = new Scanner(System.in);
        
        String produto = "Camisa";
        
        double valorProd;
        double total;
        double desconto;
        double priPres;
        double soDes;
        
        System.out.println("***********" +produto+ "*************");
        
            System.out.print("Digite o valor do produto: " );
                valorProd = in.nextDouble();
                
                System.out.print(" ");
                
                System.out.print("O nome do produto é: " +produto);
                
                soDes = valorProd * 0.10;
                desconto = valorProd - soDes;
                
                System.out.println("o valor do produto com 10% de desconto é de RS: " +desconto);
                priPres = desconto /5;
                
                    System.out.println("Na 1º prestação fica R$: "+ priPres);
                    System.out.println("Na 2º prestação fica R$: "+ priPres);
                    System.out.println("Na 3º prestação fica R$: "+ priPres);
                    System.out.println("Na 4º prestação fica R$: "+ priPres);
                    System.out.println("Na 5º prestação fica R$: "+ priPres);
        
        
                
        
                    
                    
                    
                    
                    
                    
                    
                    
                        
    }
}
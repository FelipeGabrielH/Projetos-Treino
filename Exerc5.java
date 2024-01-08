import java.util.Scanner;
public class Exerc5{
    public static void main(String args []){
        Scanner in = new Scanner (System.in);
        
        double salr;
        double bonus;
        double bonusmaior;
        double vendas;
        
        System.out.println("Digite o número de vendas em R$");
        vendas = in.nextDouble();
        
        if(vendas >= 5000 && vendas <= 9999){
            System.out.println(vendas * 0.12);
        }
        else if(vendas >= 10000){
            System.out.println(vendas *0.20);
        }
        else if(vendas < 5000){
            System.out.println("Não recebeu bonus, salário vai ser 2800");
        
        }else{
            System.out.println("Valor inválido");
        }
    }      }            
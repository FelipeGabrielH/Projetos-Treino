import java.util.Scanner;

public class Banco2{
    public static void main(String args []){
        Scanner in = new Scanner(System.in);
        
        double saldo, deposito, retirada, novoSaldo;
        int acao;
        saldo = 10000;
        novoSaldo = 0;
        
        
        
        System.out.println("*****BANCO*****");
            System.out.println("1 Ver Saldo");
                System.out.println("2 Realizar Saque");
                    System.out.println("3 Realizar Depósito");
                        System.out.println("4 Sair");
            System.out.println("============================");
            System.out.println(" ");
            
            acao = 0;
            
        while(acao != 4){
            System.out.println("============================");
            System.out.println("Digite qualquer ação");
            acao = in.nextInt();
        if(acao == 1){
            System.out.println("O valor do seu saldo é de: "+saldo);
        }else if(acao == 2){
            System.out.println("Digite o valor do saque:");
            retirada = in.nextDouble();
            retirada = novoSaldo + retirada;
            saldo = saldo - retirada;
            System.out.println("O valor do saque foi de: R$" +retirada+" Saldo Atual R$"+saldo);
            
        }else if (acao == 3){
            System.out.println("Digite o valor do depósito:");
            deposito = in.nextDouble();
            deposito = novoSaldo + deposito;
            saldo = saldo + deposito;
            System.out.println("O valor do depósito foi de:R$ " +deposito+ " Saldo Atual: R$" +saldo);
        }else if (acao ==4){
            System.out.println("Saiu do Sistema");
        }else{
            System.out.println("Acao Inválida");
        }
    }
                
                    
    }
}
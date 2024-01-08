import java.util.Scanner;

public class mercadorias{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        
        double pasta = 27;
        int qtdCaneta = 380, qtdPasta = 210, qtdApontador = 108;
        
        String nome = "Felipe Gabriel";
        String endereco = "R.Bonifacio = Belchior = Gaspar";
        String tel = "(47)09928922";
        
        System.out.println("**********Produtos disponiveis***********");
            System.out.println(" ");
                System.out.println("1º Canetas");
                    System.out.println("2º Pasta acrilica");
                        System.out.println("3º Apontador");
                        System.out.println("-------------------------------");
        System.out.println("************Valores*************");
            System.out.println(" ");
                System.out.print("Qual o valor da caneta? :R$");
                double caneta = in.nextDouble();
                    System.out.println("Pasta acrilica 27R$");
                      System.out.print("Qual o valor do apontador? :R$");
                      double apontador = in.nextDouble();
                      
        System.out.println("************Qtd Comprada*************");
            System.out.println(" ");              
               System.out.println("Canetas: "+ qtdCaneta);
                    System.out.println("Pasta acrilica: "+qtdPasta);
                        System.out.println("Apontador: "+qtdApontador);
                        System.out.println("-------------------------------");
                        System.out.println(" ");
        
        System.out.println("O cliente " +nome+ " comprou os 3 produtos ganhando 11% de desconto da pasta");
        
        double vlrCaneta = qtdCaneta * caneta;
        double vlrpastaBruto = pasta *  qtdPasta;
        double vlrpastaLiq = vlrpastaBruto - (vlrpastaBruto * 0.11);
        double vlrApontador = apontador * qtdApontador;
        double total = vlrCaneta + vlrpastaLiq + vlrApontador;
        
        System.out.println("********** Relatório ***********");
        System.out.println(" ");
            System.out.println(nome);
            System.out.println(endereco);
            System.out.println(tel);
            System.out.println("Caneta: "+caneta);
            System.out.println("Apontador: "+apontador);
            System.out.println("Pasta: "+pasta);
            System.out.println("Caneta: "+vlrCaneta);
            System.out.println("Pasta acrilica: "+vlrpastaLiq);
            System.out.println("Com desconto a pasta foi de: " +vlrpastaBruto + " Para: " +vlrpastaLiq);
            System.out.println("Apontador: "+vlrApontador);
            System.out.println("O valor total gasto foi:R$ "+total);
            

    }
}
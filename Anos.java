import java.util.Scanner;

public class Anos{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        
        int i, anoNascimento, anoAtual, idade;
        
        System.out.println("Digite o ano do seu nascmimento: ");
        anoNascimento = in.nextInt();
        
        System.out.println("Digite o ano atual: ");
        anoAtual = in.nextInt();
        
        System.out.println("Linha do Tempo:");
        System.out.println("Ano - Idade:");
        
        for (i=anoNascimento, idade = 0; i<=anoAtual; i++, idade++){ 
            System.out.println(i + "-" + idade);
        }
    }
}
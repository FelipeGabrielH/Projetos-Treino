import java.util.Scanner;

public class NomeIdadeFor{
    public static void main(String args []){
        Scanner in = new Scanner(System.in);
        
        int idade, idadeMaisNova, i;
        String nome, nomeMaisNova;
        
        System.out.println("Digite o nome: ");
        nome = in.next(); in.nextLine();
        
        System.out.println("Digite a idade: ");
        idade = in.nextInt();
        
        idadeMaisNova = idade;
        nomeMaisNova= nome;
        
        for(i=1; i <=5; i++){
            System.out.println("Digite o nome: ");
            nome = in.next(); in.nextLine();
            
            System.out.println("Digite a idade: ");
            idade = in.nextInt();
            
            if(idade < idadeMaisNova){
            idade = idadeMaisNova;
            nome = nomeMaisNova;
        }
        }
        System.out.println("O nome é: " +nomeMaisNova+ " A idade é: "+idadeMaisNova);
    }
           
        
        
            }
        
    

import java.util.Scanner;

public class Cadastro{
    public static void main (String args[]){
        Scanner in = new Scanner (System.in);
        
        String codAluno;
        String nomAluno;
        Byte idadeAluno;
        Double valMensal;
        
        System.out.println("Digite o código do aluno:");
        codAluno = in.next(); in.nextLine();
        
        System.out.println("Digite o nome do aluno:");
        nomAluno = in.next(); in.nextLine();
        
        System.out.println("Digite a idade do Aluno:");
        idadeAluno = in.nextByte();
        
        System.out.println("Digite o valor da mensalidade:");
        valMensal = in.nextDouble();
        
        System.out.println("****** Cadastro do Aluno ******");
        System.out.println("\nCódigo: " +codAluno);
        System.out.println("Aluno: " +nomAluno);
        System.out.println("Idade: " +idadeAluno);
        System.out.println("\nValor da mensalidade:R$ " +valMensal);
        System.out.println("-----------------------------------------");
    }
}
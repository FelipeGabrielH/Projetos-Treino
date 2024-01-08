import java.util.Scanner;
public class Situacao{
    public static void main (String args []){
        Scanner in = new Scanner(System.in);
        
        double nota1;
        double nota2;
        double nota3;
        double nota4;
        double media;
        double frequencia;
        
        System.out.println("Digite a frequencia do aluno: ");
        frequencia = in.nextDouble();
        
        System.out.println("Digite a primeira nota :");
        nota1 = in.nextDouble();
        
        System.out.println("Digite a segunda nota :");
        nota2 = in.nextDouble();
        
        System.out.println("Digite a terceira nota :");
        nota3 = in.nextDouble();
        
        System.out.println("Digite a quarta nota :");
        nota4 = in.nextDouble();
        
        media = (nota1 + nota2 + nota3 +nota4)/4;
        
        System.out.println("A média do aluno é: " +media);
        
        if (media>=7 && media<=10 && frequencia >= 75 && frequencia <=100){
            System.out.println("Aprovado");
        }
        else if (media >=4 && media<7){
            System.out.println("Recuperação");
        }
        else if (media>=0 && media<4 || frequencia < 75 && frequencia <= 100){
            System.out.println("Reprovado por nota ou falta");
        }else{
            System.out.println("Média Inválida");
        }
        }
        }
    

import java.util.Scanner;

public class Adivinhacao{
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        
        String palavra;
        
        System.out.println("Responda a charada");
        System.out.println(" ");
        System.out.println("Oque é Oque é? quanto mais a gente tira mais a gente tem");
        palavra = in.next(); in.nextLine();
        
        System.out.println(" ");
        
        while (palavra.equals("fotografia") != true){
            System.out.println("Você errou!!! tente novamente");
            System.out.println("Responda a charada");
            System.out.println("Oque é Oque é? quanto mais a gente tira mais a gente tem");
            palavra = in.next() + in.nextLine(); 
            System.out.println(" ");
        }
        System.out.println("Parabéns!!! você acertou");
    }
}
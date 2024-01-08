import java.io.IOException;
import java.util.Scanner;
public class VogalExemploSw{
    public static void main(String args [])throws IOException{
        Scanner in = new Scanner(System.in);
        
        
        char ch;
        
        System.out.println("Digite uma letra");
        ch = (char)System.in.read();
        
        switch(ch){
            case 'a':
                System.out.println("Vogal");
            break;
            
            case 'e':
                System.out.println("Vogal");
            break;
                
            case 'i':
                System.out.println("Vogal");
            break;
            
            case 'o':
                System.out.println("Vogal");
            break;
            
            case 'A':
                System.out.println("Vogal");
            break;
            
            case 'E':
                System.out.println("Vogal");
            break;
            
            case 'I':
                System.out.println("Vogal");
            break;
            
            case 'O':
                System.out.println("Vogal");
            break;
            
            case 'U':
                System.out.println("Vogal");
            break;
            
            default:
                System.out.println("Consoante");
        }
        
    }
}
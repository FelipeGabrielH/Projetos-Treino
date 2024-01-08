import java.util.Scanner;

public class ParImparInc{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        
        int i, num1, num2;
        
        System.out.println("Digite até que número você quer ver");
        num1 = in.nextInt();
        
        
        for(i=1; i<=num1; i++){
            System.out.println("Digite um número ");
            num2 = in.nextInt();
            
            if(num2 % 2 == 0){
                System.out.println("O número é par ");
            }else{
                System.out.println("O número é impar ");
            }
            
        }
    }
}
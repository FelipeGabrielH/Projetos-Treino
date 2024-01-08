import java.util.Scanner;
public class Decrescente{
    public static void main(String args []){
        Scanner in = new Scanner(System.in);
        
        System.out.println("Cite o 1º número");
            double  num1 = in.nextDouble();
            
        System.out.println("Cite o 2º número");
            double num2 = in.nextDouble();
            
        System.out.println("Cite o 3º número");
            double num3 = in.nextDouble();
            
        //PROCESSOS
        
        if(num1 >= num2 && num2 >= num3){
            System.out.print(num1);
            System.out.print(num2);
            System.out.print(num3);
        }else if(num1 >= num3 && num3 >= num2){
            System.out.println(num1);
            System.out.println(num3);
            System.out.println(num2);
        }else if (num2 >= num3 && num3 >= num1){
            System.out.println(num2);
            System.out.println(num3);
            System.out.println(num1);
        }else if (num2 >= num1 && num1 >= num3){
            System.out.println(num2);
            System.out.println(num1);
            System.out.println(num3);
        }else if (num3>= num1 && num1>= num2){
            System.out.println(num3);
            System.out.println(num1);
            System.out.println(num2);
        }else{
        System.out.println(num3);
        System.out.println(num2);
        System.out.println(num1);
    }
}}
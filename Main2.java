import java.util.Scanner;
public class Main2{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        
        Tabuada t1 = new Tabuada();
        
        System.out.print("Informe um número inteiro para ver sua tabuada");
        t1.setValor(in.nextInt());
        
        for(int multiplicador=1; multiplicador<=10; multiplicador ++){
            System.out.println(t1.gerarTabuada(multiplicador));
        }
    }
}
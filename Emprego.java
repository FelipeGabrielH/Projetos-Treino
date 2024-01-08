import java.util.Scanner;
public class Emprego{
    public static void main(String args []){
        Scanner in = new Scanner(System.in);
        
        int i, qtdFunc, tempSer;
        String nome;
        
        System.out.println("Digite a quantidade de funcionários ");
        qtdFunc = in.nextInt();
        
        for(i = 1; i<= qtdFunc; i++){
            System.out.println("Digite o nome do funcionario: ");
            nome = in.next(); in.nextLine();
            
            System.out.println("Digite a quantidade de meses de serviço :");
            tempSer = in.nextInt();
            
            if(tempSer >= 12){
                System.out.println(nome+" Tem Direito A Férias");
            }else{
                System.out.println(nome+" Não Tem Direito A Férias");
            }
        }
    }
}
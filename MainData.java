import java.util.Scanner;
public class MainData{
    public static void main(String args []){
        Scanner ler = new Scanner(System.in);
        Data d1 = new Data();
        
        System.out.print("Informe o dia: ");
            d1.setDia(ler.nextInt());
        System.out.print("Informe o mes: ");
            d1.setMes(ler.nextInt());
        System.out.print("Informe o ano: ");
            d1.setAno(ler.nextInt());
        System.out.print("Visualizando a data: ");
            System.out.println(d1);
    }
}
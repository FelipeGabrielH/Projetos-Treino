import java.util.Scanner;
public class MainTelefone{
    public static void main(String args []){
        Scanner in = new Scanner(System.in);
        Telefone t1 = new Telefone();
        
        System.out.print("Informe o dia: ");
            t1.setDia(in.nextInt());
        System.out.print("Informe o mes: ");
            t1.setMes(in.nextInt());
        System.out.print("Informe o ano: ");
            t1.setAno(in.nextInt());
        System.out.print("Informe o ddd: ");
            t1.setDdd(in.nextInt());
        System.out.print("Informe a PRIMEIRA parte do telefone: ");
            t1.setTelefonef(in.nextInt());
        System.out.print("Informe a SEGUNDA parte do telefone: ");
            t1.setTelefonef2(in.nextInt());
        System.out.println(t1);
    }
}
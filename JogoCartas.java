import java.util.Scanner;
public class JogoCartas{
    public static void main(String args []){
        Scanner in = new Scanner(System.in);
        
        int maquina, usuario, cartas, jogar;
        
        usuario = (int)(Math.random()*12+1);
        maquina = (int)(Math.random()*12+1);
        
    
        jogar = 0;
        
        while(jogar != 2){
            System.out.println("\n=======MAIOR OU MENOR======");
            System.out.println("Deseja jogar?");
            System.out.println("1- SIM");
            System.out.println("2- NÃO");
            
            jogar = in.nextInt();
            usuario = (int)(Math.random()*12+1);
            maquina = (int)(Math.random()*12+1);
        switch(jogar){
            case 1:
                System.out.println("\nNúmero do usuario "+ usuario);
                System.out.println("\nNúmero da maquina "+ maquina);
                if(usuario > maquina){
                    System.out.println("\nUsuario Ganhou");
                }else if(usuario < maquina){
                    System.out.println("\nMaquinha Ganhou");
                }else{
                    System.out.println("\nEMPATE");
                }
            break;
                default:
                System.out.println("\nOk...");
        }
        }
        
        
        
        

    }
}
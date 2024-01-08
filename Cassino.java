import java.util.Scanner;

public class Cassino{
    public static void main(String args []){
        Scanner in = new Scanner(System.in);
        
        int jogar, numero, humano, casa, aposta;
        jogar = 0;
        
        while(jogar !=2){
            System.out.println("=====CASSINO=====");
            System.out.println("Quer jogar?");
            System.out.println("1-SIM");
            System.out.println("2-NAO");
            jogar = in.nextInt();
            casa = (int)(Math.random()*24+1);
            switch(jogar){
                case 1:
                    System.out.println("Escolha um número");
                    humano = in.nextInt();
                    System.out.println("Digite o valor da aposta");
                    aposta = in.nextInt();
                System.out.println("\nValor aposta R$:"+aposta);
                System.out.println("\nNúmero do usuario "+humano);
                System.out.println("\nNúmero do casa "+casa);
                
                if(casa % 2 == 0){
                    System.out.println("PAR");
                    if(humano % 2 ==0){
                        System.out.println("\nVoce Ganhou Por Seu Número Ser Par");
                    }else if (humano % 2 != 0){
                        System.out.println("\nVoce Perdeu Por Seu Número Ser Par");
                    }else{
                        System.out.println("\nEMPATE");
                    }
                }else if(casa % 2 != 0){
                    System.out.println("IMPAR");
                    if(humano % 2 == 0){
                        System.out.println("\nVoce Perde Por Seu Número Ser Impar");
                    }else if (humano %2  != 0){
                        System.out.println("\nVoce Ganhou Por Seu Número Ser Impar");
                    }else{
                        System.out.println("\nEMPATE");
                    }
                }
                default:
                    System.out.println("SAINDO....");
                }
            }
        }
    }

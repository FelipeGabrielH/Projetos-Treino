public class EncadeadoSw{
    public static void main(String args []){
        char ramo = 'C';
        int anoDaFaculdade = 4;
        
        switch(anoDaFaculdade){
            case 1:
                System.out.println("Inglês, Matematica, Ciencia");
            break;
            
            case 2:
                switch(ramo){
                    case 'C':
                        System.out.println("Sistemas Operacionais, Java, Estrutura de Dados");
                    break;
                    
                    case 'E':
                        System.out.println("Micro processadores, Teoria da Lógica de Programação");
                    break;
                    
                    case 'M':
                        System.out.println("Desenho, Máquinas de Fabricação");
                    break;
                }
            break;
            
            case 3:
                switch(ramo){
                    case 'C':
                        System.out.println("Organização Computacional, Multimédia");
                    break;
                    
                    case 'E':
                        System.out.println("Fundamentos de Lógica de Design, Microeletrônicos");
                    break;
                    
                    case 'M':
                        System.out.println("Motores de Combustão Interna, Vibração Mecânica");
                    break;
                }
            break;
            
            case 4:
                switch(ramo){
                    case 'C':
                        System.out.println("Comunicação de dados e redes, Multimédia");
                    break;
                    
                    case 'E':
                        System.out.println("Sistemas Embarcados, Processamento de Imagem");
                    break;
                    
                    case 'M':
                        System.out.println("Produção Tecnológica, Energia Térmica");
                    break;
                }
            break;
        }
    }
}
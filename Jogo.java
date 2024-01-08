public class Jogo{
    private Jokenpo usuario;
    private Jokenpo computador;
    
    public Jogo(byte jogadaUsuario){
        this.usuario = new Jokenpo(jogadaUsuario);
        byte sorteio = (byte)(Math.random()*3+1);
        this.computador = new Jokenpo(sorteio);
    }
    public String verificarVencedor(){
        byte usu = this.usuario.getJogada();
        byte comp = this.computador.getJogada();
        if(usu == comp){
            return "Empate";
        }else if(usu == 1 && comp == 3 || usu == 2 && comp == 1 || usu == 3 && comp == 2  ){
            return "Usuario Vence !!";
        }else {
            return "Computador Vence !!";
        }

}
public String toString(){
    return"Usuário jogou " + this.usuario +"\nComputador jogou " + this.computador;
}
}    
    
public class Telefone{
    private int dia;
    private int mes;
    private int ano;
    private int telefone1;
    private int telefone2;
    private int ddd;
    
    public void setDia(int dia){
        this.dia = dia;
    }
    public void setMes(int mes){
        this.mes = mes;
    }
    public void setAno(int ano){
        this.ano = ano;
    }
    public void setTelefonef(int telefone1){
        this.telefone1 = telefone1;
    }
    public void setTelefonef2(int telefone2){
        this.telefone2 = telefone2;
    }
    public void setDdd(int ddd){
        this.ddd = ddd;
    }
    public int getDia(){
        return this.dia;
    }
    public int getMes(){
        return this.mes;
    }
    public int getAno(){
        return this.ano;
    }
    public int getTelefone(){
        return this.telefone1;
    }
    public int getTelefonef1(){
        return this.telefone2;
    }
    public int getDdd(){
        return this.ddd;
    }
    public String toString(){
        return "\n"+ "DATA: "+ this.dia + "/" + this.mes + "/" + this.ano + "\n"+"TELEFONE: "+ "("+this.ddd+")"+this.telefone1+"-"+this.telefone2; 
    }
}
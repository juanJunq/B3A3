package Q2;

public class Moto extends Automovel {
    private boolean partidaEletrica;
    public Moto(boolean partidaEletrica){
        this.partidaEletrica = partidaEletrica;
    }
    public Moto(){}
    public void setpartidaEletrica(boolean partidaEletrica){
        this.partidaEletrica = partidaEletrica;
    }
    public boolean getPartidaEletrica(){
        return this.partidaEletrica;
    }
    public void imprimirinformacoes(){
        System.out.println(this.partidaEletrica);
    }
}

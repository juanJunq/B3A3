package Q2;

public class Carro extends Automovel {
    private int qtdPortas;
    public Carro(int qtdPortas){
        this.qtdPortas = qtdPortas;
    }
    public Carro(){}
    public void setQtdPortas(int qtdPortas){
        this.qtdPortas = qtdPortas;
    }
    public int getQtdPortas(){
        return this.qtdPortas;
    }
    public void imprimirinformacoes(){
        System.out.println(this.qtdPortas);
    }
}

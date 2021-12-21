package Q2;

class Bicicleta extends Veiculo{
    private int numMarchas;
    private boolean bagageiro;
    public Bicicleta(int numMarchas, boolean bagageiro){
        this.numMarchas = numMarchas;
        this.bagageiro = bagageiro;
    }
    public Bicicleta(){
    }
    public void setNumMarchas(int numMarchas){
        this.numMarchas = numMarchas;
    }
    public int getNumMarchas(){
        return this.numMarchas;
    }
    public void setBagageiro(boolean bagageiro){
        this.bagageiro = bagageiro;
    }
    public boolean getBagageiro(){
        return this.bagageiro;
    }
    public void imprimirinformacoes(){
        System.out.println(this.numMarchas);
        System.out.println(this.bagageiro);
    }
}

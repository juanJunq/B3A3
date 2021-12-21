package Q2;

class Veiculo{
    private String marca;
    private int qtdRodas;
    private String modelo;
    private int velocidade;
    public Veiculo(String marca, int qtdRodas, String modelo, int velocidade){
        this.marca = marca;
        this.qtdRodas = qtdRodas;
        this.modelo = modelo;
        this.velocidade = velocidade;
    }
    public Veiculo(){
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public String getMarca(){
        return this.marca;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public String getModelo(){
        return this.modelo;
    }
    public void setQtdRodas(int qtdRodas){
        this.qtdRodas = qtdRodas;
    }
    public int getQtdRodas(){
        return this.qtdRodas;
    }
    public void setVelocidade(int velocidade){
        this.velocidade = velocidade;
    }
    public int getVelocidade(){
        return this.velocidade;
    }
    public void imprimirinformacoes(){
        System.out.println(this.marca);
        System.out.println(this.modelo);
        System.out.println(this.qtdRodas);
        System.out.println(this.velocidade);
    }
    public void acelerar(int valor){
        this.velocidade += valor;
    }
    public void frear(int valor){
        this.velocidade -= valor;
    }
}








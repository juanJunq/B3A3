package Q2;

class Automovel extends Veiculo{
    private double potenciaDoMotor;
    public Automovel(double potenciaDoMotor){
        this.potenciaDoMotor = potenciaDoMotor;
    }
    public Automovel(){}
    public void setPotenciaDoMotor(double potenciaDoMotor){
        this.potenciaDoMotor = potenciaDoMotor;
    }
    public double getPotenciaDoMotor(){
        return this.potenciaDoMotor;
    }
    public void imprimirinformacoes(){
        System.out.println(this.potenciaDoMotor);
    }
}
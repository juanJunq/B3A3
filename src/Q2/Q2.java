package Q2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2 {
    public static void main(String args[]) throws IOException{
        FileInputStream File = new FileInputStream("C:/Java/File/Arquivo.txt");
        InputStreamReader InputSR = new InputStreamReader(File);
        BufferedReader BufferR = new BufferedReader(InputSR);
        String marca = "";
        String modelo = "";
        int qtdRodas = 0; 
        int velocidade = 0;
        int numMarchas = 0;
        int qtdPortas = 0;
        double potenciaDoMotor = 0.0;
        boolean bagageiro = false;
        boolean partidaEletrica = false;
        Veiculo veiculo = new Veiculo(marca, qtdRodas, modelo, velocidade);
        Bicicleta bicicleta = new Bicicleta(numMarchas, bagageiro);
        Automovel automovel = new Automovel(potenciaDoMotor);
        Moto moto = new Moto(partidaEletrica);
        Carro carro = new Carro(qtdPortas);
    } 
}

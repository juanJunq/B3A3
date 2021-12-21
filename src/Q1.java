import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

class Pessoa{
    private String nome;
    private String mae;
    private String pai;
    public Pessoa(String nome, String mae, String pai){
        this.nome = nome;
        this.mae = mae;
        this.pai = pai;
    }
    public Pessoa(){
    }
    public Pessoa(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    public void SetNome(String nome){
		this.nome = nome;
	}
    public String getMae(){
        return this.mae;
    }
    public void SetMae(String nome){
		this.mae = nome;
	}
    public String getPai(){
        return this.pai;
    }
    public void SetPai(String nome){
		this.pai = nome;
	}
}


public class Q1 {
    static void Irmaos(Pessoa pessoa, Pessoa pessoa2){
        if(pessoa.getPai().equals(pessoa2.getPai()) || pessoa.getMae().equals(pessoa2.getMae())){
            System.out.println("Eles são irmãos.");
        }else System.out.println("Eles não são irmãos.");
    }
    static void Antecessor(Pessoa pessoa, Pessoa pessoa2){
        if(pessoa.getPai().equals(pessoa2.getNome()) || pessoa.getMae().equals(pessoa2.getNome())){
            System.out.printf("%s%s%n", pessoa2.getNome(), " é pai ou mãe de ", pessoa.getNome());
        }else System.out.printf("%s%s%s%n", pessoa2.getNome(), " não é pai ou mãe de ", pessoa.getNome());
        if(pessoa2.getPai().equals(pessoa.getNome()) || pessoa2.getMae().equals(pessoa.getNome())){
            System.out.printf("%s%s%s%n", pessoa.getNome(), " é pai ou mãe de ", pessoa2.getNome());
        }else System.out.printf("%s%s%s%n", pessoa.getNome(), " não é pai ou mãe de ", pessoa2.getNome());
    }
    public static void main(String args[]) throws IOException{
        FileInputStream File = new FileInputStream("C:/Java/File/Arquivo.txt");
        InputStreamReader InputSR = new InputStreamReader(File);
        BufferedReader BufferR = new BufferedReader(InputSR);
        FileInputStream File2 = new FileInputStream("C:/Java/File/Verifica.txt");
        InputStreamReader InputSR2 = new InputStreamReader(File2);
        BufferedReader BufferR2 = new BufferedReader(InputSR2);
        String nome = "";
        String mae = "";
        String pai = "";
        Pessoa pessoa = new Pessoa(nome, mae, pai); 
        pessoa.SetNome(BufferR.readLine());
        pessoa.SetPai(BufferR.readLine());
        pessoa.SetMae(BufferR.readLine());
        Pessoa pessoa2 = new Pessoa(nome, mae, pai); 
        pessoa2.SetNome(BufferR2.readLine());
        pessoa2.SetPai(BufferR2.readLine());
        pessoa2.SetMae(BufferR2.readLine());
        Irmaos(pessoa, pessoa2);
        Antecessor(pessoa, pessoa2);
        BufferR.close();
        BufferR2.close();
    }
}

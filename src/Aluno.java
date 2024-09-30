
import java.awt.Color;

public class Aluno {
    private String nome;
    private int idade;
    private Color color;

    public String getNome(){
        return nome;
    }

    public void setNome(String newNome){
        nome = newNome;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int newIdade){
        this.idade = newIdade;
    }

    public Color getColor(){
        return color;
    }

    public void setColor(Color newColor){
        color = newColor;
    }

}

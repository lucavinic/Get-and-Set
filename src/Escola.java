
import java.awt.Color;

public class Escola {
    public static void main(String[] args) {
        Aluno lucas = new Aluno();

        lucas.setNome("Lucas");
        lucas.setIdade(22);
        lucas.setColor(Color.BLACK);

        System.out.println("O aluno " + lucas.getNome() + " tem " + lucas.getIdade() + " anos.");
    }
}

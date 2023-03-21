import java.util.ArrayList;
import java.util.List;

public class App {
  public static void main(String[] args) throws Exception {
    List<Exercicio> exercicios = new ArrayList<>();
    exercicios.add(new Exercicio("Enunciado 1", "Resolução 1"));
    exercicios.add(new Exercicio("Enunciado 2", "Resolução 2"));
    
    Disciplina disciplina = new Disciplina("Cálculo 1", exercicios);
    
    System.out.println("Disciplina: " + disciplina.getNome());
    System.out.println("Exercícios:");
    for (Exercicio exercicio : disciplina.getExercicios()) {
      System.out.println(exercicio.getEnunciado() + ": " + exercicio.getResolucao());
    }
  }
}

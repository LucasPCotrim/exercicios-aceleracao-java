import java.util.List;

public class Disciplina {
  private String nome;
    private List<Exercicio> exercicios;
    
    public Disciplina(String nome, List<Exercicio> exercicios) {
        this.nome = nome;
        this.exercicios = exercicios;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public List<Exercicio> getExercicios() {
        return exercicios;
    }
    
    public void setExercicios(List<Exercicio> exercicios) {
        this.exercicios = exercicios;
    }
}

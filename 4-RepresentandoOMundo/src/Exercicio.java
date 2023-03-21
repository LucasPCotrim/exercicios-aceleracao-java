public class Exercicio {
  private String enunciado;
    private String resolucao;
    
    public Exercicio(String enunciado, String resolucao) {
        this.enunciado = enunciado;
        this.resolucao = resolucao;
    }
    
    public String getEnunciado() {
        return enunciado;
    }
    
    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }
    
    public String getResolucao() {
        return resolucao;
    }
    
    public void setResolucao(String resolucao) {
        this.resolucao = resolucao;
    }
}

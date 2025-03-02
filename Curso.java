package atividadediagnostica;

public class Curso {
    //Atributos
    public String nome;
    public int qtd_semestres;
    public Professor coordenador;

    //construtor
    public Curso(String nome, int qtd_semestres, Professor coordenador){
        this.nome = nome;
        this.qtd_semestres = qtd_semestres;
        this.coordenador = coordenador;
    }
    
    //Getter e Setter
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getQtd_semestres() {
        return qtd_semestres;
    }
    public void setQtd_semestres(int qtd_semestres) {
        this.qtd_semestres = qtd_semestres;
    }
    
    public Professor getCoordenador() {
        return coordenador;
    }
    public void setCoordenador(Professor coordenador) {
        this.coordenador = coordenador;
    }
}

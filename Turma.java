package atividadediagnostica;

import java.util.ArrayList;
import java.util.List;

public class Turma {
    //Atributos
    public String id_turma;
    public int semestre;
    public Curso curso;
    public Professor professor;
    public List<Estudante> lista_estudantes;

    //Construtor
    public Turma(String id_turma){
        this.id_turma = id_turma;
        this.lista_estudantes = new ArrayList<>();
    }
    
    //Getter e Setter
    public String getId_turma() {
        return id_turma;
    }
    public void setId_turma(String id_turma) {
        this.id_turma = id_turma;
    }

    public int getSemestre() {
        return semestre;
    }
    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
    
    public Curso getCurso() {
        return curso;
    }
    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Professor getProfessor() {
        return professor;
    }
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    
    public void adicionarEstudante(Estudante estudante) {
        this.lista_estudantes.add(estudante);
    }
    
     public void exibirTurma() {
        System.out.println("-{ TURMA - " + id_turma + "}---------------------------------");
        System.out.println("INFORMACOES:");
        System.out.println("|Curso: " + curso.getNome());
        System.out.println("|Semestre: " + semestre);
        System.out.println("|Professor: " + professor.getNome());
        System.out.println("");
        System.out.println("DADOS DOS ESTUDANTES: ");
        for (Estudante e : lista_estudantes) {
            e.exibirDados();    
        }
        System.out.println();
    }
}

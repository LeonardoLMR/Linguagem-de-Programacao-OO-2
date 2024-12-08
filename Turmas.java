package atividadediagnostica;

import java.util.ArrayList;

public class Turmas {
    //Atributos
    public String id_turma;
    public int semestre;
    Cursos curso = new Cursos();
    Professores prof = new Professores();
    public ArrayList<String> lista_estudantes = new ArrayList();

    //Construtors
    public void Turmas(){
    }
    public void Turmas(String id_turma){
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
    
    public ArrayList<String> getLista_estudantes() {
        return lista_estudantes;
    }
    public void setLista_estudantes(ArrayList<String> lista_estudantes) {
        this.lista_estudantes = lista_estudantes;
    }
    
}

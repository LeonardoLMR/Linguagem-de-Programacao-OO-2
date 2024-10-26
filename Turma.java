package Atividade1;

import java.util.ArrayList;

public class Turma {
    ArrayList<String> idTurmas = new ArrayList();
    ArrayList<String> cursos = new ArrayList();
    ArrayList<Integer> semestres = new ArrayList();
    public String professorList;
    ArrayList<String> estudantesList =  new ArrayList();

    public String getProfessorList() {
        return professorList;
    }
    public void setProfessorList(String professorList) {
        this.professorList = professorList;
    }

    public ArrayList<String> getEstudantesList() {
        return estudantesList;
    }
    public void setEstudantesList(ArrayList<String> estudantesList) {
        this.estudantesList = estudantesList;
    }
    
    public ArrayList<String> getIdTurmas() {
        return idTurmas;
    }

    public void setIdTurmas(ArrayList<String> idTurmas) {
        this.idTurmas = idTurmas;
    }

    public ArrayList<String> getCursos() {
        return cursos;
    }

    public void setCursos(ArrayList<String> cursos) {
        this.cursos = cursos;
    }

    public ArrayList<Integer> getSemestres() {
        return semestres;
    }

    public void setSemestres(ArrayList<Integer> semestres) {
        this.semestres = semestres;
    }

    
    public void Turma(String idTurma, String curso, int semestre, String professorList, String estudantesList) {
        this.idTurmas.add(idTurma);
        this.cursos.add(curso);
        this.semestres.add(semestre);
        this.professorList = professorList;
        this.estudantesList.add(estudantesList);
    }

}
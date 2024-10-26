package Atividade1;

import java.util.ArrayList;

public class Curso {
    ArrayList<String> nomeCursos = new ArrayList();
    ArrayList<Integer> numSemestres = new ArrayList();

    
    public ArrayList<String> getNomeCursos() {
        return nomeCursos;
    }

    public void setNomeCursos(ArrayList<String> nomeCursos) {
        this.nomeCursos = nomeCursos;
    }

    public ArrayList<Integer> getNumSemestres() {
        return numSemestres;
    }

    public void setNumSemestres(ArrayList<Integer> numSemestres) {
        this.numSemestres = numSemestres;
    }

    
    public void Curso(String nomeCurso, int numSemestre) {
        this.nomeCursos.add(nomeCurso);
        this.numSemestres.add(numSemestre);
    }
}

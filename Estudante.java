package Atividade1;

import java.util.ArrayList;

public class Estudante extends Pessoa {
    ArrayList<String> matriculas = new ArrayList();
    ArrayList<String> cursos = new ArrayList();

    public ArrayList<String> getMatriculas() {
        return matriculas;
    }

    public void setMatriculas(ArrayList<String> matriculas) {
        this.matriculas = matriculas;
    }

    public ArrayList<String> getCursos() {
        return cursos;
    }

    public void setCursos(ArrayList<String> cursos) {
        this.cursos = cursos;
    }

    public Estudante(String nomes, String cpfs, String enderecos, String telefones) {
        super(nomes, cpfs, enderecos, telefones);
    }
    
    public static void ImprimirTabela(){
        System.out.println("Professor(a): ");
        System.out.println("CPF: ");
        System.out.println("Rua: ");
        System.out.println("Bairro: ");
        System.out.println("Telefone: ");
        System.out.println("Matricula: ");
        System.out.println("Curso: ");
    }
}

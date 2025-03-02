package atividadediagnostica;

import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;


public class Estudante extends Pessoa {
    // Atributos
    public String matricula;
    public Curso curso;
    public List<Nota> notas = new ArrayList<>(); // Inicialize a lista

    // Construtor
    public Estudante(String nome, String cpf, String endereco, String telefone, String matricula, Curso curso) {
        super(nome, cpf, endereco, telefone);
        this.matricula = matricula;
        this.curso = curso;
    }

    // Getter e Setter
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Curso getCurso() {
        return curso;
    }
    public void setCurso(Curso curso) {
        this.curso = curso;
    }
    

    public List<Nota> getNotas() {
        return notas;
    }

    @Override
    public void exibirDados() {
        System.out.println("|Estudante: " + getNome());
        System.out.println("|CPF: " + getCpf());
        System.out.println("|Endereco: " + getEndereco());
        System.out.println("|Telefone: " + getTelefone());
        System.out.println("|Matricula: " + getMatricula());
        System.out.println("|Curso: " + curso.getNome());
        System.out.println("");
    }

    public void estudanteNota() {
        if (notas != null && !notas.isEmpty()) {
            // Exibe apenas a última nota
            Nota ultimaNota = notas.get(notas.size() - 1); // Pega a última nota
            ultimaNota.exibirDados(); // Exibe os dados da última nota
        } else {
            System.out.println(getNome() + ": Nenhuma nota registrada.");
        }
    }

    public void adicionarNotas(Nota nota) {
        this.notas.add(nota);
    }
    
}

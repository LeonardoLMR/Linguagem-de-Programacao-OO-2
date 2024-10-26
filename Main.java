package Atividade1;

import java.util.Scanner;

public class Main {
    public int Estudantes;
    public int Professores;
    public int Turmas;
    public int Cursos;

    public void Main(){
    }
    
    public int getCursos() {
        return Cursos;
    }
    public void setCursos(int Cursos) {
        this.Cursos = Cursos;
    }

    public int getEstudantes() {
        return Estudantes;
    }
    public void setEstudantes(int Estudantes) {
        this.Estudantes = Estudantes;
    }

    public int getProfessores() {
        return Professores;
    }
    public void setProfessores(int Professores) {
        this.Professores = Professores;
    }

    public int getTurmas() {
        return Turmas;
    }
    public void setTurmas(int Turmas) {
        this.Turmas = Turmas;
    }
    
    public static void Cadastrar(){
        Scanner entrada = new Scanner(System.in);
        Curso curso = new Curso();
        Estudante estudante = new Estudante("Nome", "Cpf", "endereço", "telefone");
        Professores professores = new Professores("Nome", "Cpf", "endereço", "telefone");
        Turma turma = new Turma();
        
        //-----------------------------------------------------------------
        System.out.println("Digite a quantidade de cursos: ");
        int Cursos = entrada.nextInt();
        entrada.nextLine();
        
        for(int i=0; i<Cursos; i++){
            System.out.println("Informe o Nome do Curso "+(i+1)+": ");
            curso.nomeCursos.add(entrada.nextLine());
            System.out.println("Informe o Semestre do Curso "+(i+1)+": ");
            curso.numSemestres.add(entrada.nextInt());
            entrada.nextLine();
        }
        //-----------------------------------------------------------------
        System.out.println("Digite a quantidade de turmas: ");
        int Turmas = entrada.nextInt();
        entrada.nextLine();
    
        for(int i=0; i<Turmas; i++){
            System.out.println("Informe o Id da turma "+(i+1)+": ");
            turma.idTurmas.add(entrada.nextLine());
            System.out.println("Informe o Nome do Curso da turma "+(i+1)+": ");
            turma.cursos.add(entrada.nextLine());
            System.out.println("Informe o Semestre da turma "+(i+1)+": ");
            turma.semestres.add(entrada.nextInt());
            entrada.nextLine();
        }
        //-----------------------------------------------------------------
        System.out.println("Digite a quantidade de estudantes: ");
        int Estudantes = entrada.nextInt();
        entrada.nextLine();
        
        for(int i=0; i<Estudantes; i++){
            System.out.println("Informe o Nome do Estudante "+(i+1)+": ");
            estudante.nomes.add(entrada.nextLine());
            System.out.println("Informe o CPF do Estudante "+(i+1)+": ");
            estudante.cpfs.add(entrada.nextLine());
            System.out.println("Informe o Endereço do Estudante "+(i+1)+": ");
            estudante.enderecos.add(entrada.nextLine());
            System.out.println("Informe o Telefone do Estudante "+(i+1)+": ");
            estudante.telefones.add(entrada.nextLine());
            System.out.println("Informe a Matricula do Estudante "+(i+1)+": ");
            estudante.matriculas.add(entrada.nextLine());
        }
        //-----------------------------------------------------------------
        System.out.println("Digite a quantidade de professores: ");
        int Professores = entrada.nextInt();
        entrada.nextLine();
        
        for(int i=0; i<Professores; i++){
            System.out.println("Informe o Nome do Professor "+(i+1)+": ");
            professores.nomes.add(entrada.nextLine());
            System.out.println("Informe o CPF do Professor "+(i+1)+": ");
            professores.cpfs.add(entrada.nextLine());
            System.out.println("Informe o Endereço do Professor "+(i+1)+": ");
            professores.enderecos.add(entrada.nextLine());
            System.out.println("Informe o Telefone do Professor "+(i+1)+": ");
            professores.telefones.add(entrada.nextLine());
            System.out.println("Informe o SIAPE do Professor "+(i+1)+": ");
            professores.SIAPE.add(entrada.nextInt());
            entrada.nextLine();
        }
        
    }
}

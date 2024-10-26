package Atividade1;

import java.util.Scanner;

public class Main {
    public int Estudantes;
    public int Professores;
    public int Turmas;
    
    public void Main(){
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
        System.out.println("Digite a quantidade de turmas: ");
        int Turmas = entrada.nextInt();
        
        System.out.println("Digite a quantidade de estudantes: ");
        int Estudantes = entrada.nextInt();
        
        for(int i=0; i<Estudantes; i++){
            System.out.println("Informe a turma do Estudante "+(i+1)+": ");
        }
        
        System.out.println("Digite a quantidade de professores: ");
        int Professores = entrada.nextInt();
        
        for(int i=0; i<Professores; i++){
            System.out.println("Informe a turma do Professor "+(i+1)+": ");
        }
        
    }
}

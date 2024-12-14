package atividadediagnostica;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main { 
    //Professor e Estudante
    public ArrayList<Integer> profissao = new ArrayList(); //0 = Estudante, 1 = Professor
    public ArrayList<String> nome = new ArrayList();
    public ArrayList<String> cpf = new ArrayList();
    public ArrayList<String> endereco = new ArrayList();
    public ArrayList<String> telefone = new ArrayList();
    //Professor
    public ArrayList<Integer> SIAPE = new ArrayList();
    //Estudante
    public ArrayList<String> matricula = new ArrayList();
    public ArrayList<Integer> estudante_turma = new ArrayList();
    //Curso
    public ArrayList<String> nome_Curso = new ArrayList();
    public ArrayList<String> qtd_semestres = new ArrayList();
    //Turma
    public ArrayList<String> id_turma = new ArrayList();
    public ArrayList<Integer> semestre = new ArrayList();
    public ArrayList<String> professor = new ArrayList();
    
    
    //Método CadastrarProfessor
    public void cadastrarProfessor() throws IOException{
        boolean existe = false;
        Scanner entrada =  new Scanner(System.in);
        
        System.out.println("Quantos professores deseja cadastrar? ");
        int qdt = entrada.nextInt();
        
        
        for(int i=0; i<qdt; i++){
            entrada.nextLine();
            System.out.println("DADOS PROFESSOR " + (i+1));
            System.out.println("Nome: "); 
            String nome_a = entrada.nextLine(); nome.add(nome_a);
            while(existe == false){
                System.out.println("CPF: ");
                String cpf_a = entrada.nextLine(); 
                if(cpf.contains(cpf_a)){
                    System.out.println("Esse CPF já existe dentro do sistema... Digite novamente...");
                }else{
                    cpf.add(cpf_a);
                    professor.add("Sem Professor");
                    estudante_turma.add(0);
                    existe = true;
                }
            }
            System.out.println("Endereco: ");
            String end = entrada.nextLine(); endereco.add(end);
            System.out.println("Telefone: ");
            String tel = entrada.nextLine(); telefone.add(tel);
            System.out.println("SIAPE: ");
            int Sia = entrada.nextInt(); SIAPE.add(Sia);
            entrada.nextLine();
            matricula.add("0");
            profissao.add(1);
            existe = false;
        }
        System.out.println("Cadastro realizado com sucesso!");
        System.out.println("Pressione Qualquer Tecla para continuar...");
        System.in.read();
    }
    //Método CadastrarEstudante
    public void cadastrarEstudante() throws IOException{
        boolean existe = false;
        Scanner entrada =  new Scanner(System.in);
        
        System.out.println("Quantos estudantes deseja cadastrar? ");
        int qdt = entrada.nextInt();
        
        for(int i=0; i<qdt; i++){
            entrada.nextLine();
            System.out.println("DADOS ESTUDANTE " + (i+1));
            System.out.println("Nome: ");
            String nome_a = entrada.nextLine(); nome.add(nome_a);
            while(existe == false){
                System.out.println("CPF: ");
                String cpf_a = entrada.nextLine(); 
                if(cpf.contains(cpf_a)){
                    System.out.println("Esse CPF já existe dentro do sistema... Digite novamente...");
                }else{
                    cpf.add(cpf_a);
                    estudante_turma.add(0);
                    existe = true;
                }
            }
            System.out.println("Endereco: ");
            String end = entrada.nextLine(); endereco.add(end);
            System.out.println("Telefone: ");
            String tel = entrada.nextLine(); telefone.add(tel);
            System.out.println("Matricula: ");
            String mat = entrada.nextLine(); matricula.add(mat);
            SIAPE.add(0);
            profissao.add(0);
            existe = false;
        }
        System.out.println("Cadastro realizado com sucesso!");
        System.out.println("Pressione Qualquer Tecla para continuar...");
        System.in.read();
    }
    //Método CadastrarTurma
    public void cadastrarTurma() throws IOException{
        boolean existe = false;
        Scanner entrada =  new Scanner(System.in);
        
        System.out.println("Quantos turmas deseja cadastrar? ");
        int qdt = entrada.nextInt();
        
        for(int i=0; i<qdt; i++){
            entrada.nextLine();
            System.out.println("DADOS TURMA " + (i+1));
            while(existe == false){
                System.out.println("Numero da turma: ");
                String id = entrada.nextLine(); id_turma.add(id);
                if(id_turma.contains(id)){
                    System.out.println("Esse numero de turma já existe dentro do sistema... Digite novamente...");
                }else{
                    id_turma.add(id);
                    existe = true;
                }
            }
            System.out.println("Semestre da turma: ");
            int sem = entrada.nextInt(); semestre.add(sem);
            existe = false;
        }
        System.out.println("Cadastro realizado com sucesso!");
        System.out.println("Pressione Qualquer Tecla para continuar...");
        System.in.read();
    }
    //Método VincularProfessor
    public void vincularProfessor(){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Informe o numero da turma onde deseja adicionar um professor: ");
        String numturma = entrada.nextLine();
        if(id_turma.contains(numturma)){
            int indiceturma = id_turma.indexOf(numturma);
            System.out.println("Turma encontrada!");
            System.out.println("Digite o cpf do professor que deseja adicionar: ");
            String idcpf = entrada.nextLine();
            if(cpf.contains(idcpf)){
                 professor.set(indiceturma, idcpf);
                 System.out.println("Professor adicionado com sucesso!");
            }else{
                System.out.println("Esse professor nao existe no sistema...");
            }
        }else{
            System.out.println("Essa turma nao existe...");
        }
    }
    //Método VincularEstudante
    public void vincularEstudante(){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Informe o numero da turma onde deseja cadastrar o estudante: ");
        String numturma = entrada.nextLine();
        if(id_turma.contains(numturma)){
            int indiceturma = id_turma.indexOf(numturma);
            System.out.println("Turma encontrada!");
            System.out.println("Digite o cpf do estudante que deseja adicionar: ");
            String idcpf = entrada.nextLine();
            if(cpf.contains(idcpf)){
                int indice_estudante = cpf.indexOf(idcpf);
                estudante_turma.set(indice_estudante ,indiceturma);
            }else{
                System.out.println("Esse estudante nao existe no sistema...");
            }
        }else{
            System.out.println("Essa turma nao existe...");
        }
    }
    //Método ExibirDados
    public void exibirDados(){
        Scanner entrada  = new Scanner(System.in);
        
        System.out.println("Digite o numero da turma que deseja exibir os dados:");
        String numturma = entrada.nextLine();
        if(id_turma.contains(numturma)){
            System.out.println("DADOS DA TURMA " + numturma);
            System.out.println("Professor: ");
            System.out.println("Estudantes: ");
            
        }else{
            System.out.println("Essa turma nao existe...");
        }
    }
    
    // Metodo Principal
    public static void main(String[] args) throws IOException {
        int repetidor=1;
        int escolha;
        Main obj = new Main();
        Scanner entrada = new Scanner(System.in);
        
        while(repetidor==1){
            System.out.println("Menu:");
            System.out.println("|1 - Cadastrar professor");
            System.out.println("|2 - Cadastrar estudante");
            System.out.println("|3 - Cadastrar turma");
            System.out.println("|4 - Vincular professor a uma turma");
            System.out.println("|5 - Vincular estudante a uma turma");
            System.out.println("|6 - Exibir estudantes e professores de uma turma");
            System.out.println("|7 - Sair");
            System.out.println("Escolha:");
            escolha = entrada.nextInt();
            
            switch(escolha){
                case 1:
                    obj.cadastrarProfessor();
                    break;
                case 2:
                    obj.cadastrarEstudante();
                    break;
                case 3:
                    obj.cadastrarTurma();
                    break;
                case 4:
                    System.out.println("d");
                    break;
                case 5:
                    System.out.println("e");
                    break;
                case 6:
                    System.out.println("f");
                    break;
                case 7:
                    System.out.println("Pressione Qualquer Tecla para finalizar...");
                    System.in.read();
                    repetidor=0;
                    entrada.close();
                    break;
                default:
            }
        }
    }
}

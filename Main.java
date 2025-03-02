package atividadediagnostica;

import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    private List<Curso> cursos = new ArrayList();
    private List<Professor> professores = new ArrayList();
    private List<Estudante> estudantes = new ArrayList();
    private List<Turma> turmas = new ArrayList();
    private List<Nota> notas = new ArrayList();
    private Log log = new Log();
    
    // Metodo Principal
    public static void main(String[] args) throws IOException {
        Main obj = new Main();
        int repetidor=1;
        int escolha;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("-{ MENU PRINCIPAL }------------------------------------------------:");
        System.out.println("|1 - Acessar menu do coordenador");
        System.out.println("|2 - Acessar menu do professor");
        System.out.println("|0 - Sair");
        System.out.println("Escolha:");
        escolha = entrada.nextInt();
            
        switch(escolha){
            case 1:
                obj.menuCoordenador();
                break;
            case 2:
                obj.menuProfessor();
                break;
            case 0:
                System.out.println("Pressione Qualquer Tecla para finalizar...");
                System.in.read();
                repetidor=0;
                entrada.close();
                break;
            default:
        }
    }
    
    //Menu do coordenador
    public void menuCoordenador() throws IOException{
        Main obj = new Main();
        obj.bancoDados();
        int repetidor=1;
        int escolha;
        Scanner entrada = new Scanner(System.in);
        obj.verificarCoordenador();
        
        log.adicionarMensagem("|Menu do coordenador foi acessado!");
        
        
        while(repetidor==1){
            System.out.println("");
            System.out.println("-{ MENU COORDENADOR }------------------------------------------------:");
            System.out.println("|1 - Cadastrar professor");
            System.out.println("|2 - Cadastrar curso");
            System.out.println("|3 - Cadastrar estudante");
            System.out.println("|4 - Cadastrar turma");
            System.out.println("|5 - Exibir estudantes e professores de uma turma");
            System.out.println("|6 - Vincular aluno a uma turma");
            System.out.println("-{ AREA DAS NOTAS }-");
            System.out.println("|7 - Cadastrar notas");
            System.out.println("|8 - Exibir notas e medias");
            System.out.println("|9 - Exibir dados escolares");
            System.out.println("|10 - Cadastrar notas recuperacao ");
            System.out.println("|11 - Exibir notas recuperacao");
            System.out.println("|12 - Exibir log das acoes");
            System.out.println("|0 - Sair");
            System.out.println("Escolha:");
            escolha = entrada.nextInt();
            
            switch(escolha){
                case 1:
                    System.out.println("");
                    obj.cadastrarProfessor();
                    break;
                case 2:
                    System.out.println("");
                    obj.cadastrarCurso();
                    break;
                case 3:
                    System.out.println("");
                    obj.cadastrarEstudante();
                    break;
                case 4:
                    System.out.println("");
                    obj.cadastrarTurma();
                    break;
                case 5:
                    System.out.println("");
                    obj.exibirTurmas();
                    break;
                case 6:
                    System.out.println("");
                    obj.vincularEstudante();
                break;
                case 7:
                    System.out.println("");
                    obj.cadastrarNotas();
                    break;
                case 8:
                    System.out.println("");
                    obj.exibirNotasMedia();
                break;
                case 9:
                    System.out.println("");
                    obj.exibirDadosEscolares();
                break;
                case 10:
                    System.out.println("");
                    obj.recuperaçãoNotas();
                break;
                case 11:
                    System.out.println("");
                    obj.exibirNotasRecuperacao();
                break;
                case 12:
                    System.out.println("");
                    obj.logAcoes();
                break;
                case 0:
                    System.out.println("Pressione Qualquer Tecla para finalizar...");
                    System.in.read();
                    repetidor=0;
                    entrada.close();
                    break;
                default:
            }
        }
    }
    
    //Menu do professor
    public void menuProfessor() throws IOException{
        Main obj = new Main();
        obj.bancoDados();
        int repetidor=1;
        int escolha;
        Scanner entrada = new Scanner(System.in);
        
        log.adicionarMensagem("|Menu do professor foi acessado!");
        
        while(repetidor==1){
            System.out.println("");
            System.out.println("-{ MENU PROFESSOR }------------------------------------------------:");
            System.out.println("|1 - Cadastrar notas");
            System.out.println("|2 - Exibir notas e medias");
            System.out.println("|3 - Exibir dados escolares");
            System.out.println("|4 - Cadastrar notas recuperacao");
            System.out.println("|5 - Exibir notas recuperacao");
            System.out.println("|0 - Sair");
            System.out.println("Escolha:");
            escolha = entrada.nextInt();
            
            switch(escolha){
                case 1:
                    System.out.println("");
                    obj.cadastrarNotas();
                    break;
                case 2:
                    System.out.println("");
                    obj.exibirNotasMedia();
                    break;
                case 3:
                    System.out.println("");
                    obj.exibirDadosEscolares();
                    break;
                case 4:
                    System.out.println("");
                    obj.recuperaçãoNotas();
                break;
                case 5:
                    System.out.println("");
                    obj.exibirNotasRecuperacao();
                break;
                case 0:
                    System.out.println("Pressione Qualquer Tecla para finalizar...");
                    System.in.read();
                    repetidor=0;
                    entrada.close();
                    break;
                default:
            }
        }
    }
    
    //Método CadastrarCurso
    public void cadastrarCurso() throws IOException{
        if (professores.isEmpty()) {
            System.out.println("Nenhum professor disponível.");
            System.out.println("Pressione Qualquer Tecla para Continuar...");
            System.in.read();
            return;
        }
        
        Scanner entrada =  new Scanner(System.in);
        
        System.out.println("Quantos cursos deseja cadastrar? ");
        int quantidade = entrada.nextInt();
        entrada.nextLine();
        
        for(int i=0; i<quantidade; i++){
            System.out.println("DADOS DO CURSO " + (i+1));
            System.out.println("Nome do curso: ");
            String nome = entrada.nextLine();
            boolean cursoExiste = cursos.stream().anyMatch(curso -> curso.getNome().equals(nome)); //verifica se esse curso já existe
            if(cursoExiste){
                System.out.println("Esse CPF ja existe dentro do sistema... Redirecionando para o Menu...");
                System.out.println("Pressione Qualquer Tecla para Continuar...");
                System.in.read();
                break;
            }else{
                System.out.println("Quantidade de Semestres: ");
                int semestres = entrada.nextInt();
                entrada.nextLine();
                
                //Selecionar um professor pra ser coordenador
                for (int j = 0; j < professores.size(); j++) {
                    System.out.println("|" + (j + 1) + " - " + professores.get(j).getNome());
                }

                int coordenadorIndex = -1;
                do {
                    System.out.print("Escolha um dos professores para ser coordenador: ");
                    while (!entrada.hasNextInt()) {
                        System.out.println("Por favor, insira um numero valido.");
                        entrada.next();
                    }
                    coordenadorIndex = entrada.nextInt() - 1;
                } while (coordenadorIndex < 0 || coordenadorIndex >= professores.size());
                entrada.nextLine();
                
                //atribuindo tudo
                cursos.add(new Curso(nome, semestres, professores.get(coordenadorIndex)));
                
                System.out.println("");
                System.out.println(professores.get(coordenadorIndex).getNome() + " agora eh coordenador do curso " + nome + "!");
                System.out.println("");
                
                log.adicionarMensagem("|Cadastro do curso [" + nome + "] foi realizado!");
                
                System.out.println("Cadastro do curso " + nome + " foi realizado com sucesso!");
                System.out.println("Pressione Qualquer Tecla para Continuar...");
                System.in.read();
            }
        }
    }
    
    //Método CadastrarProfessor
    public void cadastrarProfessor() throws IOException{
        Scanner entrada =  new Scanner(System.in);
        
        System.out.println("Quantos professores deseja cadastrar? ");
        int quantidade = entrada.nextInt();
        entrada.nextLine();
        
        for(int i=0; i<quantidade; i++){
            System.out.println("DADOS DO PROFESSOR " + (i+1));
            System.out.println("CPF: ");
            String cpf = entrada.nextLine(); 
            boolean professorExiste = professores.stream().anyMatch(professor -> professor.getCpf().equals(cpf));
            if(professorExiste){
                System.out.println("Esse CPF ja existe dentro do sistema... Redirecionando para o Menu...");
                System.out.println("Pressione Qualquer Tecla para Continuar...");
                System.in.read();
                break;
            }else{
                System.out.println("Nome: "); 
                String nome = entrada.nextLine();
                System.out.println("Endereco: ");
                String endereco = entrada.nextLine();
                System.out.println("Telefone: ");
                String telefone = entrada.nextLine();
                System.out.println("SIAPE: ");
                int SIAPE = entrada.nextInt();
                entrada.nextLine();
                
                log.adicionarMensagem("|Cadastro do professor [" + nome + "] foi realizado!");
                
                professores.add(new Professor(nome, cpf, endereco, telefone, SIAPE));
                System.out.println("Cadastro do professor " + nome + " foi realizado com sucesso!");
                System.out.println("Pressione Qualquer Tecla para Continuar...");
                System.in.read();
            }
        }
    }
    
    //Método CadastrarEstudante
    public void cadastrarEstudante() throws IOException{
        
        if (cursos.isEmpty()) {
            System.out.println("Nenhum curso disponível.");
            System.out.println("Pressione Qualquer Tecla para Continuar...");
            System.in.read();
            return;
        }
        
        Scanner entrada =  new Scanner(System.in);
        
        System.out.println("Quantos estudantes deseja cadastrar? ");
        int quantidade = entrada.nextInt();
        entrada.nextLine();
        
        for(int i=0; i<quantidade; i++){
            System.out.println("DADOS DO ESTUDANTE " + (i+1));
            System.out.println("CPF: ");
            String cpf = entrada.nextLine(); 
            boolean estudanteExiste = estudantes.stream().anyMatch(estudante -> estudante.getCpf().equals(cpf));
            if(estudanteExiste){
                System.out.println("Esse CPF ja existe dentro do sistema... Redirecionando para o Menu...");
                System.out.println("Pressione Qualquer Tecla para Continuar...");
                System.in.read();
                break;
            }else{
                System.out.println("Nome: "); 
                String nome = entrada.nextLine();
                System.out.println("Endereco: ");
                String endereco = entrada.nextLine();
                System.out.println("Telefone: ");
                String telefone = entrada.nextLine();
                System.out.println("Matricula: ");
                String matricula = entrada.nextLine();
                // SELECIONAR CURSO
                System.out.println("Selecione um curso:");
                for (int j = 0; j < cursos.size(); j++) {
                    System.out.println("|" + (j + 1) + " - " + cursos.get(j).getNome());
                }

                int cursoIndex = -1;
                do {
                    System.out.print("Escolha uma opção de curso: ");
                    while (!entrada.hasNextInt()) {
                        System.out.println("Por favor, insira um número válido.");
                        entrada.next();
                    }
                    cursoIndex = entrada.nextInt() - 1;
                } while (cursoIndex < 0 || cursoIndex >= cursos.size());
                entrada.nextLine();
                
                log.adicionarMensagem("|Cadastro do estudante [" + nome + "] foi realizado!");
                
                estudantes.add(new Estudante(nome, cpf, endereco, telefone, matricula, cursos.get(cursoIndex)));
                System.out.println("Cadastro do estudante " + nome + " foi realizado com sucesso!");
                System.out.println("Pressione Qualquer Tecla para Continuar...");
                System.in.read();
            }
        }
    }
    
    //Método CadastrarTurma
    public void cadastrarTurma() throws IOException{
        
        if (cursos.isEmpty()) {
            System.out.println("Nenhum curso disponível.");
            System.out.println("Pressione Qualquer Tecla para Continuar...");
            System.in.read();
            return;
        }
        if (professores.isEmpty()) {
            System.out.println("Nenhum professor disponível.");
            System.out.println("Pressione Qualquer Tecla para Continuar...");
            System.in.read();
            return;
        }
        if (estudantes.isEmpty()) {
            System.out.println("Nenhum estudante disponível.");
            System.out.println("Pressione Qualquer Tecla para Continuar...");
            System.in.read();
            return;
        }
        
        Scanner entrada =  new Scanner(System.in);
        
        System.out.println("Quantas turmas deseja cadastrar? ");
        int quantidade = entrada.nextInt();
        entrada.nextLine();
        
        for(int i=0; i<quantidade; i++){
            System.out.println("DADOS DA TURMA " + (i+1));
            System.out.println("Identificacao da Turma: ");
            String id_turma = entrada.nextLine(); 
            boolean turmaExiste = turmas.stream().anyMatch(turma -> turma.getId_turma().equals(id_turma));
            if(turmaExiste){
                System.out.println("Essa turma ja existe dentro do sistema... Redirecionando para o Menu...");
                System.out.println("Pressione Qualquer Tecla para Continuar...");
                System.in.read();
                break;
            }else{
                System.out.println("Semestre: "); 
                int semestre = entrada.nextInt();
                entrada.nextLine();
                
                // SELECIONAR CURSO
                System.out.println("Selecione um curso:");
                for (int j = 0; j < cursos.size(); j++) {
                    System.out.println("|" + (j + 1) + " - " + cursos.get(j).getNome());
                }

                int cursoIndex = -1;
                do {
                    System.out.print("Escolha uma opcao de curso: ");
                    while (!entrada.hasNextInt()) {
                        System.out.println("Erro... Por favor, insira um número válido.");
                        entrada.next();
                    }
                    cursoIndex = entrada.nextInt() - 1;
                } while (cursoIndex < 0 || cursoIndex >= cursos.size());
                entrada.nextLine();
                
                // SELECIONAR PROFESSOR
                System.out.println("Selecione um professor:");
                for (int j = 0; j < professores.size(); j++) {
                    System.out.println("|" + (j + 1) + " - " + professores.get(j).getNome());
                }

                int professorIndex = -1;
                do {
                    System.out.print("Escolha uma opção de curso: ");
                    while (!entrada.hasNextInt()) {
                        System.out.println("Erro... Por favor, insira um número válido.");
                        entrada.next();
                    }
                    professorIndex = entrada.nextInt() - 1;
                } while (professorIndex < 0 || professorIndex >= professores.size());
                entrada.nextLine();
                
                //armazenando turma (1)
                Turma turma = new Turma(id_turma);
                
                // LISTA DE ESTUDANTES
                System.out.println("Adicione estudantes à turma (digite o número correspondente ou 0 para parar):");
                while (true) {

                    for (int j = 0; j < estudantes.size(); j++) {
                        System.out.println((j + 1) + " - " + estudantes.get(j).getNome());
                    }
                    int estudanteIndex = entrada.nextInt() - 1;
                    if (estudanteIndex == -1) break;
                    if (estudanteIndex >= 0 && estudanteIndex < estudantes.size()) {
                        turma.adicionarEstudante(estudantes.get(estudanteIndex));
                    } else {
                        System.out.println("Estudante inválido.");
                    }
                }
                
                //armazenando turma (2)
                turma.setCurso(cursos.get(cursoIndex));
                turma.setSemestre(semestre);
                turma.setProfessor(professores.get(professorIndex));
                turmas.add(turma);
                
                log.adicionarMensagem("|Cadastro da turma [" + id_turma + "] foi realizado!");
                
                System.out.println("Cadastro da turma " + id_turma + " foi realizado com sucesso!");
                System.out.println("Pressione Qualquer Tecla para Continuar...");
                System.in.read();
            }
        }
    }
    
    //Método VincularEstudante
    public void vincularEstudante() throws IOException {
    if (turmas.isEmpty()) {
        System.out.println("Nenhuma turma disponível.");
        System.out.println("Pressione Qualquer Tecla para Continuar...");
        System.in.read();
        return;
    }

    Scanner entrada = new Scanner(System.in);
    
    System.out.println("Selecione a turma que deseja adicionar um estudante: ");
    for (int j = 0; j < turmas.size(); j++) {
        System.out.println((j + 1) + " - " + turmas.get(j).getId_turma());
    }
    
    int turmaIndex = entrada.nextInt() - 1;
    if (turmaIndex < 0 || turmaIndex >= turmas.size()) {
        System.out.println("Turma inválida.");
        return;
    }
    
    System.out.println("Turma selecionada!");
    System.out.println("Adicione estudantes à turma (digite o número correspondente ou 0 para parar):");
    
    while (true) {
        for (int j = 0; j < estudantes.size(); j++) {
            System.out.println((j + 1) + " - " + estudantes.get(j).getNome());
        }
        
        int estudanteIndex = entrada.nextInt() - 1;
        if (estudanteIndex == -1) break;
        
        if (estudanteIndex >= 0 && estudanteIndex < estudantes.size()) {
            Turma turma = turmas.get(turmaIndex);
            turma.adicionarEstudante(estudantes.get(estudanteIndex));
            System.out.println("Cadastro realizado com sucesso!");
            
            log.adicionarMensagem("|Vinculo do estudante [" + estudantes.get(estudanteIndex).getNome() + "] a turma [" + turmas.get(turmaIndex).getId_turma() + "] foi realizado!");
        } else {
            System.out.println("Estudante inválido.");
        }
    }

    System.out.println("Pressione Qualquer Tecla para Continuar...");
    System.in.read();
}
    
    //Método ExibirTurmas
    public void exibirTurmas() throws IOException {
        if (turmas.isEmpty()) {
            System.out.println("Nenhuma turma disponível.");
            System.out.println("Pressione Qualquer Tecla para Continuar...");
            System.in.read();
        } else {
            for (Turma turma : turmas) {
                turma.exibirTurma();
                log.adicionarMensagem("|Dados das turmas foram exibidos!");
            }
        }
    }
    
    // Método para atribuir notas
    public void cadastrarNotas() throws IOException {
        Scanner entrada = new Scanner(System.in);

        while (true) {
            System.out.println("Selecione o estudante que deseja atribuir a nota (digite 0 para cancelar):");

            for (int j = 0; j < estudantes.size(); j++) {
                System.out.println("| " + (j + 1) + " - " + estudantes.get(j).getNome());
            }

            int estudanteIndex = entrada.nextInt() - 1;

            if (estudanteIndex == -1) break;
            if (estudanteIndex >= 0 && estudanteIndex < estudantes.size()) {
                entrada.nextLine(); // Limpa o buffer

                try {
                    System.out.println("Insira as notas:");
                    System.out.print("Nota 1: ");
                    double nota1 = entrada.nextDouble();
                    System.out.print("Nota 2: ");
                    double nota2 = entrada.nextDouble();
                    System.out.print("Nota 3: ");
                    double nota3 = entrada.nextDouble();

                    // Cria um objeto Nota
                    Nota nota = new Nota(nota1, nota2, nota3);

                    // Adiciona a nota ao estudante selecionado
                    estudantes.get(estudanteIndex).adicionarNotas(nota);

                    System.out.println("Cadastro das notas foi realizado com sucesso!");
                    log.adicionarMensagem("|Notas [" + nota1 + ", " + nota2 + ", " + nota3 + "] do(a) estudante ["+ estudantes.get(estudanteIndex).getNome() +"] foram cadastradas!");
                    
                } catch (InputMismatchException e) {
                    System.out.println("Entrada inválida. Por favor, insira números válidos.");
                    entrada.next(); // Limpa o buffer
                }
                

                System.out.println("Pressione Qualquer Tecla para Continuar...");
                System.in.read();
            } else {
                System.out.println("Estudante inválido... Redirecionando para o Menu");
                System.out.println("Pressione Qualquer Tecla para Continuar...");
                System.in.read();
            }
        }
    }
    
    // Método ExibirNotasMedia
    public void exibirNotasMedia() throws IOException {
        while (true) {
            if (estudantes.isEmpty()) {
                System.out.println("Nenhum estudante cadastrado.");
                System.out.println("Pressione Qualquer Tecla para Continuar...");
               System.in.read();
                break;
            }

            for (Estudante estudante : estudantes) {
                System.out.print("-{ " + estudante.getNome() + " }---------------------");

                if (estudante.getNotas() != null && !estudante.getNotas().isEmpty()) {
                    estudante.estudanteNota();
                } else {
                    System.out.println("");
                    System.out.println("Nenhuma nota registrada.");
                    System.out.println("");
                }
            }
            
            log.adicionarMensagem("|Notas e Medias dos estudantes foram exibidas!");
            
            System.out.println("Pressione Qualquer Tecla para Continuar...");
            System.in.read();
            break;
        }
    }
    
    //Método ExibirDadosEscolares
    public void exibirDadosEscolares() throws IOException {
        if (estudantes.isEmpty()) {
            System.out.println("Nenhum estudante cadastrado.");
            System.out.println("Pressione Qualquer Tecla para Continuar...");
            System.in.read();
            return;
        }
    
        List<String> aprovados = new ArrayList<>();
        List<String> recuperacao = new ArrayList<>();
        List<String> reprovados = new ArrayList<>();
        List<String> semNotas = new ArrayList<>();

        for (Estudante estudante : estudantes) {
            if (estudante.getNotas() != null && !estudante.getNotas().isEmpty()) {
                Nota nota = estudante.getNotas().get(estudante.getNotas().size() - 1); // Pega a última nota
                String status = nota.getStatus();

                if(status.equals("Aprovado")) {
                    aprovados.add(estudante.getNome());
                } else if (status.equals("Recuperacao")) {
                    recuperacao.add(estudante.getNome());
                } else {
                    reprovados.add(estudante.getNome());
                }
            } else {
                semNotas.add(estudante.getNome());
            }
        }

        // Contadores
        int countAprovados = aprovados.size();
        int countRecuperacao = recuperacao.size();
        int countReprovados = reprovados.size();
        int countSemNotas = semNotas.size();

        // Exibir resultados
        System.out.println("Estudantes Aprovados: " + aprovados);
        System.out.println("(Total: " + countAprovados + ")");
        System.out.println("");
        System.out.println("Estudantes em Recuperacao: " + recuperacao);
        System.out.println("(Total: " + countRecuperacao + ")");
        System.out.println("");
        System.out.println("Estudantes Reprovados: " + reprovados);
        System.out.println("(Total: " + countReprovados + ")");
        System.out.println("");
        System.out.println("Estudantes Sem Notas: " + semNotas);
        System.out.println("(Total: " + countSemNotas + ")");
        System.out.println("");
        
        log.adicionarMensagem("|Dados escolares foram exibidos!");

        System.out.println("Pressione Qualquer Tecla para Continuar...");
        System.in.read(); 
    }
    
    //Método Recuperacao
    public void recuperaçãoNotas() {
        // Criar uma lista para armazenar estudantes em recuperação
        List<Estudante> estudantesEmRecuperacao = new ArrayList<>();

        // Filtrar estudantes em recuperação
        for (Estudante estudante : estudantes) {
            if (estudante.getNotas() != null && !estudante.getNotas().isEmpty()) {
                Nota ultimaNota = estudante.getNotas().get(estudante.getNotas().size() - 1);
                if (ultimaNota.getStatus().equals("Recuperacao")) {
                    estudantesEmRecuperacao.add(estudante);
                }
            }
        }
        // Se houver estudantes em recuperação, atribuir notas de recuperação
        if (!estudantesEmRecuperacao.isEmpty()) {
            Recuperacao recuperacao = new Recuperacao();
            recuperacao.atribuirNotaRecuperacao(estudantesEmRecuperacao);
        } else {
            System.out.println("Nenhum estudante em recuperacao.");
        }
    }
    
    //ExibirNotasRecuperacao
    public void exibirNotasRecuperacao() throws IOException {
        List<Estudante> estudantesEmRecuperacao = new ArrayList<>();

        // Primeiro, coletamos os estudantes em recuperação
        for (Estudante estudante : estudantes) {
            if (estudante.getNotas() != null && !estudante.getNotas().isEmpty()) {
                Nota ultimaNota = estudante.getNotas().get(estudante.getNotas().size() - 1);
                if (ultimaNota.getStatus().equals("Recuperacao")) {
                    estudantesEmRecuperacao.add(estudante);
                }
            }
        }
        // Se não houver estudantes em recuperação
        if (estudantesEmRecuperacao.isEmpty()) {
            System.out.println("Nenhum estudante em recuperacao.");
            return;
        }
        // Exibe a última nota dos estudantes em recuperação
        System.out.println("Notas Final dos estudantes em recuperacao:");
        for (Estudante estudante : estudantesEmRecuperacao) {
            Nota ultimaNota = estudante.getNotas().get(estudante.getNotas().size() - 1);
            String notaRecuperacao = (ultimaNota.getNotaRecuperacao() != null) ? String.valueOf(ultimaNota.getNotaRecuperacao()) : "Sem Nota";
            String status = (ultimaNota.getNotaRecuperacao() != null && ultimaNota.getNotaRecuperacao() >= 5.0) ? "Aprovado" : "Reprovado";
            
            System.out.println(estudante.getNome() + " - Nota Final: " + notaRecuperacao);
            System.out.println("(Status: " + status + ")");
        }
        log.adicionarMensagem("|Notas da recuperacao foram exibidas!");
        
        System.out.println("Pressione Qualquer Tecla para Continuar...");
        System.in.read();
    }
    
    //Método para exibir o Log
    public void logAcoes(){
        log.exibirMensagens();
    }
    
    //Método verificar coordenador
    public void verificarCoordenador(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Quem é você coordenador?");
        for (int j = 0; j < professores.size(); j++) {
            System.out.println("|" + (j + 1) + " - " + professores.get(j).getNome());
        }
        
        int professorIndex = entrada.nextInt() - 1;
        if (professorIndex >= 0 && professorIndex < professores.size()) {
            String nomeCoordenador = professores.get(professorIndex).getNome();
        
            // Define o nome do coordenador no log
            log.setCoordenadorNome(nomeCoordenador);
        
            System.out.println("Seja Muito Bem-Vindo Coordenador " + nomeCoordenador + "!");
        } else {
            System.out.println("Coordenador inválido... Redirecionando para o Menu");
        }
    }
    
    //Banco de Dados Auxiliar
    public void bancoDados() {
    // ESSE TRECHO É DE TESTE
    professores.add(new Professor("Luis Araujo", "666.666.666-66", "Rua F, Bairro F", "(66) 96666-6666", 244576));
    professores.add(new Professor("Mestre Yoda", "777.777.777-77", "Rua G, Bairro G", "(77) 97777-7777", 325078));
    
    cursos.add(new Curso("Linguagem de programacao", 3, professores.get(0)));
    cursos.add(new Curso("Estrutura de dados", 5, professores.get(1)));

    estudantes.add(new Estudante("Monica", "111.111.111-11", "Rua A, Bairro A", "(11) 91111-1111", "1111111", cursos.get(0)));
    estudantes.add(new Estudante("Magali", "222.222.222-22", "Rua B, Bairro B", "(22) 92222-2222", "2222222", cursos.get(1)));
    estudantes.add(new Estudante("Cebolinha", "333.333.333-33", "Rua C, Bairro C", "(33) 93333-33333", "3333333", cursos.get(0)));
    estudantes.add(new Estudante("Cascao", "444.444.444-44", "Rua D, Bairro D", "(44) 94444-4444", "4444444", cursos.get(1)));
    estudantes.add(new Estudante("Chico Bento", "555.555.555-55", "Rua E, Bairro E", "(55) 95555-5555", "5555555", cursos.get(0)));
    estudantes.add(new Estudante("Milena", "666.666.666-66", "Rua F, Bairro F", "(55) 99599-9559", "6666666", cursos.get(1)));

    Turma turma1 = new Turma("Turma 1");
    turma1.setCurso(cursos.get(0));
    turma1.setSemestre(1);
    turma1.setProfessor(professores.get(0));
    turma1.adicionarEstudante(estudantes.get(0));
    turma1.adicionarEstudante(estudantes.get(2));
    turma1.adicionarEstudante(estudantes.get(4));
    turmas.add(turma1);
    
    Turma turma2 = new Turma("Turma 2");
    turma2.setCurso(cursos.get(1));
    turma2.setSemestre(3);
    turma2.setProfessor(professores.get(1));
    turma2.adicionarEstudante(estudantes.get(1));
    turma2.adicionarEstudante(estudantes.get(3));
    turma2.adicionarEstudante(estudantes.get(5));
    turmas.add(turma2);
    
    System.out.println("Dados adicionados com sucesso!");
    
    }
}

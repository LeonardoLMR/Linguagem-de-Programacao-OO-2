package atividadediagnostica;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Log {
    private List<String> mensagens;
    private String coordenadorNome;

    public void setCoordenadorNome(String coordenadorNome) {
        this.coordenadorNome = coordenadorNome;
    }
    

    // Construtor
    public Log() {
        this.mensagens = new ArrayList<>();
    }

    // Método para adicionar uma mensagem ao log
    public void adicionarMensagem(String mensagem) {
        mensagens.add(mensagem);
        salvarLogEmArquivo(mensagem); // Salva a mensagem em um arquivo
    }

    // Método para exibir todas as mensagens do log
    public void exibirMensagens() {
        if (mensagens.isEmpty()) {
            System.out.println("Nenhuma ação registrada.");
            return;
        }
        System.out.println("-{ Acoes Registradas }--------------------------------");
        for (String mensagem : mensagens) {
            System.out.println(coordenadorNome + " " + mensagem);
        }
    }

    // Método para salvar mensagens em um arquivo
    private void salvarLogEmArquivo(String mensagem) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("log.txt", true))) {
            writer.write(mensagem);
            writer.newLine();
        } catch (IOException e) {
            System.out.println("Erro ao salvar o log: " + e.getMessage());
        }
    }
}
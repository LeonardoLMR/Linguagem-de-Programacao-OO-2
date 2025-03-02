package atividadediagnostica;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Recuperacao {
    Scanner entrada = new Scanner(System.in);
    private Log log = new Log();

    public void atribuirNotaRecuperacao(List<Estudante> estudantesEmRecuperacao) {

        for (Estudante estudante : estudantesEmRecuperacao) {
            System.out.println("Digite a nota de recuperacao para " + estudante.getNome() + ": ");
            double notaRecuperacao = entrada.nextDouble();

            // Adiciona a nota de recuperação
            Nota ultimaNota = estudante.getNotas().get(estudante.getNotas().size() - 1); // Pega a última nota
            ultimaNota.setNotaRecuperacao(notaRecuperacao);

            // Verifica o status com a nota de recuperação
            if (notaRecuperacao >= 5.0) {
                System.out.println(estudante.getNome() + " foi aprovado com a nota de recuperacao.");
                // Aqui você pode definir o status do estudante se necessário
            } else {
                System.out.println(estudante.getNome() + " foi reprovado com a nota de recuperacao.");
            }
            log.adicionarMensagem("|Nota de Recuperaçao [" + notaRecuperacao + "] atribuida ao aluno: " + estudante.getNome());
        }
    }
}

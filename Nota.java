package atividadediagnostica;

public class Nota {
    // Atributos
    private double nota1;
    private double nota2;
    private double nota3;
    private double media;
    private String status;
    private Double notaRecuperacao;


    public Nota(double nota1, double nota2, double nota3) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        calcularMedia();
        definirStatus();
        this.notaRecuperacao = notaRecuperacao;
    }

    // Cálculo da média
    private void calcularMedia() {
        this.media = (nota1 + nota2 + nota3) / 3;
    }

    // Definindo status
    private void definirStatus() {
        if (media >= 7) {
            this.status = "Aprovado";
        } else if (media >= 2.5) {
            this.status = "Recuperacao";
        } else {
            this.status = "Reprovado";
        }
    }

    // Getters
    public double getNota1() {
        return nota1;
    }
    public double getNota2() {
        return nota2;
    }
    public double getNota3() {
        return nota3;
    }
    public double getMedia() {
        return media;
    }
    public String getStatus() {
        return status;
    }
    
    // Getters e Setters
    public Double getNotaRecuperacao() {
        return notaRecuperacao;
    }
    public void setNotaRecuperacao(Double notaRecuperacao) {
        this.notaRecuperacao = notaRecuperacao;
    }
    

    public void exibirDados() {
        System.out.println("");
        System.out.println("|Nota 1: " + getNota1());
        System.out.println("|Nota 2: " + getNota2());
        System.out.println("|Nota 3: " + getNota3());
        System.out.println("|Media: " + getMedia());
        System.out.println("|Status: " + getStatus());
        System.out.println("");
    }
}

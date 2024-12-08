package atividadediagnostica;

public class Estudantes{
    //Atributo
    public String matricula;
    Cursos curso = new Cursos();

    //Getter e Setter
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    public void MostrarDados(){
        System.out.println("Professor(a): ");
        System.out.println("CPF: ");
        System.out.println("Endereco: ");
        System.out.println("Telefone: ");
        System.out.println("Matricula: ");
    }
}

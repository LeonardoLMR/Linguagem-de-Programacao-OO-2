package atividadediagnostica;

public class Professores{
    //Atributos
    public int SIAPE;
    
    //Getter e Setter
    public int getSIAPE() {
        return SIAPE;
    }
    public void setSIAPE(int SIAPE) {
        this.SIAPE = SIAPE;
    }
    
    public void MostrarDados(){
        System.out.println("Professor(a): ");
        System.out.println("CPF: ");
        System.out.println("Endereco: ");
        System.out.println("Telefone: ");
        System.out.println("SIAPE: ");
    }
}

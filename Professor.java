package atividadediagnostica;

public class Professor extends Pessoa{
    //Atributos
    public int SIAPE;
    
    //construtor
    public Professor(String nome, String cpf, String endereco, String telefone, int SIAPE){
        super(nome, cpf, endereco, telefone);
        this.SIAPE = SIAPE;
    }
    
    //Getter e Setter
    public int getSIAPE() {
        return SIAPE;
    }
    public void setSIAPE(int SIAPE) {
        this.SIAPE = SIAPE;
    }
    
    @Override
    public void exibirDados(){
        System.out.println("|Professor: " + getNome());
        System.out.println("|CPF: " + getCpf());
        System.out.println("|Endereco: " + getEndereco());
        System.out.println("|Telefone: " + getTelefone());
        System.out.println("|SIAPE: " + getSIAPE());
        System.out.println("");
    }
}

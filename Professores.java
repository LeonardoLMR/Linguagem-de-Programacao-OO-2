package Atividade1;

import java.util.ArrayList;

public class Professores extends Pessoa {
    ArrayList<Integer> SIAPE = new ArrayList();

    public ArrayList<Integer> getSIAPE() {
        return SIAPE;
    }

    public void setSiapes(ArrayList<Integer> SIAPE) {
        this.SIAPE = SIAPE;
    }

    public Professores(String nomes, String cpfs, String enderecos, String telefones) {
        super(nomes, cpfs, enderecos, telefones);
    }
    
    public static void ImprimirTabela(){
        System.out.println("Professor(a): ");
        System.out.println("CPF: ");
        System.out.println("Rua: ");
        System.out.println("Bairro: ");
        System.out.println("Telefone: ");
        System.out.println("SIAPE: ");
    }
}
package Atividade1;

import java.util.ArrayList;

public class Pessoa {
    ArrayList<String> nomes =  new ArrayList();
    ArrayList<String> cpfs =  new ArrayList();
    ArrayList<String> enderecos =  new ArrayList();
    ArrayList<String> telefones =  new ArrayList();

    public ArrayList<String> getNomes() {
        return nomes;
    }
    public void setNomes(ArrayList<String> nomes) {
        this.nomes = nomes;
    }

    public ArrayList<String> getCpfs() {
        return cpfs;
    }
    public void setCpfs(ArrayList<String> cpfs) {
        this.cpfs = cpfs;
    }

    public ArrayList<String> getEnderecos() {
        return enderecos;
    }
    public void setEnderecos(ArrayList<String> enderecos) {
        this.enderecos = enderecos;
    }

    public ArrayList<String> getTelefones() {
        return telefones;
    }
    public void setTelefones(ArrayList<String> telefones) {
        this.telefones = telefones;
    }

    public Pessoa(String nomes, String cpfs, String enderecos, String telefones){
        this.nomes.add(nomes);
        this.cpfs.add(cpfs);
        this.enderecos.add(enderecos);
        this.telefones.add(telefones);
    }
}

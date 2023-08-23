package SegundaAula;

public class Pessoa {
    private String nome;
    private String cpf;
    private int anoNasc;

    public Pessoa() {
        this.nome = "Sem nome";
        this.cpf = "sem cpf";
        this.anoNasc = -99;
    }

    public void setNome (String nome) {
        this.nome = nome;
    }

    public void setCpf (String cpf) {
        this.cpf = cpf;
    }

    public void setAnoNasc (int anoNasc) {
        this.anoNasc = anoNasc;
    }

    public void imprimeDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Cpf: " + cpf);
        System.out.println("Ano: " + anoNasc);
    }
}
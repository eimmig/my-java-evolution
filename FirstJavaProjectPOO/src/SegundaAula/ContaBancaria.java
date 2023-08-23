package SegundaAula;

public class ContaBancaria {
    private String nome;
    private double saldo;

    public ContaBancaria(String nome, double saldo) {
        this.nome = nome;
        this.saldo = saldo;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void depositar(double quantia) {
        this.saldo += quantia;
    }

    public void retirada(double quantia) {
        if (this.saldo >= quantia) {
            this.saldo -= quantia;
        }
    }

    public String toString() {
        return "Nome: " + this.nome + " Saldo: " + this.saldo;
    }

    public void recebeDe (ContaBancaria contaTransferencia, double quantia) {
        this.depositar(quantia);
        contaTransferencia.retirada(quantia);
    }
}

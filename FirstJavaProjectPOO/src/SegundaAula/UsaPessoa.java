package SegundaAula;

import SegundaAula.Pessoa;

public class UsaPessoa {
    public static void main (String[] Args) {
        Pessoa Ana = new Pessoa();
        Ana.imprimeDados();

        Ana.setNome("Ana daora");
        Ana.setCpf("123.456.789-00");
        Ana.setAnoNasc(2002);

        Ana.imprimeDados();
    }
}
package TerceiraAula;

public class UsaComplexo {
    public static void main(String[] args) {
        Complexo c1 = new Complexo(6.0, 3.0);
        Complexo c2 = new Complexo();

        c2.inicializaNumero(4.0, 2.0);

        c1.imprimeNumero();
        c2.imprimeNumero();

        Complexo soma = c1.soma(c2);
        Complexo subtracao = c1.subtrai(c2);
        Complexo multiplicacao = c1.multiplica(c2);
        Complexo divisao = c2.divide(c1);

        soma.imprimeNumero();
        subtracao.imprimeNumero();
        multiplicacao.imprimeNumero();
        divisao.imprimeNumero();

        System.out.println(c1.eIgual(c2) ? "E igual" : "E diferente");

    }
}

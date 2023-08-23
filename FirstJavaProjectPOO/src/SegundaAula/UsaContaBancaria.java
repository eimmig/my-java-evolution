package SegundaAula;

public class UsaContaBancaria {
    public static void main (String[] args) {
        ContaBancaria fred = new ContaBancaria("Fred", 1000);
        ContaBancaria richard = new ContaBancaria("Richard", 2000);
        richard.retirada(500);
        fred.depositar(500);

        System.out.println(fred);
        System.out.println(richard);

        richard.recebeDe(fred, 1200);

        System.out.println(fred);
        System.out.println(richard);
    }
}

package fundamentos.exeption;

import java.io.IOException;
import java.lang.Math;

public class subtracao {
    public static void main(String[] args) throws IOException {

        int num1, num2, resultado;

        num1 = random_int(-5, 15);
        num2 = random_int(-5, 15);

        try {
            primeiroNumero.validaPrimeiroNumero(num1);
        } catch (primeiroNumero e) {
            System.out.printf("O primeiro número não pode ser menor que 0");
            return;
        }
        try {
            segundoNumero.validaSegundoNumero(num2);
        } catch (segundoNumero e) {
            System.out.printf("O segundo número não pode ser maior que 10");
            return;
        }
        resultado = num1 - num2;
        System.out.println(resultado);
    }
    public static int random_int(int Min, int Max)
    {
        return (int) (Math.random()*(Max-Min))+Min;
    }
}

package fundamentos.exeption;

public class primeiroNumero extends Exception {
    static boolean validaPrimeiroNumero(float number) throws primeiroNumero {
        if(number < 0){
            throw new primeiroNumero();
        }
        return true;
    }
}

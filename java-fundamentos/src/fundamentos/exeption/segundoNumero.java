package fundamentos.exeption;

public class segundoNumero extends Exception {
    static boolean validaSegundoNumero(float number) throws segundoNumero {
        if(number > 10){
            throw new segundoNumero();
        }
        return true;
    }
}

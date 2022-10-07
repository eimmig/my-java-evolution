import calculadora.Calculadora;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {
    @DisplayName("Test METODO SOMAR")
    @Test
    void testSomar() {
       int expectativa = 7;
       Calculadora calc = new Calculadora();
       double resultado  = calc.somar(4,3);
        Assertions.assertEquals(expectativa,resultado);
    }
}


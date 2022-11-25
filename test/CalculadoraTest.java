import static org.junit.Assert.assertEquals;

import org.junit.*;

public class CalculadoraTest {

    Calculadora calculadora = new Calculadora();

    @Test
    public void testSoma() {
        assertEquals(25, calculadora.somar(10, 15));
    }

    @Test
    public void testSubtrair(){
        assertEquals(30, calculadora.subtrair(50, 20));
    }
    
}

import static org.junit.Assert.assertEquals;

import org.junit.*;
import junit.framework.TestCase;

public class CalculadoraTest  extends TestCase{

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

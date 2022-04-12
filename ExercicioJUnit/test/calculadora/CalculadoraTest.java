
package calculadora;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;




public class CalculadoraTest {
    
    Calculadora calculadora = new Calculadora();
    
    @Test
    public void testaSoma() {
        assertEquals(358, calculadora.soma(157, 201));
    }
    
    @Test
    public void testaSubtracao() {
        assertEquals(100, calculadora.subtracao(500, 400));
    }
    
    @Test
    public void testaMultiplicacao() {
        assertEquals(350, calculadora.multiplicacao(70, 5));
    }
    
    @Test
    public void testaDivisao() {
        assertEquals(50, calculadora.divisao(350, 7));
        
        
        try {
            calculadora.divisao(12, 0);
            fail("Exceção não foi lançada");
        } catch (Exception e) {
            assertTrue(true);
        }
    }
    
        @Test
    public void testaSomatorio() {
        assertEquals(55, calculadora.somatoria(10));
    }
    
        @Test
    public void testaPositivo() {
        assertTrue(calculadora.ehPositivo(12));
        assertFalse(calculadora.ehPositivo(-12));
        
    }
    
        @Test
    public void testaCompara() {
        assertEquals(-1, calculadora.compara(5, 18));
        assertEquals(1, calculadora.compara(18, 5));
        assertEquals(0, calculadora.compara(18, 18));
    }
}

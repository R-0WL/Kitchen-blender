import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.*;

public class LicuadoraVelocidadTest {

    @Test
    public void testAumentarVelocidad() {
        Licuadora licuadora = new Licuadora();
        
        // Caso 1: No se puede aumentar velocidad si está apagada
        licuadora.setEncendida(false);
        Assert.assertThrows(UnsupportedOperationException.class, licuadora::aumentarVelocidad);
        
        // Caso 2: Aumentar velocidad cuando está encendida
        licuadora.setLlena(true);
        licuadora.encender();
        licuadora.aumentarVelocidad();
        Assert.assertEquals(2, licuadora.getVelocidad());
        
       // Caso 3: Límite de velocidad
       licuadora.setVelocidad(9);
       licuadora.aumentarVelocidad();
       Assert.assertEquals(10, licuadora.getVelocidad());
       Assert.assertThrows(UnsupportedOperationException.class, licuadora::aumentarVelocidad);
    }
}

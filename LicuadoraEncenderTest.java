import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class LicuadoraEncenderTest {
     @Test
    public void testEncender() {
        Licuadora licuadora = new Licuadora();
        
        // Caso 1: No debe encender si no está llena
        licuadora.setEncendida(false);
        licuadora.setLlena(false);
        licuadora.encender();
        assertFalse(licuadora.getEncendida());
        assertEquals(0, licuadora.getVelocidad());

        // Caso 2: Debe encender si está llena
        licuadora.setLlena(true);
        licuadora.encender();
        assertTrue(licuadora.getEncendida());
        assertEquals(1, licuadora.getVelocidad());

        // Caso 3: Apagar la licuadora
        licuadora.encender();
        assertFalse(licuadora.getEncendida());
        assertEquals(0, licuadora.getVelocidad());
    }
}

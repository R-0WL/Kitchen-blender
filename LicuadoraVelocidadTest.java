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
        for (int i = 0; i < 9; i++) {
            licuadora.aumentarVelocidad();
        }
        Assert.assertEquals(10, licuadora.getVelocidad());
        Assert.assertThrows(UnsupportedOperationException.class, licuadora::aumentarVelocidad);
    }
}

import org.junit.*;


public class EncenderTest {

    @Test
    public void testEncender() {
        Licuadora licuadora = new Licuadora();
        
        // Caso 1: No debe encender si no está llena
        licuadora.setEncendida(false);
        licuadora.setLlena(false);
        licuadora.encender();
        Assert.assertFalse(licuadora.getEncendida());
        Assert.assertEquals(0, licuadora.getVelocidad());

        // Caso 2: Debe encender si está llena
        licuadora.setLlena(true);
        licuadora.encender();
        Assert.assertTrue(licuadora.getEncendida());
        Assert.assertEquals(1, licuadora.getVelocidad());

        // Caso 3: Apagar la licuadora
        licuadora.encender();
        Assert.assertFalse(licuadora.getEncendida());
        Assert.assertEquals(0, licuadora.getVelocidad());
    }
}
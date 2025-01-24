import org.junit.*;

public class LicuadoraLlenadoTest {

    @Test
    public void testLlenar() {
        Licuadora licuadora = new Licuadora();
        
        // Caso 1: Llenado exitoso cuando está vacía
        licuadora.setLlena(false);
        licuadora.llenar();
        Assert.assertTrue(licuadora.getLlena());
        
        // Caso 2: Intentar llenar cuando ya está llena
        Assert.assertThrows(UnsupportedOperationException.class, licuadora::llenar);
    }
}

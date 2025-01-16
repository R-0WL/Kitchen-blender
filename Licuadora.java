public class Licuadora implements ILicuadora {
    private int velocidad;
    private boolean lleno;
    private String ASCCIKitchenBlender;
    private String NOTFULL_BLENDER;
    private String Overflowed;


    /**
     * Pausa la ejecución durante X milisegundos.
     * @param milisegundos El número de milisegundos que se quiere esperar.
     */
    public static void esperar(int milisegundos){
        try {
            Thread.sleep(milisegundos);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void reducirVelocidad(){
        if (velocidad>0){
            velocidad--;
            System.out.println("Velocidad reducida a:" + velocidad);
        }
        else {
            System.out.println("Ninguna velocidad delimitada");
        }
    }

    //This method indicates that it starts to liquefy; do not rename, because it was accepted as a group.
    public void licuar() {
        if (!lleno && velocidad == 0){
            System.out.println("Llena la licuadora y/o elige una velocidad para poder empezar a licuar");
        }
        else {
            int tiempoEspera = 110 - (velocidad * 10);
            for (int i = 1; i<=100; i++) {

                String ASCCIKitchenBlender = """
                               _______
                              /       \
                             /         \
                            |   UVG'S   |
                            |  BLENDER  |
                            |           |     Licuando ...  %d
                            |___________|
                                || ||
                                (   )
                                |   |
                               /     \
                              |_______|
                        
                        """;
                System.out.printf(ASCCIKitchenBlender, i);

                esperar(tiempoEspera);

            }

        }
    }

    @Override
    public void encender(){
        this.velocidad = 0;
        this.lleno = false;
        System.out.println("Licuadora encendida");
    }

    @Override
    public void llenar() {
        System.out.println("Introduzca ");
    }

    @Override
    public void aumentarVelocidad() {
        if (velocidad<10){
            velocidad++;
            System.out.println("Velocidad aumentada a:" + velocidad);
        }
        else {
            System.out.println("Velocidad máxima alcanzada");
        }

    }

    @Override
    public int consultarVelocidad() {
        return velocidad;
    }

    @Override
    public boolean consultarLlenado() {
        return lleno;
    }

    @Override
    public void vaciar() {

    }
}

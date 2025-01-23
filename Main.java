import java.util.Scanner;

/**
 * Universidad del Valle de Guatemala
 * Autor: Adrian Penagos, Luis Lee y René Abella
 * Fecha: 16 de enero de 2025
 * Clase principal para probar la Licuadora.
 */
public class Main {
    public static void main(String[] args) {
        Licuadora licuadora = new Licuadora();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Menú de Licuadora ---");
            System.out.println("1. Encender/Apagar");
            System.out.println("2. Llenar");
            System.out.println("3. Aumentar Velocidad");
            System.out.println("4. Consultar Velocidad");
            System.out.println("5. Consultar Estado de Llenado");
            System.out.println("6. Vaciar");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    licuadora.encender();
                    if (licuadora.getEncendida()==true) {
                        System.out.println("Licuadora encendida. Velocidad inicial: " + licuadora.getVelocidad());
                    } else { 
                        if (licuadora.getLlena()==false){
                            System.out.println("La licuadora no se puede encender a menos que esté llena");
                        } else {
                            System.out.println("Licuadora apagada.");
                    }
                        
                    }
                    break;

                case 2:
                    try {
                        licuadora.llenar();
                        System.out.println("Licuadora llena.");
                    } catch (UnsupportedOperationException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 3:
                    try {
                        licuadora.aumentarVelocidad();
                        System.out.println("Velocidad aumentada a: " + licuadora.getVelocidad());
                    } catch (UnsupportedOperationException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 4:
                    System.out.println("Velocidad actual: " + licuadora.consultarVelocidad());
                    break;

                case 5:
                    System.out.println("Estado de llenado: " + (licuadora.consultarLlenado() ? "Llena" : "Vacía"));
                    break;

                case 6:
                    try {
                        licuadora.vaciar();
                        System.out.println("Licuadora vaciada.");
                        if (licuadora.getEncendida()==true){
                            System.out.println("Licuadora apagada."); 
                        }
                    } catch (UnsupportedOperationException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 7:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
                    break;
            }

        } while (opcion != 7);

        scanner.close();
    }
}

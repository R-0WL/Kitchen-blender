/**
 * Universidad del Valle de Guatemala
 * Autor: Adrian Penagos, Luis Lee y René Abella
 * Fecha: 16 de enero de 2025
 * Clase Licuadora que implementa la interfaz Interfaz.
 */
public class Licuadora implements Interfaz {
    // Atributos
    private boolean encendida;
    private boolean llena;
    private int velocidad;

    // Constructor
    public Licuadora() {
        this.encendida = false;
        this.llena = false;
        this.velocidad = 0;
    }

    // Getters y Setters
    public boolean getEncendida() {
        return encendida;
    }

    public void setEncendida(boolean encendida) {
        this.encendida = encendida;
    }

    public boolean getLlena() {
        return llena;
    }

    public void setLlena(boolean llena) {
        this.llena = llena;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    // Método que permite encender y apagar la licuadora
    @Override
    public void encender() {
        if (encendida == false) {
            encendida = true;
            velocidad = 1; //  0 = no encendido
        } else {
            velocidad = 0;
            encendida = false;
        }
    }

    @Override
    public void llenar() {
        if (llena == false) {
            llena = true;
        } else {
            throw new
            UnsupportedOperationException("La licuadora ya está llena");
        }
    }

    @Override
    public void aumentarVelocidad() {
        if (encendida == true) {
            velocidad++;
        } else {
            throw new
            UnsupportedOperationException("Licuadora apagada");
        }
    }

    //Retorna la velocidad actual de la licuadora
    @Override
    public int consultarVelocidad() {
        return velocidad;
    }

    //True or false llena
    @Override
    public boolean consultarLlenado() {
        return llena;
    }


    @Override
    public void vaciar() {
        if (llena == true) {
            llena = false;
        } else {
            throw new
            UnsupportedOperationException("La licuadora ya está vacía");
        }
    }

}


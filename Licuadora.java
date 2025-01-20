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

    // Método que permite encender y apagar la licuadora
    @Override
    public void encender() {
        if (!encendida) {
            encendida = true;
            velocidad = 0; // Reseteamos la velocidad al encender
        } else {
            encendida = false;
        }
    }

    @Override
    public void llenar() {
        if (!llena) {
            llena = true;
        } else {
            //algo?
        }
    }

    @Override
    public void aumentarVelocidad() {
        if (encendida) {
            velocidad++;
        } else {
            //Tengo que ver aún
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
        if (llena) {
            llena = false;
        } else {
            //Debería retornar algún valor o que se quede como void? 
        }
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
}


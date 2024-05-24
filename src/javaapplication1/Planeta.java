package javaapplication1;

public class Planeta {
    String nombre;
    float radio;
    float distancias;
    float periodo;
    float temperatura;
    String tipo;
    int satelites;

    public Planeta(String nombre, float radio, float distancias, float periodo, float temperatura, String tipo, int satelites) {
        this.nombre = nombre;
        this.radio = radio;
        this.distancias = distancias;
        this.periodo = periodo;
        this.temperatura = temperatura;
        this.tipo = tipo;
        this.satelites = satelites;
    }

    public String getNombre() {
        return nombre;
    }

    public float getRadio() {
        return radio;
    }

    public float getDistancias() {
        return distancias;
    }

    public float getPeriodo() {
        return periodo;
    }

    public float getTemperatura() {
        return temperatura;
    }

    public String getTipo() {
        return tipo;
    }

    public int getSatelites() {
        return satelites;
    }
    
    
}


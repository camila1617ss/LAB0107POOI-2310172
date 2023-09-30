
package figurasgeometricas;

public class Circulo extends Figura{
    private double radio;
    private String color;

    public Circulo(double radio, String color, String nombre) {
        super(nombre);
        this.radio = radio;
        this.color = color;
    }
    public double getRadio() {
        return radio;
    }
    public void setRadio(double radio) {
        this.radio = radio;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

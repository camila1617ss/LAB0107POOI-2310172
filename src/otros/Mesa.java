
package otros;

public class Mesa {
    private float ancho;
    private float altura;
    private String color;
    private String material;
    private String forma;

    public Mesa(float ancho, float altura, String color, String material, String forma) {
        this.ancho = ancho;
        this.altura = altura;
        this.color = color;
        this.material = material;
        this.forma = forma;
    }
    public float getAncho() {
        return ancho;
    }
    public void setAncho(float ancho) {
        this.ancho = ancho;
    }
    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }
    public String getForma() {
        return forma;
    }
    public void setForma(String forma) {
        this.forma = forma; 
}
}
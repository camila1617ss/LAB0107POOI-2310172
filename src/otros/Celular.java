
package otros;

public class Celular {
 private int numero;   
 private String marca;
 private String color;
 private String modelo;
 private String plan;

    public Celular(int numero, String marca, String color, String modelo, String plan) {
        this.numero = numero;
        this.marca = marca;
        this.color = color;
        this.modelo = modelo;
        this.plan = plan;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getPlan() {
        return plan;
    }
    public void setPlan(String plan) {
        this.plan = plan;
    }
}

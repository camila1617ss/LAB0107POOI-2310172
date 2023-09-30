
package figurasgeometricas;

public class Cuadrilatero extends Figura {

    Punto vertice1;
    Punto vertice2;
    Punto vertice3;
    Punto vertice4;

    public Cuadrilatero(Punto vertice1, Punto vertice2, Punto vertice3, Punto vertice4, String nombre) {
        super(nombre);
        this.vertice1 = vertice1;
        this.vertice2 = vertice2;
        this.vertice3 = vertice3;
        this.vertice4 = vertice4;
    }
    public boolean isRegular()
    {
    return comprobarRectangulo();
    }
    private boolean comprobarRectangulo()
    {
    return false;
    }    
    public double calcularArea() {
       
        return 0.0;
    }
    public Punto getVertice1() {
        return vertice1;
    }
    public void setVertice1(Punto vertice1) {
        this.vertice1 = vertice1;
    }
    public Punto getVertice2() {
        return vertice2;
    }
    public void setVertice2(Punto vertice2) {
        this.vertice2 = vertice2;
    }
    public Punto getVertice3() {
        return vertice3;
    }
    public void setVertice3(Punto vertice3) {
        this.vertice3 = vertice3;
    }
    public Punto getVertice4() {
        return vertice4;
    }
    public void setVertice4(Punto vertice4) {
        this.vertice4 = vertice4;
    }
    @Override
    public String toString() {
        return "Cuadrilatero: " + nombre + ", Vértices: " + vertice1 + ", " + vertice2 + ", " + vertice3 + ", " + vertice4;
    }
}

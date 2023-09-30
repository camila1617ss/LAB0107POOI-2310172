
package figurasgeometricas;


public class Rectangulo extends Cuadrilatero {

    public Rectangulo(Punto vertice1, Punto vertice2, Punto vertice3, Punto vertice4, String nombre) throws Exception {
        super(vertice1, vertice2, vertice3, vertice4, nombre);
        if (!isRegular()) {
            throw new Exception("Los vértices son incompatibles con el rectángulo.");
        }
        
    }
    public double area()  {
        
        return 0.0;
    }
     @Override
    public String toString() {
        return "Rectángulo: " + getNombre() + ", Vértices: " + getVerticesString();
    }

    private String getVerticesString() {
        return "(" + vertice1 + ", " + vertice2 + ", " + vertice3 + ", " + vertice4 + ")";
    }
}


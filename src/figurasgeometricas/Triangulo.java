
package figurasgeometricas;

public class Triangulo {
    private Punto vertice1;
    private Punto vertice2;
    private Punto vertice3;

    // Constructor por defecto
    public Triangulo() {
        this.vertice1 = new Punto();
        this.vertice2 = new Punto();
        this.vertice3 = new Punto();
    }

    // Constructor con parámetros
    public Triangulo(Punto vertice1, Punto vertice2, Punto vertice3) {
        this.vertice1 = vertice1;
        this.vertice2 = vertice2;
        this.vertice3 = vertice3;
    }

    // Método para calcular la distancia entre dos puntos
    private double calcularDistancia(Punto p1, Punto p2) {
        double dx = p1.getX() - p2.getX();
        double dy = p1.getY() - p2.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }

    // Método para calcular el perímetro del triángulo
    public double getPerimetro() {
        double lado1 = calcularDistancia(vertice1, vertice2);
        double lado2 = calcularDistancia(vertice2, vertice3);
        double lado3 = calcularDistancia(vertice3, vertice1);
        return lado1 + lado2 + lado3;
    }

    // Método para determinar el tipo de triángulo
    public String getTipo() {
        double lado1 = calcularDistancia(vertice1, vertice2);
        double lado2 = calcularDistancia(vertice2, vertice3);
        double lado3 = calcularDistancia(vertice3, vertice1);

        if (lado1 == lado2 && lado2 == lado3) {
            return "Equilátero";
        } else if (lado1 == lado2 || lado2 == lado3 || lado3 == lado1) {
            return "Isósceles";
        } else {
            return "Escaleno";
        }
    }

    // Método para calcular el área del triángulo (implementación necesaria)
    public double getArea() {
        // Debes implementar la fórmula para calcular el área de un triángulo
        // según los vértices proporcionados.
        return 0.0; // Dejado como ejercicio
    }

    // Método para verificar si el triángulo es regular
    public boolean isRegular() {
        double lado1 = calcularDistancia(vertice1, vertice2);
        double lado2 = calcularDistancia(vertice2, vertice3);
        double lado3 = calcularDistancia(vertice3, vertice1);

        return lado1 == lado2 && lado2 == lado3;
    }

    // Método toString para obtener información del triángulo
    @Override
    public String toString() {
        return "Triángulo [vértice1=" + vertice1 + ", vértice2=" + vertice2 + ", vértice3=" + vertice3 + "]";
    }
}
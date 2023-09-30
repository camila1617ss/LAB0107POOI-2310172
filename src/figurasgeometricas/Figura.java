
package figurasgeometricas;


public class Figura {
 protected String nombre;

    public Figura(String nombre) {
        this.nombre = nombre;
    }
    protected String getNombre() {
        return nombre;
    }
    protected void setNombre(String nombre) {
        this.nombre = nombre;
    }
   public double calcularArea()
   {
   // Debe ser implentado en las hijas
       return 0.0;
   }
    public boolean isRegular()
   {
   // Debe ser implentado en las hijas
       return false;
   }
}

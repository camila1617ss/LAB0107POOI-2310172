
package animales;

import java.util.ArrayList;
import java.util.List;

public class Gato extends Animal {
private List<String> vacunas;

    public Gato() {
        super();
        this.vacunas = new ArrayList<>();
    }
    public Gato(String nombre, String raza, String color, int edad) {
        super(nombre, raza, color, edad);
        this.vacunas = new ArrayList<>();
    }
    public List<String> getVacunas() {
        return vacunas;
    }
    public void addVacuna(String vacuna) {
        this.vacunas.add(vacuna);
    }
}

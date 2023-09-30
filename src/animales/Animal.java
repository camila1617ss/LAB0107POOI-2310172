
package animales;

public class Animal {

    private String nombre;
    private String raza;
    private String color;
    private int edad;

    public Animal(String nombre, String raza, String color, int edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
        this.edad = edad;
    }
    public Animal() {
    }
    public int getEdad() {
        return edad;
    
    }
    public String getTipoRaza() {
    return raza;
    
    } 
}

package persona;
public class Empleado extends Persona {

    private int salario;
    private int desempenio;

    public Empleado(int id, String nombre, String apellido, int salario, int desempenio) {
        super(id, nombre, apellido); // Llama al constructor de la clase base (Persona)
        this.salario = salario;
        this.desempenio = desempenio;
    }
    public int getSalario() {
        return salario;
    }
    public int getSalarioAnual() {
        return salario * 12;
    }
    public int getSalarioAnual(int desempenio) {
        if (desempenio >= 7 && desempenio <= 10) {
            return (int) (salario * 12 * 1.05); // Aumento del 5% para un desempeño entre 7 y 10
        } else if (desempenio >= 5 && desempenio < 7) {
            return (int) (salario * 12 * 1.02); // Aumento del 2% para un desempeño entre 5 y 7 
        } else if (desempenio >= 3 && desempenio < 5) {
            return (int) (salario * 12 * 1.01); // Aumento del 1% para un desempeño entre 3 y 5 
        } else {
            return salario * 12; // Valor predeterminado sin ajuste
        }
    }
}

package exercise7;

/**
 *
 * @author Ana Teresa
 */
public class Estudiantes extends Persona {

    private String carrera;
    private String carnee;

    public Estudiantes() {
    }

    public Estudiantes(String nombre, int edad, String carrera, String carné) {
        super(nombre, edad);
        this.carrera = carrera;
        this.carnee = carné;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getCarnee() {
        return carnee;
    }

    public void setCarnee(String carnee) {
        this.carnee = carnee;
    }

    @Override
    public String toString() {
        return "Estudiantes{" + super.toString() + "carrera: " + carrera + ", carné: " + carnee + '}';
    }

}

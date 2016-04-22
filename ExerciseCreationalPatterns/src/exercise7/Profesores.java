package exercise7;

/**
 *
 * @author Ana Teresa
 */
public class Profesores extends Persona {

    private String cargo;

    public Profesores() {

    }

    public Profesores(String nombre, int edad, String cargo) {
        super(nombre, edad);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Profesores{" + super.toString() + "cargo: " + cargo + '}';
    }

}

package exercise1;

/**
 * Clase básica con los atributos que tendrá cualquier objeto creado, tanto
 * decorado como sin decorar
 *
 * @author Ana Teresa
 */
public class Computer implements ComponentComputer {

    // establece los atributos que tendrá cualquier computadora creada
    private String nombre;
    private final String descripcion = "Computadora básica(estructura externa, disco duro, RAM, tarjeta madre, tarjeta de video): ";
    private final int precio = 100000;

    public Computer(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getDescripcion() {
        return nombre + "\n" + descripcion;
    }

    @Override
    public int getPrecio() {
        return precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}

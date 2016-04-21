package exercise1;

/**
 * Clase que decora, añade descripción y precio a la computadora básica, en
 * cuanto es instanciada
 *
 * @author Ana Teresa
 */
public class DVDburner_BluRay extends ComputerDecorator {

    private final String descripcion = " quemador DVD/BluRay ";
    private final int precio = 50000;
    private String descripcionAdicional;

    public DVDburner_BluRay(ComponentComputer component, String descripcionAdicional) {
        super(component);
        this.descripcionAdicional = descripcionAdicional;
    }

    @Override
    public String getDescripcion() {
        return super.getComponent().getDescripcion() + " + " + descripcion + " " + descripcionAdicional;
    }

    @Override
    public int getPrecio() {
        return super.getComponent().getPrecio() + precio;
    }

    public void setDescripcionAdicional(String descripcionAdicional) {
        this.descripcionAdicional = descripcionAdicional;
    }

    public String getDescripcionAdicional() {
        return descripcionAdicional;
    }

}

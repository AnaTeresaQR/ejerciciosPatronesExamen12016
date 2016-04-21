package exercise1;

/**
 * Clase que decora, añade descripción y precio a la computadora básica, en
 * cuanto es instanciada
 *
 * @author Ana Teresa
 */
public class SdCardReader extends ComputerDecorator {

    private final String descripcion = " lector de tarjeta sd ";
    private final int precio = 10000;
    private String descripcionAdicional;

    public SdCardReader(ComponentComputer component, String descripcionAdicional) {
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

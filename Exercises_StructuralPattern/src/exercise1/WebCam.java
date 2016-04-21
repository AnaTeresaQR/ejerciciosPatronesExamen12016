package exercise1;

/**
 * Clase que decora, añade descripción y precio a la computadora básica, en
 * cuanto es instanciada
 *
 * @author Ana Teresa
 */
public class WebCam extends ComputerDecorator {

    private final String descripcion = " Webcam ";
    private final int precio = 7000;
    private String descripcionAdicional;

    public WebCam(ComponentComputer component, String descripcionAdicional) {
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

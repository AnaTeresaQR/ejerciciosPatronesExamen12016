package ejercicio1;

import java.util.Date;

/**
 *
 * @author Ana Teresa
 */
public class Archivo extends Component {

    public Archivo(Date fecha, int tipo, String nombre) {
        super(fecha, tipo, nombre);
    }

    @Override
    public int calcularCantidadElementos() {
        return 0;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}

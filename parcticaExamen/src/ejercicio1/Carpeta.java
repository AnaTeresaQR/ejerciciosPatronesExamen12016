package ejercicio1;

import java.util.Date;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author Ana Teresa
 */
public class Carpeta extends Component {

    SortedSet<Component> lista;
    Strategy_Ordenar strategy;

    public Carpeta(Date fecha, int tipo, String nombre) {
        super(fecha, tipo, nombre);
        lista = new TreeSet<>();
    }

    @Override
    public int calcularCantidadElementos() {
        int calcularTotal = this.lista.size();
        Iterator<Component> it = lista.iterator();
        while (it.hasNext()) {
            Object temp = it.next();
            calcularTotal += ((Component) temp).calcularCantidadElementos();
        }
        return calcularTotal;
    }

    public void agregar(Component component) {
        lista.add(component);
    }

    public String imprimir() {
        String text = "";
        Iterator it = lista.iterator();
        while (it.hasNext()) {
            Object temp = it.next();
            if (temp instanceof Carpeta) {
                text += "\n\n" + ((Carpeta) temp).toString() + ((Carpeta) temp).imprimir();
            } else {
                text += "\n" + ((Component) temp).toString();
            }
        }
        return text;
    }

    public void setStrategy(Strategy_Ordenar strategy) {
        this.strategy = strategy;
    }

    public void ordenar() {
        this.lista = strategy.ordenar(lista);
    }
}
